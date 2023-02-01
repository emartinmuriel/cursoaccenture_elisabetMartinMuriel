package sockets.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Esta clase es una prueba sacada de internet para comprobar la ip externa de
 * la red a través de la respuesta de un servidor externo ante una petición
 * 
 * @author e.a.martin.muriel
 *
 */
public class IpChecker {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(getIp());
	}

	public static String getIp() throws Exception {
		URL whatismyip = new URL("http://checkip.amazonaws.com"); // Utiliza un servidor externo para ver la ip externa
																	// de la red
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
			String ip = in.readLine();
			return ip;
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
