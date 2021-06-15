package br.com.produtos.apirest.exception;

public class MalhaLogNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public MalhaLogNotFoundException(String message) {
		super(message);

	}
}
