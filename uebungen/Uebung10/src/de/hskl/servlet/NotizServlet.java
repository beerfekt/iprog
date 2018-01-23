package de.hskl.servlet;

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

import de.hskl.model.Notiz;
import de.hskl.model.NotizContainer;

/**
 * Servlet implementation class NotizServlet
 */
@WebServlet("/NotizServlet")
public class NotizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NotizServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		HttpSession session = request.getSession();
		HttpSession session = request.getSession(true);
		if(session.getAttribute("notizen") == null) {
			session.setAttribute("notizen", new NotizContainer());
		}
		NotizContainer container = (NotizContainer) session.getAttribute("notizen");
		
		/* Ausgabe */
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
		out.println("<title>Notizapp</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method=\"POST\">");
		out.println("<input type=\"text\" name=\"notiz\"><input type=\"submit\" value=\"Speichern\">");
		out.println("</form>");
		out.println("<h1>Meine Notizen</h1>");
		/* Notizen ausgeben */
		for(Notiz n : container.getNotizen()) {
			out.println(n.getInhalt() + " (" + sdf.format(n.getDatum()) + ")<br />");
		}
		out.println("<form method=\"POST\">");
		out.println("<input type=\"submit\" name=\"delete\" value=\"Notizen l&ouml;schen\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true); // Analog zu request.getSession();
		PrintWriter out = response.getWriter();
//		if(request.getParameter("delete") != null) {
//			// Notizen loeschen
//			//session.invalidate(); // Suboptimal, da !!alle!! Daten in der Session verloren sind
//			session.removeAttribute("notizen");
//			out.println("<font color=\"green\">Notizen wurden gel&ouml;scht!</font>");
//		} else {
			// Notiz hinzufuegen
			if(request.getParameter("notiz") == null || request.getParameter("notiz").equals("")) {
				out.println("<font color=\"red\">Es muss eine Notiz angegeben werden!</font>");
			} else {
				 if(session.getAttribute("notizen") == null) {
					session.setAttribute("notizen", new NotizContainer());
				}
				
				NotizContainer container = (NotizContainer) session.getAttribute("notizen");
				
				container.getNotizen().add(new Notiz(request.getParameter("notiz"), new Date()));
				out.println("<font color=\"green\">Notiz wurde gespeichert!</font>");
			}
//		}
		doGet(request, response);
	}

}
