package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import Bean.User;
import DAO.DaoUserImpl;


class Dao_Junit_test {

	@Test
	void testGetAll() {
		DaoUserImpl dao = new DaoUserImpl();
		List<User> liste = dao.getAll();
		assertEquals(13,liste.size());
		
	}

	@Test
	void testObyEmail() {
		fail("Not yet implemented");
	}

	@Test
	void testObyFirstName() {
		fail("Not yet implemented");
	}

	@Test
	void testObyLastName() {
		fail("Not yet implemented");
	}

	@Test
	void testObyNombreIdee() {
		fail("Not yet implemented");
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByEmail() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByPrenom() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByNom() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByNombreIdee() {
		fail("Not yet implemented");
	}

}
