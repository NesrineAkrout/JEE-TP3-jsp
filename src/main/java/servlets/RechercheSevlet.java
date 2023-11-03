package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Stock.Classes.*;

/**
 * Servlet implementation class RechercheSevlet
 */
public class RechercheSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechercheSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String motCle = request.getParameter("mot-cle");
		 Stock.initialiserStock();
		
	        // Rechercher les produits pertinents
	        List<Produit> produitsPertinents = new ArrayList<>();
	       

	        if (motCle != null && !motCle.isEmpty()) {
	        	
	            for (Produit produit : Stock.getStock()) {
	            	
	                if (produit.getLibelle().toLowerCase().contains(motCle.toLowerCase())) {
	                	produitsPertinents.add(produit);
	                	
	                }
	            }
	        }
	        request.setAttribute("resultats", produitsPertinents);
	      //  request.getRequestDispatcher("resultats.jsp").forward(request, response);
	        request.getRequestDispatcher("resultatsv2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
