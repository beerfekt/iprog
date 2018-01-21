package aufgabe3.beer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Aufgabe3")
public class Aufgabe3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Aufgabe3() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
      String form = "   <form action=\"Aufgabe3\" method=\"post\"> \n"
    		      + "     <input type=\"text\" name=\"firstname\" value=\"input firstname\" /> \n "
    		      + "     <input type=\"text\" name=\"lastname\"  value=\"input lastname\" /> \n"
    		      + "     <input type=\"submit\" value=\"send\" /> \n"
    		      + "   </form>\n";		
		
		//String samt Output an MEthode zum Schreiben:
		printPage(response.getWriter(), form);			
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Eingaben auslesen: 
		String firstName = request.getParameter("firstname") != null ? request.getParameter("firstname") : "max";
		String lastName = request.getParameter("lastname") != null ? request.getParameter("lastname") : "mustermann";
		//Antwort zusammenbasteln
		String answer =  "<h1>Benutzerdaten: </h1> \n"
		        +"<ul> \n"
		        +" <li>"+firstName +"</li> \n"
		        +" <li>"+lastName+"</li> \n"
		        +"<ul> \n" ;		
		//Output erstellen:

		printPage(response.getWriter(), answer);
	}

	
    private void printPage(PrintWriter out, String part){
	
        String head = "<!DOCTYPE html> \n"
			     	+ "<html>  \n"
			     	+ "  <head>  \n"
			     	+ "    <meta charset=\"UTF-8\"> \n"
			     	+ "    <title>Ue9 - Aufgabe3</title> \n"
			     	+ "  </head>  \n"
			     	+ "  <body> \n";		
		
		String foot = "  </body>\n"
			     	+ "</html>  \n";		
		
		out.println(head + part + foot);    
		System.out.println(head + part + foot);
    }
	
}
