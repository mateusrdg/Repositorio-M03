package br.com.bytebank.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
		
		ArrayList <Titular> titulares = new ArrayList<Titular>();
		
		
		Titular t1 = new Titular("ates","605413293-83", "programador",2); 
			
		Titular t2 = new Titular("Ls","605413293-83", "programador",3);
			
		Titular t3 = new Titular("Luciana","605413293-83", "programador",1);
			
	
		titulares.add(t1);
		titulares.add(t2);
		titulares.add(t3);
		
		for (Titular object : titulares) {
			System.out.println(object.toString());
		}
		
		titulares.sort((c1,c2) -> c1.getId().compareTo(c2.getId()));
		//Collections.sort(titulares);
		
		titulares.forEach((conta) -> System.out.println(conta.toString())); 
		
		//for (Titular object : titulares) {
		//	System.out.println(object.toString());
		//}
		Comparator <Titular> comp = (tit1,tit2) -> tit1.getNome().compareTo(tit2.getNome())  ;
		
		titulares.sort(comp);
		
	}

}

class ComparadorNome implements Comparator <Titular> {
	@Override
	public int compare(Titular o1, Titular o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
}

class ComparadorId implements Comparator <Titular>{

	@Override
	public int compare(Titular o1, Titular o2) {
		return o1.getId().compareTo(o2.getId());
	} 
}
