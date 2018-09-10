package Servlet;

import java.io.IOException;
import java.io.Writer;
import java.security.KeyStore.Entry;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import Model.ModeleUser;

/**
 * Servlet implementation class RecuperationDonneeUser
 */

public class RecuperationDonneeUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RecuperationDonneeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		Enumeration<String> keys = request.getParameterNames();
//		TreeMap<String,String> map = new TreeMap<String, String>(); 
//		String key = null; 
//		while(keys.hasMoreElements()){ 
//		      key = keys.nextElement().toString(); 
//		      map.put(key, request.getParameter(key)); 
//		}
		
//		for(java.util.Map.Entry<String, String> entrie : map.entrySet()) {
//			indiceTri=Integer.parseInt(entrie.getValue());
//		}
		
		int indiceTri=Integer.parseInt(request.getParameter("indiceTri"));
		System.out.println("indice tri : "+ indiceTri);
		int indiceSearch = Integer.parseInt(request.getParameter("indiceSearch"));
		System.out.println("indice Search  : "+ indiceSearch);
		int etat = Integer.parseInt(request.getParameter("etat"));
		System.out.println("etat: "+ etat);
		String libelleSearch = request.getParameter("libelleSearch");
		System.out.println("Libelle recherche :" + libelleSearch);
		String paramSearch = request.getParameter("paramSearch");
		System.out.println("valeur recherche "+ paramSearch);
		
		
		ModeleUser modele = new ModeleUser();
		JSONArray donneeJson = modele.recupDonneesUser(indiceTri,indiceSearch,etat,libelleSearch,paramSearch);
		String table = modele.AffichageDonnees(donneeJson);
		request.setAttribute("data", table);

		Writer out = response.getWriter();
		out.write(table);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
