package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import BDDConnection.Singleton;


public class DaoImpl implements DaoInterface {

	@Override
	public boolean checkForm(String username, String password) {
        
		boolean userExist = false;
		
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM admin1 WHERE username = ? AND password = ?");
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			rs.next();
			try {
				if(rs.getString(1)!=null && rs.getString(2)!=null) {
					userExist=true;
				}
			}catch(Exception e) {
				
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userExist;
	}

}
