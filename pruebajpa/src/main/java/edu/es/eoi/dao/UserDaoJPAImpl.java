package edu.es.eoi.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import edu.es.eoi.entity.User;

public class UserDaoJPAImpl implements UserDao {

	private EntityManager manager = Persistence.createEntityManagerFactory("BASEDEDATOSPRUEBA").createEntityManager();

	@Override
	public void create(User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
	}

	@Override
	public User read(int id) {
		return manager.find(User.class, id);
	}

	@Override
	public void update(User user) {
		manager.getTransaction().begin();
		manager.merge(user);
		manager.getTransaction().commit();//
	}

	@Override
	public void delete(int id) {
		manager.getTransaction().begin();
		manager.remove(read(id));
		manager.getTransaction().commit();
	}
}
