package br.com.bytebank.modelos;

public class Programador extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario() / 2;
		
	}

}
