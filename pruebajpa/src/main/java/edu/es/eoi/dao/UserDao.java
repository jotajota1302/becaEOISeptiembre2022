package edu.es.eoi.dao;

import edu.es.eoi.entity.User;

public interface UserDao {

	void create(User user) throws Exception;

	User read(int id) throws Exception;

	void update(User user) throws Exception;

	void delete(int id) throws Exception;

}