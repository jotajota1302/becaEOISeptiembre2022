package edu.es.eoi.service;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.User;

public class UserService {
	
	EntityManager manager = Persistence.createEntityManagerFactory("BASEDEDATOSPRUEBA").createEntityManager();

	public boolean compruebaPassword(String username, String password) throws SQLException {
		
		Query query = manager.createQuery(" FROM User where mail=:mail");
		query.setParameter("mail", username);		
		
		User user=(User) query.getSingleResult();
				
		if(password.equals(user.getPassword())) {
			return true;
		}
		
		return false;
	}
	
}
