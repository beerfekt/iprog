

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Aufgabe2
 */
@WebServlet("/date2")
public class Aufgabe2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Aufgabe2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//AUFGABE2
		/////////////////////////////////////////////////
		/*
		PrintWriter writer = response.getWriter();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,
				                                       DateFormat.SHORT,
				                                       Locale.forLanguageTag(request.getParameter("lang")));
				                                       */
		 ///////////////
		
		//Aufgabe3
		PrintWriter writer = response.getWriter();
		writer.append("<h1>Benutzereingabe war</h1>");
		.append("<ul>");
		.append("<li>").append(request.getParameter("vname")==null?"Max":request.getParameter("vname")).append("</li>");
		.append("<li>").append(request.getParameter("nname")== null ? "MusterMann" : request.getParameter("nname")).append("</li>");
		.append("</ul>");
		
		///AUFGABE 3 end
	}

	
	//Aufgabe3
	private String testeEingabe() {
		// variable = wert ? ja dann mach das : nein dann mach das;
	}
	//////////////
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
