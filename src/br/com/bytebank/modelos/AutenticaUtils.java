package br.com.bytebank.modelos;

public class AutenticaUtils {
	
	private int senha;

	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
