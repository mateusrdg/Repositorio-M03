package br.com.mateus.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas"); 
	
	public EntityManager getEntityManager() {
			return emf.createEntityManager();
	}
}
