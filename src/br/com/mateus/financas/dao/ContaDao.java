package br.com.mateus.financas.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.modelo.Titular;

public class ContaDao {

	private EntityManager em;

	public ContaDao(EntityManager em) {
		this.em = em;
	}

	public List<Conta> getContasSaldoAcima(BigDecimal saldo) {

		String select = "select c from Conta c where c.saldo > :pValor";

		TypedQuery<Conta> query = em.createQuery(select, Conta.class);
		query.setParameter("pValor", saldo);

		return query.getResultList();
	}

	public List<Conta> getContasTitular(Titular titular) {

		String select = "select c from Conta c where c.titular = :pTitular";

		TypedQuery<Conta> query = em.createQuery(select, Conta.class);
		query.setParameter("pTitular", titular);

		return query.getResultList();
	}

	public List<Conta> getContas(Titular titular, BigDecimal saldo) {

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Conta> query = criteriaBuilder.createQuery(Conta.class);
		Root<Conta> root = query.from(Conta.class);

		Path<Titular> titularPath = root.<Titular>get("titular");

		Path<BigDecimal> saldoMaiorQuePath = root.<BigDecimal>get("saldo");

		List<Predicate> predicados = new ArrayList<>();

		if (titular != null) {
			Predicate titularIgual = criteriaBuilder.equal(titularPath, titular);
			predicados.add(titularIgual);
		}

		if (saldo != null) {
			Predicate saldoMaiorQue = criteriaBuilder.greaterThan(saldoMaiorQuePath, saldo);

			predicados.add(saldoMaiorQue);
		}

		query.where(predicados.toArray(new Predicate[] {}));

		TypedQuery<Conta> typedQuery = em.createQuery(query);

		return typedQuery.getResultList();
	}
}
