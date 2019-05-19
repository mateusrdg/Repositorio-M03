package br.com.mateus.financas.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.modelo.Titular;

public class ContaDao {
	
	private EntityManager em;
	
	public ContaDao (EntityManager em) {
		this.em = em;
	}
	
	public List <Conta> getContasSaldoAcima (BigDecimal saldo){
		
		String select = "select c from Conta c where c.saldo > :pValor";
		
		TypedQuery <Conta> query = em.createQuery(select, Conta.class);
		query.setParameter("pValor", saldo);
		
		return query.getResultList();
	}
	
	public List <Conta> getContasTitular (Titular titular){
		
		String select = "select c from Conta c where c.titular = :pTitular";
		
		TypedQuery <Conta> query = em.createQuery(select, Conta.class);
		query.setParameter("pTitular", titular);
		
		return query.getResultList();
	}
}
