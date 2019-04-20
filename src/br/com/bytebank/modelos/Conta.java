package br.com.bytebank.modelos;

/**
 * 
 * @author Mateus Rodrigues
 *
 */

public abstract class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Titular titular = new Titular();
	private static int total;
	
	Conta(int agencia, int numero, Titular titular){
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.setTitular(titular);
		System.out.println("o total de contas é:" + total);
	}
	
	public abstract void deposita (double valor);
	
	/**
	 * Necessário passar um valor menor que o saldo para poder sacar
	 * @param valor
	 */
	public void saca (double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.getSaldo());		
		} else {
			this.saldo = this.getSaldo() - valor;
		}
		 
	}

	
	void transfere (Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}


	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
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
	
}
