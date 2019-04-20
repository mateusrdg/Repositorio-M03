package br.com.bytebank.testes;

import br.com.bytebank.modelos.Conta;
import br.com.bytebank.modelos.ContaCorrente;
import br.com.bytebank.modelos.Titular;

public class Main {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = 10;
		y = 10;
		
		
		//System.out.println(" x é: " + x); 
		//System.out.println(" y é: " + x); 
		
		if ( x > y) {
			System.out.println(" é " ); 
		} else if (x == 0){
			System.out.println("não é"); 
		}
		
		//System.out.println(" x + y é: " + x + y); 
		
		//for (int i = 0; i < args.length; i++) {
			
		//}
		
		
		//Titular mateus = new Titular("Mateus","605.413.293-83","Programador");
		//Titular lucas = new Titular("Lucas","605.413.293-83","Programador");
		Titular mae = new Titular("Mae","605.413.293-83","Dona de casa");
		
		//Conta conta1 = new ContaCorrente(1,2,mateus);
		//Conta conta2 = new ContaPoupanca(1,2, lucas);
		Conta conta3 =  new ContaCorrente(1,2, mae);
		
		//conta1.deposita(100);
		//conta1.saca(10);
		//System.out.println(conta1.getSaldo());
		
		conta3.deposita(100);
		try {
			conta3.saca(200);
		} catch (Exception ex){
			System.out.println(" aqui " + ex.getMessage());
		}
		
		System.out.println(conta3.getSaldo());
	/*
		Programador mateus = new Programador(); 
		Gerente lucas = new Gerente();
		
		mateus.setSalario(1500);
		lucas.setSalario(12500);
		
		System.out.println(mateus.getBonificacao());
		System.out.println(lucas.getBonificacao());
		lucas.setSenha(2222);
		SistemaInterno si = new SistemaInterno();
		si.autentica(lucas);
*/		
		//System.out.println(Conta.getTotal());
		
		//System.out.println(conta3.getTitular().getCPF() + ", " + conta1.getSaldo());
		
	}

}
