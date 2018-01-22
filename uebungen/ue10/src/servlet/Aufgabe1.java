package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Notiz;
import model.NotizContainer;


//1. HTML SEite über request methode ausgeben

  //Servlet - doGet
    // Form erstellen welche Key übergibt
    // 1.0 form method="post" 
	// 1.1 form name="keyFürSession"  value="wertFürSession" />

	//Sessionobjekt
	// 2.0 Neues SessionOBjekt erstellen (fallsnicht vorhanden)
    // 2.1 Wenn kein wert für (keyFürSession) vorhanden -> neue Notiz für den Key
    
    // Container für sessionobjekt
	// 2.2 Container für diesen KEy auslesen
    // 2.3          werte ausgeben.



@WebServlet("/Aufgabe1")
public class Aufgabe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Aufgabe1() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//NOTIZEN AUSLESEN
		
		
		//Sessionobjekt erstellen
		HttpSession currentSession = request.getSession(true);
		
		
		//gibt es Notizcontainer in dieser Session für diesen key?
		if ( currentSession.getAttribute("notizen") == null ) {
			//falls nein, erstellen, zuordnen
			currentSession.setAttribute("notizen", new NotizContainer());
		}
		
		//Falls ja: den Container aus der Session auslesen:
		NotizContainer notizen = (NotizContainer) currentSession.getAttribute("notizen");
		
		
		//form erstellen:
		String form = "<form  method=\"post\"> \n"
			    + " <input type=\"text\" name=\"notiz\" value=\"\" /> \n"
			    + " <input type=\"submit\" name=\"speichern\"  />     \n"
			    + "</form>  \n" ;
		
		
		//Ul erstellen mit ausgelesenen Notizen:
		String notizUl = erstelleULNotizen(notizen);
					
		
		
		//Seite + generierten Inhalt ausgeben
		printPage(response.getWriter(), form + notizUl);
	}//doGet
	
	
		
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		
		//NOTIZ EINLESEN:
		
		
		//1. session auslesen
		HttpSession currentSession = request.getSession(true);
		
		//2. werte einpflegen:
		
		//wenn nichts eingegeben:
		if (request.getParameter("notiz") == null ||  request.getParameter("notiz").equals("")) {
			out.println("<font color=\"red\">Es muss eine Notiz angegeben werden!</font>");
		} else {
			
			//Prüfen ob Session neu und Container vorhanden
			if (currentSession.getAttribute("notizen") == null)  {
				currentSession.setAttribute("notizen", new NotizContainer());
			} 
			
			
			//Container füllen:
			NotizContainer notizen = (NotizContainer) currentSession.getAttribute("notizen");
			notizen.getNotizen().add( new Notiz( new Date(),request.getParameter("notiz")));
	        out.println("<font color=\"green\">Notiz sind drin!</font>");
		}
		
		doGet(request, response);
	}//doPost
	
	
	
	
	
	//Ul für notizen erstellen:
	
	private String erstelleULNotizen( NotizContainer notizen ){
		
		String content = "<h1> Gespeicherte Notizen: </h1> \n"
				       + "	<ul> \n";
		
		// Notizen aus dem Container auslesen (Falls vorhanden)
		for (Notiz notiz : notizen.getNotizen() ) {
			 content += "<li>"  + notiz.getInhalt() + "</li> \n";
		}
		
		content += " </ul> \n";		
		
		return content;
	}
	
	
	
	
	//Seitenelemente ausgeben:
	private void printPage(PrintWriter out, String content){
		
		String head   = "<!DOCTYPE html> \n"
				      + "<html lang=\"en\"> \n  "
				      + "	<head> \n"
				      + "		<meta charset=\"UTF-8\"> \n"
				      + "		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n"
				      + "		<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"> \n"
				      + "		<title>Uebung10 - Aufgabe 1</title> \n"
				      + "	</head> \n "
				      + "	<body> \n";	
		
		String footer = "	</body>"
				      + "</html> \n" ;
				    
	
	out.println(head + content + footer);
	
	}//printPage
	
	
	
	
	
}//Servlet
