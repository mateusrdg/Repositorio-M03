package br.com.mateus.financas.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.mateus.financas.dao.ContaDao;
import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.util.JPAUtil;

public class TesteJPQL {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		Conta c = new Conta();
		
		c.setSaldo(new BigDecimal(501));;
		
		em.getTransaction().begin();
		
		ContaDao dao = new ContaDao(em);
		
		List <Conta> resultados = dao.getContasSaldoAcima(c.getSaldo());
		
		for (Conta conta : resultados) {
			System.out.println(conta.getSaldo());
		}
		
		em.getTransaction().commit();
		em.close();
	}

}
