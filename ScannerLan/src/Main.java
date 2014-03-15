/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ediar
 */
import java.util.Scanner;
class Main
{
    public static void main (String[] args)
        {
            LNScanner Scan = new LNScanner();
            Scanner Read = new Scanner(System.in);
            System.out.println("-----------------------------------------");
            System.out.println("scaner Lan de la clase C ");
             System.out.println("---------------------------------------");
            System.out.println("Seleccione la opcion realizar ");
            System.out.println("1.- Hosts en la red local: ");
            System.out.println("2.- Scanea un rango de hosts: ");
            System.out.println("3.- Nombre de host de una ip: ");
            int Op = Read.nextInt();
            switch(Op)
            {
                case 1:
                    System.out.println("iniciando scanner");
                    Scan.ScanAll();
                    break;
                case 2:
   
                    System.out.println("ingrese el rango de ips");
                    System.out.print("Primer Ip 192.168.1.");
                    int Start = Read.nextInt();
                    System.out.print("Ultimo Ip 192.168.1.");
                    int End = Read.nextInt();
                    System.out.println("iniciando scanner");
                    Scan.RangeScan(Start, End);
                    break;
                case 3:
                    System.out.println("Ingrese Ip:");
                    String IP = Read.next();
                    System.out.println("iniciando scanner");
                    Scan.HostName(IP);
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
        }
}