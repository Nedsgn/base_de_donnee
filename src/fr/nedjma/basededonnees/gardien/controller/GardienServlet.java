package fr.nedjma.basededonnees.gardien.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.nedjma.basededonnees.gardien.bean.GardienBean;
import fr.nedjma.basededonnees.gardien.buisness.impl.GardienBuisness;

/**
 * Servlet implementation class GardienServlet
 */
@WebServlet("/gardien")
public class GardienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       GardienBuisness GardienBZ = new GardienBuisness();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GardienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<GardienBean> Gardien = GardienBZ.getGardienBean();
		request.setAttribute("Gardien", Gardien);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/gardien/gardien.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
