package br.com.mateus.financas.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mateus.financas.modelo.Categoria;
import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.modelo.MovimentacaoConta;
import br.com.mateus.financas.util.JPAUtil;

public class TesteManyToMany {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		Categoria c = new Categoria();
		
		c.setId(1);
		
		em.getTransaction().begin();
		String jpql = "select m from MovimentacaoConta m join m.categorias c where c = :pCategoria";
		
		Query query = em.createQuery(jpql);
		query.setParameter("pCategoria", c);
		
		List<MovimentacaoConta> resultados = query.getResultList();
		
		for (MovimentacaoConta mov : resultados) {
			System.out.println(mov.getDescricao());
		}
		
		em.getTransaction().commit();
		em.close();

	}

}
