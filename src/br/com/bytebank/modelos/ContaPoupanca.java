package br.com.bytebank.modelos;

public class ContaPoupanca extends Conta {
	public ContaPoupanca (int agencia, int numero, Titular titular) {
		super (agencia , numero, titular);
	}

	@Override
	public void deposita(Double valor) {
		super.setSaldo((super.getSaldo() +  valor + 10));
		
	}
}
