package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
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
		//Falls ja: den Container aus der Session auslesen:
		NotizContainer notizen = getContainerFromCurrentSession(request);		
		
		//form erstellen:
		String form = "<form  method=\"post\"> \n"
			    + " <input type=\"text\" name=\"notiz\" value=\"\" /> \n"
			    + " <input type=\"submit\" value=\"speichern\"  />     \n"
			    + "</form>  \n" ;
		
		//Ul erstellen mit ausgelesenen Notizen:
		String notizUl = erstelleULNotizen(notizen);			
		
		String deleteForm = " <form method=\"post\" /> \n "
				          + "    <input type=\"submit\" name=\"delete\" value=\"entfernen\" /> "
				          + " </form> ";
		
		//Seite + generierten Inhalt ausgeben
		printPage(response.getWriter(), form + notizUl + deleteForm);
	}//doGet
	
	
		
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//Notizen löschen
		if (request.getParameter("delete") != null) {
				deleteContainer(request);
		} else {
			//wenn nichts eingegeben:
			if (request.getParameter("notiz") == null ||  request.getParameter("notiz").equals("")) {
				out.println("<font color=\"red\">Es muss eine Notiz angegeben werden!</font>");
			} else {
									
				//Container füllen:
				NotizContainer notizen = getContainerFromCurrentSession(request);	
			    //Notiz hinzufügen
				notizen.getNotizen().add( new Notiz( new Date(), request.getParameter("notiz")));
		        out.println("<font color=\"green\">Notiz sind drin!</font>");
			}//if else
		}//if else
		
		doGet(request, response);
	}//doPost
	
	
	
	
	
	private NotizContainer getContainerFromCurrentSession( HttpServletRequest request ){
		//1. session auslesen
		HttpSession currentSession = request.getSession(true);		
		//Prüfen ob Session neu und Container vorhanden
		//gibt es Notizcontainer in dieser Session für diesen key?
		if (currentSession.getAttribute("notizen") == null)  {
			//falls nein, ordne einen neuen zu
			currentSession.setAttribute("notizen", new NotizContainer());
		} 		
		//Container füllen
		return (NotizContainer) currentSession.getAttribute("notizen");
	}
	
	
	
	
	private void deleteContainer( HttpServletRequest request ){
		//1. session auslesen
		HttpSession currentSession = request.getSession(true);		
		//Prüfen ob Session neu und Container vorhanden
		//gibt es Notizcontainer in dieser Session für diesen key?
		if (currentSession.getAttribute("notizen") != null)  {
			//falls nein, ordne einen neuen zu
			currentSession.setAttribute("notizen", null);
		} 		
	}
	
	
	
	
	
	
	//Ul für notizen erstellen:	
	private String erstelleULNotizen( NotizContainer notizen ){	
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		String content = "<h1> Gespeicherte Notizen: </h1> \n"
				       + "	<ul> \n";		
		// Notizen aus dem Container auslesen (Falls vorhanden)
		for (Notiz notiz : notizen.getNotizen() ) {
			 content += "<li>" + new SimpleDateFormat("dd.MM.yyyy HH:mm").format(notiz.getDatum())  
			          + "  [  " +  notiz.getInhalt() + "  ]</li> \n";
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
