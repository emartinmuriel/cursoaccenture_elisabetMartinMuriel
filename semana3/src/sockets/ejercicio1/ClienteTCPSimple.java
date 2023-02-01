package sockets.ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ClienteTCPSimple {
	public static final int PUERTO = 6000;
	public static final String DIRECCION = "localhost";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			Socket socketCliente = new Socket(DIRECCION, PUERTO);
			System.out.println("Cliente conectado a " + socketCliente.getRemoteSocketAddress());
			OutputStream outToServer = socketCliente.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("Saludos desde " + socketCliente.getLocalSocketAddress());
			InputStream inFromServer = socketCliente.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Me han contestado desde " + in.readUTF());
			socketCliente.close();
		} catch (SocketTimeoutException se) {
			se.printStackTrace();
		}
	}
}
