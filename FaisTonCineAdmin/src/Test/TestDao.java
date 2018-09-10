package Test;

import java.util.List;

import Bean.User;
import DAO.DaoUserImpl;

public class TestDao {

	public static void main(String[] args) {

		// ************************************* TEST
		 
		 DaoUserImpl dao = new DaoUserImpl();
		
		 List<User> liste = dao.getAll();
		
		 for(User e : liste) {
		 System.out.println(e.toString());
		 }
		 System.out.println("taille" + liste.size());
		// ***************************************************************************************************

//		DaoUserImpl dao = new DaoUserImpl();
//		
//		List<User> liste = dao.findByPrenom("valo");
//		
//		for(User e : liste) {
//			System.out.println(e.toString());
//		}
	}

}
