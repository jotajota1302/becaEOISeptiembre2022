package edu.es.eoi.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Banco;

public class BancoDaoJPAImpl  {

	private EntityManager manager = Persistence.createEntityManagerFactory("BASEDEDATOSPRUEBA").createEntityManager();

	public void create(Banco banco) {
		manager.getTransaction().begin();
		manager.persist(banco);
		manager.getTransaction().commit();
	}

	public Banco read(int id) {
		return manager.find(Banco.class, id);
	}

	public void update(Banco banco) {
		manager.getTransaction().begin();
		manager.merge(banco);
		manager.getTransaction().commit();
	}

	public void delete(int id) {
		manager.getTransaction().begin();
		manager.remove(read(id));
		manager.getTransaction().commit();
	}
}
