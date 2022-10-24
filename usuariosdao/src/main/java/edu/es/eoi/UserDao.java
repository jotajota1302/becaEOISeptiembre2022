package edu.es.eoi;

public interface UserDao {

	void create(User user) throws Exception;

	User read(int id) throws Exception;

	void update(User user) throws Exception;

	void delete(int id) throws Exception;

}