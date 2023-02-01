package sockets.ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class ServidorTCPSimple {
	static final String SALUDO = "Esperando en puerto ";
	static final int TIMEOUT = 10000;
	static final int PUERTO = 6000;
	private static ServerSocket serverSocket;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		serverSocket = new ServerSocket(PUERTO);
		serverSocket.setSoTimeout(TIMEOUT);

		// Poner el sockect a la espera
		while (true) {

			try {
				System.out.println(SALUDO + serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				System.out.println("Conexion desde " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("gracias por conectarte a " + server.getLocalSocketAddress());
				server.close();
				break;
			} catch (SocketTimeoutException se) {
				System.out.println("socket timeout!");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}

		}
	}
}
