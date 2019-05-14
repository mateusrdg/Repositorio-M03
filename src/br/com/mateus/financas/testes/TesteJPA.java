package br.com.mateus.financas.testes;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.mateus.financas.modelo.Conta;
import br.com.mateus.financas.modelo.MovimentacaoConta;
import br.com.mateus.financas.modelo.TipoMovimentacao;
import br.com.mateus.financas.modelo.Titular;
import br.com.mateus.financas.util.JPAUtil;

public class TesteJPA {

	public static void main(String[] args) {
		Conta c = new Conta();
		//c.setAgencia(2);
		//c.setNumero(2);
		//c.setSaldo(300.0);
		MovimentacaoConta mc = new MovimentacaoConta();
		Titular t = new Titular();
		t.setCpf("60541329383");
		t.setProfissao("Programador");
		t.setNome("Mateus");
		
		Calendar data = Calendar.getInstance();
		data.set(1994, 03, 06);
		t.setDataNascimento(data);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		t = em.find(Titular.class, 1);
		em.persist(t);
		em.persist(mc);
		c.setTitular(t);
		t.setDataNascimento(data);
		
		mc.setData(Calendar.getInstance());
		mc.setTipo(TipoMovimentacao.SAIDA);
		mc.setDescricao("Top burguer");
		mc.setValor(new BigDecimal(22.00));
		mc.setConta(c);
		
		
		
		
		em.getTransaction().commit();
		
		em.close();
	}

}
