package br.com.mateus.financas.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.mateus.financas.dao.ContaDao;
import br.com.mateus.financas.dao.TitularDao;
import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.modelo.Titular;
import br.com.mateus.financas.util.JPAUtil;

public class TesteCriteriaAPI {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		ContaDao dao = new ContaDao(em);
		
		TitularDao titularDao = new TitularDao(em);
		
		Titular titular = titularDao.getTitularPorId(1);
		
		List<Conta> contas = dao.getContas(null, new BigDecimal(500.00));

		for (Conta conta : contas) {
			System.out.println(conta.getTitular().getNome() + " id :" + conta.getId() + " saldo: " + conta.getSaldo());
		}

		em.getTransaction().commit();
		em.close();

	}

}
