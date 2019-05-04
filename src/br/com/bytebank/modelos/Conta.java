package br.com.bytebank.modelos;

/**
 * 
 * @author Mateus Rodrigues
 *
 */

public abstract class Conta {
	
	private Double saldo;
	private Integer agencia;
	private Integer numero;
	private Titular titular = new Titular();
	private static Integer total;
	
	Conta(int agencia, int numero, Titular titular){
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.setTitular(titular);
		System.out.println("o total de contas é:" + total);
	}
	
	public abstract void deposita (Double i);
	
	/**
	 * Necessário passar um valor menor que o saldo para poder sacar
	 * @param i
	 */
	public void saca (Double i) {
		if (this.saldo < i) {
			throw new SaldoInsuficienteException("Saldo: " + this.getSaldo());		
		} else {
			this.saldo = this.getSaldo() - i;
		}
		 
	}

	
	void transfere (Conta destino, Double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}


	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo; 
	}


	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	public static int getTotal () {
		return total;
	}
	
	@Override
	public String toString() {
		return ("Saldo: " + this.saldo);
	}
	
	@Override
	public boolean equals(Object conta) {
		Conta outraconta = (Conta)conta;
		return (this.agencia == outraconta.agencia);
	}
}
