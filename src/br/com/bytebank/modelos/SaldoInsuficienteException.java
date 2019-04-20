package br.com.bytebank.modelos;

public class SaldoInsuficienteException extends RuntimeException {
	
	public SaldoInsuficienteException (String msg) {
		super(msg);
	}
}
