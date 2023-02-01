package sockets.ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Ejemplos
 * 
 * @author e.a.martin.muriel
 *
 */
public class ClientTCPExplorando {

	public static final int PUERTO = 443;
	public static final String DIRECCION = "www.recursosformacion.com";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			
			Socket socketCliente = new Socket(DIRECCION, PUERTO);
			System.out.println("Cliente conectado a " + socketCliente.getRemoteSocketAddress());
			InputStream inFromServer = socketCliente.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Me han contestado desde " + in.read());
			
			int lector = in.read();
			while(lector!= -1) {
				System.out.println(lector);
				lector=in.read();
			}
			
			
			socketCliente.close();
			
		} catch (SocketTimeoutException se) {
			se.printStackTrace();
		}
	}

}
