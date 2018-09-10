package Model;

import java.util.HashMap;

import DAO.DaoImpl;

public class VerificationFormulaire {

	public String verifFormulaire(String username, String password) {

		DaoImpl dao = new DaoImpl();
		String message;
		boolean userExist = dao.checkForm(username, password);
		if (userExist == true) {
			message = "connexion réalisée avec succès";
		} else {
			message = "Echec de la connexion";
		}
		return message;
	}

	public HashMap<String, String> CreationErrors(String username, String password) {

		HashMap<String, String> MapError = new HashMap<>();

		if (username.isEmpty()) {
			MapError.put("username", "identifiant manquant");
		}

		if (password.isEmpty()) {
			MapError.put("password", "Mot de passe manquant ");
		}
		return MapError;

	}

}
