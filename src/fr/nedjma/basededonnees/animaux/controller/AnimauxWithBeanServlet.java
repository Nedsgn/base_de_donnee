package fr.nedjma.basededonnees.animaux.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.nedjma.basededonnees.animaux.bean.Animal;
import fr.nedjma.basededonnees.animaux.buisness.impl.AnimauxBuisness;

/**
 * Servlet implementation class AnimauxWithBeanServlet
 */
@WebServlet("/animaux-bean")
public class AnimauxWithBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       AnimauxBuisness animalBZ = new AnimauxBuisness();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimauxWithBeanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ArrayList<Animal> animaux = animalBZ.getAnimal();// c'est un objet qui contient tous les autres objets
		
		request.setAttribute("animaux", animaux);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/animaux/animaux-bean.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
