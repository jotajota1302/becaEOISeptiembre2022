package edu.es.eoi;

import java.util.Date;

public class Main {
	
	public static UserDao dao= new UserDaoJDBCImpl();

	public static void main(String[] args) throws Exception {
	
		Date fecha=new Date();
		
		User user=new User();
		user.setUsername("Juan");
		user.setMail("juan@mail.com");
		user.setPassword("cccc");
		user.setLastAccess(fecha);
		
//		UserDAO dao= new UserDAO();		
		
		dao.create(user);
		
		//dao.create(user);			
	
//		System.out.println(dao.read(1));
		
		//borrado de usuario por id
		
		//dao.delete(12);
		
		//primero lo busco
//		User user3=dao.read(10);
		//actualizo
//		user3.setPassword("NUEVO PASSWORD");
		//guardo
//		dao.update(user3);
		
		
		
	}

}
