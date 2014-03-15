

package scanerip;

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
    public  String HostName(String IP)  {
            String dato ;
            try
                {
                    InetAddress Host = InetAddress.getByName(IP);
                    dato=String.valueOf(Host.getHostName())+" "+String.valueOf(Host.getLoopbackAddress());
//                        dato=;
                }
            catch(UnknownHostException UHE)
                {
                    dato=String.valueOf(UHE.toString());
                }
            return dato;
        }
   
    //recorre todo elsegmento de la red 192.168.1.256
    public  String ScanAll(){
        String dato = null;
            int Host = 1, Lives = 0;
            while(Host < 256)
                {
                    try
                        {
                            InetAddress in;
                            in = InetAddress.getByName("192.168.1."+Host);
                            if(in.isReachable(3000))
                                {
//                                    System.out.println("IP: 192.168.1."+Host+" Hostname: "+in.getHostName());
                                    Lives++;
                                    dato="IP: 192.168.1."+Host+" Hostname: "+in.getHostName()+"\n host vivos: "+String.valueOf(Lives);
                                }
                        }
                            catch(UnknownHostException UHE)
                                {
                                    dato=(UHE.toString());
                                    
                                }
                            catch(IOException IO)
                                {
                                    dato=(IO.toString());
                                }
                            Host++;
                }
                return     dato;
    }
   
    //rango de ip que recorre ejemplo 192.168.1.2 192.168.1.20
    public String RangeScan(int Start, int End) {
        
        String dato = null;
            int Host = Start, Lives = 0;
            while(Host <= End)
                {
                    try
                        {
                            InetAddress in;
                            in = InetAddress.getByName("192.168.1."+Host);
                            if(in.isReachable(3000))
                                {
                                   
                                    Lives++;
                                    dato= ("IP: 192.168.1."+Host+" Hostname: "+in.getHostName())+"\n Numero de hosts vivos: "+String.valueOf(Lives);
                                }
                        }
                            catch(UnknownHostException UHE)
                                {
                                    dato=(UHE.toString());
                                }
                            catch(IOException IO)
                                {
                                    dato=(IO.toString());
                                }
                            Host++;
                }
                     return dato;
        }
}