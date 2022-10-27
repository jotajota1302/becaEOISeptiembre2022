package edu.es.eoi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.es.eoi.entity.User;

//Data Access Object - CRUD
public class UserDaoJDBCImpl implements UserDao{

	public User read(int id) throws Exception {

		Connection con = null;
		User user = null;

		try {
			con = getConnection();

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
	
	
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/persona?serverTimezone=UTC",
				"root", "root");
	}


	@Override
	public void create(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
