package br.com.mateus.financas.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.util.JPAUtil;

public class TesteJPQL {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		Conta c = new Conta();
		
		c.setSaldo(new BigDecimal(230));;
		
		em.getTransaction().begin();
		String jpql = "select c from Conta c where c.saldo > :pConta order by c.saldo";
		
		Query query = em.createQuery(jpql);
		query.setParameter("pConta", c.getSaldo());
		
		List<Conta> resultados = query.getResultList();
		
		for (Conta conta : resultados) {
			System.out.println(conta.getSaldo());
		}
		
		em.getTransaction().commit();
		em.close();
	}

}
