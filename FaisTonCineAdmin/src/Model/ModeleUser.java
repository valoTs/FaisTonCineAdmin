package Model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Bean.User;
import DAO.DaoUserImpl;

public class ModeleUser {

	DaoUserImpl dao = new DaoUserImpl();

	public JSONArray recupDonneesUser(int indiceTri, int indiceSearch, int state,String libelleSearch,String paramSearch) {

		List<User> liste = new ArrayList<User>();
		if(state==0) {
			switch(indiceTri) {
			case 0:
				 liste = dao.ObyId();
				break;
			case 1:
				 liste = dao.ObyFirstName();
				break;
			case 2:
				 liste = dao.ObyLastName();
				break;
			case 3:
				liste =dao.ObyEmail();
				break;
			case 4:
				liste=dao.ObyNombreIdee();
				break;
			}
		}else {
			switch(libelleSearch) {
			case "Identifiant":
				liste.add(dao.findById(Integer.parseInt(paramSearch)));
				break;
			case "Prénom" :
				liste=dao.findByPrenom(paramSearch);
				break;
			case "Nom" :
				liste= dao.findByNom(paramSearch);
				break;
			case "Email" :
				liste.add(dao.findByEmail(paramSearch));
				break;
			case "Nombre d'idées" : 
				liste = dao.findByNombreIdee(Integer.parseInt(paramSearch));
				break;
				
			}
			
		}
		
		
		

		// JSONObject json = new JSONObject();
		// Object[]objet = new Object[liste.size()];
		JSONArray array = new JSONArray();
		for (int i = 0; i < liste.size(); i++) {
			User u = liste.get(i);
			JSONArray json = new JSONArray();
			List<String> userParams = new ArrayList<>();

			userParams.add(String.valueOf(u.getIdUser()));
			userParams.add(u.getFirstName());
			userParams.add(u.getLastName());
			userParams.add(u.getEmail());
			userParams.add(String.valueOf(u.getNombreIdee()));
			json.put(userParams.get(0));
			json.put(userParams.get(1));
			json.put(userParams.get(2));
			json.put(userParams.get(3));
			json.put(userParams.get(4));

			array.put(json);

		}

		return array;
	}

	public String AffichageDonnees(JSONArray json) {
		String table;

		table = "<table>" ;
		table += "<thead>" ;
		table += "<tr><th>Id Utilisateur</th><th>Prenom</th><th>Nom</th><th>Email</th><th>Nombre d'idees</th></tr>";
				
		table += "</thead>";
		table += "<tbody>" ;

		for (int i = 0; i < json.length(); i++) {
			JSONArray test = new JSONArray();

			try {
				test = (JSONArray) json.get(i);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			table += "<tr>";
			for (int j = 0; j < test.length(); j++) {
				try {
					table += "<td>" + test.get(j).toString() + "</td>";
				} catch (JSONException e) {
					table += "<td> Vide </td>";
				}

			}
			table += "</tr>";

		}
		table += "</tbody>" ;
		table += "</table>" ;

		// System.out.println(table);
		return table;

	}
}
