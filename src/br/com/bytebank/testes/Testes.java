package br.com.bytebank.testes;

import java.util.ArrayList;

import br.com.bytebank.modelos.Titular;

public class Testes {

	public static void main(String[] args) {
		
		int[] idade = new int[5];
		idade[0] = 1;
		idade[1] = 2;
		idade[2] = 3;
		idade[3] = 4;
		idade[4] = 5;
		
		for (int x = 0; x < idade.length; x++) {
			System.out.println(idade[x]);
		}
		
		Object[] titulares = new Object[3];
		
		for (int i = 0; i < titulares.length; i++) {
			if (i == 0) {
				titulares[i] = new Titular("Mateus","605413293-83", "programador");
			}
			if (i == 1) {
				titulares[i] = new Titular("Lucas","605413293-83", "programador");
			}
			if (i == 2) {
				titulares[i] = new Titular("Luciana","605413293-83", "programador");
			}
		}
		
		for (int i = 0; i < titulares.length; i++) {
			Titular castteste = (Titular)titulares[i];
			System.out.println(castteste.getCPF());
		}
	}

}
