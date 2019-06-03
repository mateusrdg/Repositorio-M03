package br.com.mateus.financas.testes;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.mateus.financas.dao.ContaDao;
import br.com.mateus.financas.dao.TitularDao;
import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.modelo.Titular;
import br.com.mateus.financas.util.JPAUtil;

public class SemCriatividadeParaNomearEssaClasseDeTestes {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
	
		em.getTransaction().begin();
		
		//String select = "select t from Titular t ";

		
		TitularDao dao = new TitularDao(em);
//		ContaDao contaDao = new ContaDao(em);
		
		List<Titular> todosTitulares = dao.getTitularesContas();
		
//		Titular titular = dao.getTitularPorId(1);
//		List<Conta> contas = contaDao.getContasTitular(titular);
		
//		List<Conta> contas = contaDao.getContasSaldoAcima(new BigDecimal(500.00));
//		for (Conta conta : contas) {
//			System.out.println(conta.getSaldo());
//		}
//		System.out.println(todosTitulares.size());
//		
//		
		for (Titular titular : todosTitulares) {
			System.out.println(titular.getNome());
			List <Conta> contas = titular.getContas();
			for (Conta conta : contas) {
				System.out.println(conta.getSaldo());
			}
		}
		
		
		
		em.getTransaction().commit();
		em.close();

	}

}
