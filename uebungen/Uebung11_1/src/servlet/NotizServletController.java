package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.NotizContainer;

/**
 * Servlet implementation class NotizServlet
 */
@WebServlet("/NotizServlet")
public class NotizServletController extends HttpServlet
{
   private static final long serialVersionUID = 1L;
   private static final String NOTIZCONTAINER = "notizen";
   
   public NotizServletController()
   {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
      String msg = request.getParameter("notiz");
      String deleteNotizen = request.getParameter("delete");
      
      HttpSession session = request.getSession();
      
      NotizContainer container = (NotizContainer) session.getAttribute(NOTIZCONTAINER);
      if( container == null )
      {
         container = new NotizContainer();
         session.setAttribute(NOTIZCONTAINER, container);
      }
      
      if( deleteNotizen != null )
         container.clear();
      
      if( msg != null )
         container.createNotiz(msg);    
      
      this.getServletContext().getRequestDispatcher("/notizen.jsp").forward(request, response);
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
      this.doGet(request, response);
   }

}
