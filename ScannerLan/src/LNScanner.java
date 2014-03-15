/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author ediar
 */


public class LNScanner
{
    //ingresas ip devuelve el nombre  
    public static void HostName(String IP)
        {
            try
                {
                    InetAddress Host = InetAddress.getByName(IP);
                    System.out.println(Host.getHostName());
                    System.out.println(Host.getLoopbackAddress());
                }
            catch(UnknownHostException UHE)
                {
                    System.out.println(UHE.toString());
                }
        }
   
    //recorre todo elsegmento de la red 192.168.1.256
    public static void ScanAll()
        {
            int Host = 1, Lives = 0;
            while(Host < 256)
                {
                    try
                        {
                            InetAddress in;
                            in = InetAddress.getByName("192.168.1."+Host);
                            if(in.isReachable(3000))
                                {
                                    System.out.println("IP: 192.168.1."+Host+" Hostname: "+in.getHostName());
                                    Lives++;
                                }
                        }
                            catch(UnknownHostException UHE)
                                {
                                    System.out.println(UHE.toString());
                                }
                            catch(IOException IO)
                                {
                                    System.out.println(IO.toString());
                                }
                            Host++;
                }
                     System.out.println("Numero de hosts vivos: " +Lives);
    }
   
    //rango de ip que recorre ejemplo 192.168.1.2 192.168.1.20
    public static void RangeScan(int Start, int End)
        {
            int Host = Start, Lives = 0;
            while(Host <= End)
                {
                    try
                        {
                            InetAddress in;
                            in = InetAddress.getByName("192.168.1."+Host);
                            if(in.isReachable(3000))
                                {
                                    System.out.println("IP: 192.168.1."+Host+" Hostname: "+in.getHostName());
                                    Lives++;
                                }
                        }
                            catch(UnknownHostException UHE)
                                {
                                    System.out.println(UHE.toString());
                                }
                            catch(IOException IO)
                                {
                                    System.out.println(IO.toString());
                                }
                            Host++;
                }
                     System.out.println("Cantidad de Hosts en la red: " +Lives);
        }
}