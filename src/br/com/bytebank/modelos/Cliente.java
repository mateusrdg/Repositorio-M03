package br.com.bytebank.modelos;

public class Cliente implements Autenticavel {
	private AutenticaUtils autenticador ;
	
	public Cliente () {
		autenticador = new AutenticaUtils();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
