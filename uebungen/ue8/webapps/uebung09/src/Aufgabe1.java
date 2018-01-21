

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Aufgabe1
 */
@WebServlet("/date")
public class Aufgabe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//HIER ÄNDERUNGEN UEBUNG09
	DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT);

    /**
     * Default constructor. 
     */
    public Aufgabe1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		//HIER ÄNDERUNGEN UEBUNG09
		PrintWriter out = response.getWriter();
		response.setContentType("Text/html");
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body>");
		out.println(buffer.toString());
		
		
		
	}

}
