package br.com.desafio.api.websocket.clienteWebSocket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 8080);
		System.out.println("Conexao extabelecida");
		
		
		
	}
}
