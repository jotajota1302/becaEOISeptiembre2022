package edu.es.eoi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Data Access Object - CRUD
public class UserDaoJDBCImpl implements UserDao {

	// Crear un usuario -Create

	@Override
	public void create(User user) throws SQLException {

		Connection con = null;
		try {
			con = Utils.getConnection();

			String query = "INSERT INTO user (username,mail,password,lastaccess) " + "VALUES (?,?,?,?)";

			PreparedStatement st = con.prepareStatement(query);

			st.setString(1, user.getUsername());
			st.setString(2, user.getMail());
			st.setString(3, user.getPassword());
			st.setDate(4, new Date(user.getLastAccess().getTime()));

			st.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}

	}

	// Leer un usuario por id -Read

	@Override
	public User read(int id) throws SQLException {

		Connection con = null;
		User user = null;

		try {
			con = Utils.getConnection();

			String query = "SELECT * FROM user where ID=?";

			PreparedStatement st = con.prepareStatement(query);

			st.setInt(1, id);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setMail(rs.getString("mail"));
				user.setPassword(rs.getString("password"));
				user.setLastAccess(rs.getDate("lastaccess"));
			}

		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}

		return user;

	}

	// Modificar un usuario -Update
	
	@Override
	public void update(User user) throws SQLException {
		
		Connection con = null;
		try {
			con = Utils.getConnection();
			
			String query = "UPDATE user SET username = ?, mail = ?, password = ?, lastaccess=?  WHERE ID =?";

			PreparedStatement st = con.prepareStatement(query);

			st.setString(1, user.getUsername());
			st.setString(2, user.getMail());
			st.setString(3, user.getPassword());
			st.setDate(4, new Date(user.getLastAccess().getTime()));
			st.setInt(5, user.getId());
			
			st.executeUpdate();

		} catch (SQLException e) {
			throw e;
		} finally {
			con.close();
		}
		
	}
	
	// borrar un usuario por id -Delete

	@Override
	public void delete(int id) throws SQLException {

		Connection con = null;

		try {
			con = Utils.getConnection();

			String query = "DELETE FROM user where ID=?";

			PreparedStatement st = con.prepareStatement(query);

			st.setInt(1, id);

			st.executeUpdate();

		} catch (SQLException e) {
			throw e;
		} finally {
			con.close();
		}

	}

}
