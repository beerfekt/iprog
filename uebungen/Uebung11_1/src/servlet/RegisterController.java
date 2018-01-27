package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Person;

@WebServlet("/register")
public class RegisterController extends HttpServlet
{
   private static final long serialVersionUID = 1L;

   public RegisterController()
   {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
      String vname = request.getParameter("vname");
      String nname = request.getParameter("nname");
      
      Person p = new Person(vname,nname);
      
      request.setAttribute("person", p);
      
      this.getServletContext().getRequestDispatcher("/person.jsp").forward(request, response);
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
      this.doGet(request, response);
   }

}
