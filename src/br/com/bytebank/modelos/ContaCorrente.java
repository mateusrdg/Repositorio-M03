package br.com.bytebank.modelos;

public class ContaCorrente  extends Conta {

	public ContaCorrente(int agencia, int numero, Titular titular) {
		super(agencia, numero, titular);
		
	}
	@Override
	public void saca(Double valor) {
		super.saca((valor/*+ 0.2*/));
	}
	@Override
	public void deposita(Double valor) {
		super.setSaldo((super.getSaldo() +  valor /*+ 10*/));
		
	}
	
	@Override
	public String toString() {
		return "Conta Corrente " + super.toString();
	}

}
