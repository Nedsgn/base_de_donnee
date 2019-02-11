package fr.nedjma.basededonnees.animaux.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.nedjma.basededonnees.animaux.buisness.impl.AnimauxBuisness;



/**
 * Servlet implementation class AnimauxServlet
 */
@WebServlet("/animaux")
public class AnimauxServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	//c'est pour relier la servlet à la class buisness , on a donc créer un objet animauxBZ de type AnimauxBuisness
    AnimauxBuisness animauxBZ = new AnimauxBuisness();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimauxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//on récupere le contenu du tableau qui se trouve dans le buisness en créant un nouveau tableau listeAnimaux
		
		ArrayList<String> listeAnimaux = animauxBZ.getAnimaux() ; 
		ArrayList<String> typeAnimaux = animauxBZ. getTypesAnimaux() ;
		ArrayList<Integer> vieAnimaux = animauxBZ. getVieAnimaux() ;
		ArrayList<Integer> poidsAnimaux = animauxBZ. getPoidsAnimaux() ;
		
		request.setAttribute("listeNomAnimaux", listeAnimaux);
		request.setAttribute("typeAnimaux", typeAnimaux);
		request.setAttribute("vieAnimaux", vieAnimaux);
		request.setAttribute("poidsAnimaux", poidsAnimaux);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/animaux.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
