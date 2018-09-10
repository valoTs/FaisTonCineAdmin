package Model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;

import Bean.Idea;

import DAO.*;

public class ModeleIdea {

	public JSONArray recupDonneesIdea(int indiceTri, int indiceSearch, int etat) {
		
		DaoIdeaImpl dao = new DaoIdeaImpl();
		List<Idea> liste = new ArrayList<>();
		if(etat==0) {
			switch(indiceTri) {
			case 0: 
				liste = dao.getAll();
				break;
			case 1:
				liste = dao.OByIdUser();
				break;
			case 2:
				liste = dao.OByLibelle();
				break;
			case 3:
				liste = dao.OByDiffusable();
				break;
			case 4:
				liste= dao.OByDate();
				break;
			}
		}else {
//			switch(indiceSearch) {
//			case 0:
//				liste=dao.findById(id);
//				break;
//			case 1 :
//				liste=dao.findByIdUser(id_user);
//				break;
//			case 2 :
//				liste= dao.findByLibelle(libelle);
//				break;
//			case 3 :
//				liste = dao.findByDiffusable(diffusable);
//				break;
//			case 4 : 
//				liste = dao.findByDate(date);
//				break;
//			case 5 :
//			    liste = dao.findByContenu(contenu);
//			    break;
//			}
		}
		
		

		

		JSONArray array = new JSONArray();
		for (int i = 0; i < liste.size(); i++) {
			Idea idea = liste.get(i);
			JSONArray json = new JSONArray();
			List<String> userParams = new ArrayList<>();

			userParams.add(String.valueOf(idea.getIdIdea()));
			userParams.add(String.valueOf(idea.getIdUser()));
			userParams.add(idea.getLibelle());
			userParams.add(idea.getText());
			userParams.add(String.valueOf(idea.isDiffusable()));
			userParams.add(String.valueOf(idea.getCurrentDate()));
			json.put(userParams.get(0));
			json.put(userParams.get(1));
			json.put(userParams.get(2));
			json.put(userParams.get(4));
			json.put(userParams.get(5));
			json.put(userParams.get(3));

			array.put(json);

		}

		return array;

	}

	public String AffichageDonnees(JSONArray json) {
		String table;

		table = "<table>";
		table += "<thead>";
		table += "<tr> <th>Id Idee</th> <th>Id Utilisateur</th> <th>Libelle</th> <th>Diffusable</th> <th>Date</th> <th>Contenu</th> </tr>";

		table += "</thead>";
		table += "<tbody>";

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
		table += "</tbody>";
		table += "</table>";

		// System.out.println(table);
		return table;

	}
}
