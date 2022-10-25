package edu.es.eoi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FingerprintDaoJDBCImpl {
	
	public void create(Fingerprint fingerprint) throws SQLException {

		Connection con = null;
		try {
			con = Utils.getConnection();

			String query = "INSERT INTO fingerprint (scandate,finger,image,iduser) VALUES (?,?,?,?)";

			PreparedStatement st = con.prepareStatement(query);

			st.setDate(1, new Date(fingerprint.getScandate().getTime()));
			st.setString(2, fingerprint.getFinger());
			st.setString(3, fingerprint.getImage());
			st.setInt(4, fingerprint.getUser().getId());

			st.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}

	}
	
	
}
