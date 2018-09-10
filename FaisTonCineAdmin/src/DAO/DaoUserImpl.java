package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BDDConnection.Singleton;
import Bean.User;

public class DaoUserImpl implements DaoUserService{

	@Override
	public List<User> getAll() {
		List<User> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user1");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				
				int idUser = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName= rs.getString(3);
				String email = rs.getString(4);
				int nombreIdee =rs.getInt(5);
				
				User user = new User(idUser,firstName,lastName,email,nombreIdee);
				list.add(user);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<User> ObyId() {
		List<User> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user1 ORDER BY id_user");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				
				int idUser = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName= rs.getString(3);
				String email = rs.getString(4);
				int nombreIdee =rs.getInt(5);
				
				User user = new User(idUser,firstName,lastName,email,nombreIdee);
				list.add(user);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}
	


	@Override
	public List<User> ObyEmail() {
		List<User> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user1 ORDER BY email");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				
				int idUser = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName= rs.getString(3);
				String email = rs.getString(4);
				int nombreIdee =rs.getInt(5);
				
				User user = new User(idUser,firstName,lastName,email,nombreIdee);
				list.add(user);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public List<User> ObyFirstName() {
		List<User> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user1 ORDER BY first_name");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				
				int idUser = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName= rs.getString(3);
				String email = rs.getString(4);
				int nombreIdee =rs.getInt(5);
				
				User user = new User(idUser,firstName,lastName,email,nombreIdee);
				list.add(user);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public List<User> ObyLastName() {
		List<User> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user1 ORDER BY last_name");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				
				int idUser = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName= rs.getString(3);
				String email = rs.getString(4);
				int nombreIdee =rs.getInt(5);
				
				User user = new User(idUser,firstName,lastName,email,nombreIdee);
				list.add(user);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public List<User> ObyNombreIdee() {
		List<User> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user1 ORDER BY nombre_idee");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				
				int idUser = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName= rs.getString(3);
				String email = rs.getString(4);
				int nombreIdee =rs.getInt(5);
				
				User user = new User(idUser,firstName,lastName,email,nombreIdee);
				list.add(user);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}





	@Override
	public User findById(int id) {
		
		User user = new User();
		Connection conn = Singleton.getConnection();
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("SELECT * FROM user1 WHERE id_user=?");
			ps.setInt(1, id);
			ResultSet result=ps.executeQuery();
			int id_user =result.getInt(1);
			String first_name =result.getString(2);
			String last_name =result.getString(3);
			String email =result.getString(4);
			int nb_idees=result.getInt(5);
		    user  = new User(id_user,first_name,last_name,email,nb_idees);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}





	@Override
	public User findByEmail(String email) {
		User user = new User();
		Connection conn = Singleton.getConnection();
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("SELECT * FROM user1 WHERE email=?");
			ps.setString(1, email);
			ResultSet result=ps.executeQuery();
			int id_user =result.getInt(1);
			String first_name =result.getString(2);
			String last_name =result.getString(3);
			String email_user =result.getString(4);
			int nb_idees=result.getInt(5);
		    user  = new User(id_user,first_name,last_name,email_user,nb_idees);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}





	@Override
	public List<User> findByPrenom(String prenom) {
		List<User> liste = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("SELECT * FROM user1 WHERE first_name=?");
			ps.setString(1, prenom);
			ResultSet result=ps.executeQuery();
			while (result.next()) {
				int id_user =result.getInt(1);
				String first_name =result.getString(2);
				String last_name =result.getString(3);
				String email =result.getString(4);
				int nb_idees=result.getInt(5);
			    User user  = new User(id_user,first_name,last_name,email,nb_idees);
			    liste.add(user);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return liste;
	}





	@Override
	public List<User> findByNom(String nom) {
		List<User> liste = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("SELECT * FROM user1 WHERE last_name=?");
			ps.setString(1, nom);
			ResultSet result=ps.executeQuery();
			while (result.next()) {
				int id_user =result.getInt(1);
				String first_name =result.getString(2);
				String last_name =result.getString(3);
				String email =result.getString(4);
				int nb_idees=result.getInt(5);
			    User user  = new User(id_user,first_name,last_name,email,nb_idees);
			    liste.add(user);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return liste;
	}





	@Override
	public List<User> findByNombreIdee(int nombreIdee) {
		List<User> liste = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("SELECT * FROM user1 WHERE nombre_idee=?");
			ps.setInt(1, nombreIdee);
			ResultSet result=ps.executeQuery();
			while (result.next()) {
				int id_user =result.getInt(1);
				String first_name =result.getString(2);
				String last_name =result.getString(3);
				String email =result.getString(4);
				int nb_idees=result.getInt(5);
			    User user  = new User(id_user,first_name,last_name,email,nb_idees);
			    liste.add(user);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return liste;
	}

}
