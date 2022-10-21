package edu.es.eoi.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.es.eoi.model.Ingrediente;
import edu.es.eoi.model.Receta;

//ACCESO A MI TABLA RECETAS
public class RecetaDAO {

	public Receta encuentraReceta(int id) throws SQLException {
	
		Receta receta = null;

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement("SELECT * FROM restaurante.recetas where id=?");
		st.setInt(1, id);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {

			receta = new Receta(rs.getString("nombre"), null, rs.getString("descripcion"));
		}

		st = con.prepareStatement("SELECT i.nombre,i.precio,i.calorias FROM receta_ingredientes ri,recetas r,ingredientes i where ri.idreceta=r.id and ri.idingrediente=i.id and r.id=?");
		st.setInt(1, id);
		rs = st.executeQuery();

		List<Ingrediente> lista=new ArrayList<Ingrediente>();
		
		while (rs.next()) {
			lista.add(new Ingrediente(rs.getString("nombre"), rs.getDouble("calorias"), rs.getDouble("precio")));
		}
		
		receta.setIngredientes(lista);
		
		con.close();

		
		return receta;
	}

	private Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante?serverTimezone=UTC",
				"root", "root");
	}

}
