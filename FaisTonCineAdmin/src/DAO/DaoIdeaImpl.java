package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import BDDConnection.Singleton;
import Bean.Idea;
import Bean.User;

public class DaoIdeaImpl implements DaoIdeaService {
	
	public List<Idea> getAll() {
		List<Idea> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM idea ORDER BY id_idea");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				int idIdea = rs.getInt(1);
				int idUser = rs.getInt(2);
				String libelle = rs.getString(3);
				String text= rs.getString(4);
				boolean isDiffusable = rs.getBoolean(5);
				Date date  =rs.getDate(6);
				
				Idea idea = new Idea(idIdea, idUser, libelle, text, isDiffusable, date);
				list.add(idea);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Idea> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Idea> OByIdUser() {
		List<Idea> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM idea ORDER BY id_user");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				int idIdea = rs.getInt(1);
				int idUser = rs.getInt(2);
				String libelle = rs.getString(3);
				String text= rs.getString(4);
				boolean isDiffusable = rs.getBoolean(5);
				Date date  =rs.getDate(6);
				
				Idea idea = new Idea(idIdea, idUser, libelle, text, isDiffusable, date);
				list.add(idea);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Idea> OByLibelle() {
		List<Idea> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM idea ORDER BY libelle");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				int idIdea = rs.getInt(1);
				int idUser = rs.getInt(2);
				String libelle = rs.getString(3);
				String text= rs.getString(4);
				boolean isDiffusable = rs.getBoolean(5);
				Date date  =rs.getDate(6);
				
				Idea idea = new Idea(idIdea, idUser, libelle, text, isDiffusable, date);
				list.add(idea);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Idea> OByDiffusable() {
		List<Idea> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM idea ORDER BY diffusable");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				int idIdea = rs.getInt(1);
				int idUser = rs.getInt(2);
				String libelle = rs.getString(3);
				String text= rs.getString(4);
				boolean isDiffusable = rs.getBoolean(5);
				Date date  =rs.getDate(6);
				
				Idea idea = new Idea(idIdea, idUser, libelle, text, isDiffusable, date);
				list.add(idea);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Idea> OByDate() {
		List<Idea> list = new ArrayList<>();
		Connection conn = Singleton.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM idea ORDER BY date");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			do {
				int idIdea = rs.getInt(1);
				int idUser = rs.getInt(2);
				String libelle = rs.getString(3);
				String text= rs.getString(4);
				boolean isDiffusable = rs.getBoolean(5);
				Date date  =rs.getDate(6);
				
				Idea idea = new Idea(idIdea, idUser, libelle, text, isDiffusable, date);
				list.add(idea);	
			}while(rs.next());
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

}
