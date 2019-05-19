package br.com.mateus.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.mateus.financas.modelo.Categoria;
import br.com.mateus.financas.modelo.MovimentacaoConta;

public class MovimentacaoContaDao {
	private EntityManager em;
	
	public MovimentacaoContaDao (EntityManager em ){
		this.em = em;
	}
	
	public List<MovimentacaoConta> getMovimentacoesPorCategoria (Categoria categoria){
		
		String jpql = "select m from MovimentacaoConta m join m.categorias c where c = :pCategoria";
		
		TypedQuery <MovimentacaoConta> query = em.createQuery(jpql, MovimentacaoConta.class);
		query.setParameter("pCategoria", categoria);
		
		return query.getResultList();
	}
	
}
