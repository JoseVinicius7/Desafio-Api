package br.com.desafio.api.websocket.config;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket serverSocket;

	// cria o servidor de conexões
	public void criarServerSocket(int porta) throws IOException {

		serverSocket = new ServerSocket(porta);
	};

	// espera o pedido de conexão
	private Socket esperaConexao() throws IOException {
		Socket socket = serverSocket.accept();
		return socket;
	}

	// fecha socket de comunicação
	private void fechaSocket(Socket s) throws IOException {
		s.close();
	}

	// criar stream de entrada e saida
	// converte entre cliente e servidor
	private void trataConexao(Socket socket) throws IOException {

		try {
			ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

			output.close();
			input.close();

		} catch (IOException e) {
			System.out.println("Erro tratamento conexão");
		} finally {
			fechaSocket(socket);
		}
	}

	public static void main(String args[]) {
		try {
							
			Server server = new Server();
			System.out.println("Aguardando conexão");
			server.criarServerSocket(3322);
			System.out.println("Servidor iniciado na porta 3322");
			while (true) {
			Socket socket = server.esperaConexao();
			System.out.println("Cliente conectado do IP " + socket.getInetAddress().getHostAddress());

			server.trataConexao(socket);
			System.out.println("Cliente finalizado.");
			}

		}catch(

	IOException ex)
	{
		System.out.println("Conexão falhou");
	}

}

}
