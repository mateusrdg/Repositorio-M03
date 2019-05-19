package br.com.mateus.financas.testes;

import javax.persistence.EntityManager;

import br.com.mateus.financas.modelo.Titular;
import br.com.mateus.financas.util.JPAUtil;

public class TesteRelacionamento {
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		Titular t = em.find(Titular.class, 1);
		
		System.out.println(t.getContas().size());
		
		
		
		em.getTransaction().commit();
		em.close();
		
	}
}
