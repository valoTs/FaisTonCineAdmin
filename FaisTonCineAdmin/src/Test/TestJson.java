package Test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Model.ModeleUser;

public class TestJson {

	public static void main(String[] args) {
		// ************************************ TEST Model/ModeleUser/
		// **********************************
//		ModeleUser mu = new ModeleUser();
//		JSONArray json = mu.recupDonneesUser();
//
//		for (int i = 0; i < json.length(); i++) {
//			JSONArray test = new JSONArray();
//			test = (JSONArray) json.get(i);
//			for (int j = 0; j < test.length(); j++) {
//				try {
//					System.out.println(test.get(j).toString());
//				} catch (JSONException e) {
//					System.out.println("null");
//				}
//
//			}
//
//		}

		// **********************************************************************************************
		ModeleUser mu = new ModeleUser();
		JSONArray json = mu.recupDonneesUser();
		String chaine = mu.AffichageDonnees(json);
		System.out.println(chaine);
		
	}

}
