package Servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.VerificationFormulaire;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Connexion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");

		VerificationFormulaire verif = new VerificationFormulaire();

		HashMap<String, String> MapError = verif.CreationErrors(username, password);
		if (MapError.isEmpty()) {
			String message = verif.verifFormulaire(username, password);
			if (message.equals("connexion réalisée avec succès")) {
				// renvoyer vers une nouvelle jsp , depuis laquelle tu essayera de faire l appel
				// ajax connard :https://www.jmdoudoux.fr/java/dej/chap-ajax.htm .
				this.getServletContext().getRequestDispatcher("/WEB-INF/AffichageDonnees.jsp").forward(request,
						response);
				;
			} else {
				request.setAttribute("message", message);
				request.setAttribute("erreurs", MapError);
				this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
				;
			}
		}
	}
}
