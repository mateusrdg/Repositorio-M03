package br.com.mateus.financas.testes;

import java.math.BigDecimal;
import java.util.Arrays;

import javax.persistence.EntityManager;

import br.com.mateus.financas.modelo.Categoria;
import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.modelo.MovimentacaoConta;
import br.com.mateus.financas.modelo.TipoMovimentacao;
import br.com.mateus.financas.modelo.Titular;
import br.com.mateus.financas.util.JPAUtil;

public class TesteCategoria {
	public static void main(String[] args) {
		
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Titular t = new Titular();
		Conta c = new Conta();
		MovimentacaoConta mc = new MovimentacaoConta();
		MovimentacaoConta mc2 = new MovimentacaoConta();
		
		Categoria c1 = new Categoria ("Viagem");
		Categoria c2 = new Categoria ("Negocios");
		
		
		
		t = em.find(Titular.class, 3);
		
		c = em.find(Conta.class, 3);
		
		em.persist(c1);
		em.persist(c2);
		
		
		
		mc.setConta(c);
		mc.setDescricao("Viagem à SP");
		mc.setTipo(TipoMovimentacao.SAIDA);
		mc.setValor(new BigDecimal(500));
		mc.setCategorias(Arrays.asList(c1,c2));
		
		mc2.setConta(c);
		mc2.setDescricao("Viagem terminal Lagoa");
		mc2.setTipo(TipoMovimentacao.SAIDA);
		mc2.setValor(new BigDecimal(500));
		mc2.setCategorias(Arrays.asList(c1,c2));
		
		em.persist(mc);
		em.persist(mc2);
		
		c.setTitular(t);
		
		
		em.getTransaction().commit();
		em.close();
	}
}
