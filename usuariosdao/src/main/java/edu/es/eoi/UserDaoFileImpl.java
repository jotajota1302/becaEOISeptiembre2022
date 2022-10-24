package edu.es.eoi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Data Access Object - CRUD
public class UserDaoFileImpl implements UserDao {

	// Crear un usuario -Create

	public void create(User user) throws IOException {
		
		File file= new File("C://workspaces/beca/usuariosdao/src/main/resources/usuarios.txt"); 
		
		FileWriter writer= new FileWriter(file,true);
		
		writer.write(user.getId()+","+user.getUsername()+","+user.getMail());
			
		writer.close();
		
	}

	// Leer un usuario por id -Read

	public User read(int id) {

		
	
		return null;

	}

	// Modificar un usuario -Update
	
	public void update(User user) {
	
		
	}
	
	// borrar un usuario por id -Delete

	public void delete(int id) {

	

	}

}
