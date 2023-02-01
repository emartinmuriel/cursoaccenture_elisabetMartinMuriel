package sockets.ejercicio3;

import java.net.InetAddress;

/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class PrInetAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ip = InetAddress.getByName("recursosformacion.com");	
			InetAddress ipMio = InetAddress.getLocalHost();
			
			System.out.println("Hostname de esta máquina: " + ipMio.getHostName());
			System.out.println("Ip máquina local: " + ipMio.getHostAddress());
			
		}catch (Exception e) {
			System.out.println();
		}
	}

}
