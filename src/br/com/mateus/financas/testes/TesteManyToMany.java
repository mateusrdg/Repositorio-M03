package br.com.mateus.financas.testes;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.mateus.financas.dao.MovimentacaoContaDao;
import br.com.mateus.financas.modelo.Categoria;
import br.com.mateus.financas.modelo.MovimentacaoConta;
import br.com.mateus.financas.util.JPAUtil;

public class TesteManyToMany {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		Categoria c = new Categoria();
		
		c.setId(4);
		
		em.getTransaction().begin();
		
		MovimentacaoContaDao dao = new MovimentacaoContaDao (em);
		List <MovimentacaoConta> movimentacoes = dao.getMovimentacoesPorCategoria(c);
		
		for (MovimentacaoConta mov : movimentacoes) {
			System.out.println(mov.getDescricao());
		}
		
		em.getTransaction().commit();
		em.close();

	}

}
