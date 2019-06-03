package br.com.mateus.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.mateus.financas.modelo.Titular;

public class TitularDao {
	
	private EntityManager em;
	
	public TitularDao(EntityManager em) {
		this.em = em;
	}
	
	//List<Titular> todosTitulares = ;

	public List<Titular> getTitularesContas() {
		//String select = "select distinct t from Titular t left join fetch t.Contas";
		
		//TypedQuery <Titular> query  = em.createQuery(select, Titular.class);
		TypedQuery <Titular> query  =  em.createNamedQuery("getTitularesContas",Titular.class);
		
		return query.getResultList();
	}
	public Titular getTitularPorId(Integer id) {
		
		String select = "select  t from Titular t where t.id = :pId";
		
		TypedQuery <Titular> query  = em.createQuery(select, Titular.class);
		query.setParameter("pId", id);
		
		return query.getSingleResult();
	}
}
