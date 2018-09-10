package DAO;

import java.util.List;

import Bean.User;

public interface DaoUserService {
	
	public List<User> getAll();	
	public List<User> ObyId();
	public List<User> ObyEmail();
	public List<User> ObyFirstName();
	public List<User> ObyLastName();
	public List<User> ObyNombreIdee();

	public User findById(int id );
	public User findByEmail(String email);
	public List<User>findByPrenom(String prenom);
	public List<User>findByNom(String prenom);
	public List<User>findByNombreIdee(int nbIdees);
	
}
