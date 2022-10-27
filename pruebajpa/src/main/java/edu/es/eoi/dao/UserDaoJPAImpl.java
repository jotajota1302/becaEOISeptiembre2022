package edu.es.eoi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.User;

public class UserDaoJPAImpl implements UserDao{

	private EntityManager manager = Persistence.createEntityManagerFactory("BASEDEDATOSPRUEBA").createEntityManager();
	
	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		Query query = manager.createQuery("FROM User");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> findUsersByFingerprint(String name) {
		Query query = manager.createQuery("FROM User u WHERE u.fingerprint.finger = :parameter");
		query.setParameter("parameter", name);
		return query.getResultList();
	}

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
