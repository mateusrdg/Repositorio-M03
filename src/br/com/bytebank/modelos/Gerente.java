package br.com.bytebank.modelos;

public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticaUtils autenticador ;
	
	public Gerente () {
		autenticador = new AutenticaUtils();
	}

	
	double getBonificacao() {
		return super.getSalario();
	}


	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
