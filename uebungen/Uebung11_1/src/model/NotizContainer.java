package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NotizContainer implements Serializable
{
   private static final long serialVersionUID = -2571548052232563465L;
   private List<Notiz> notizen = new ArrayList<>();
   
   public NotizContainer()
   {
      super();
   }
   
   public void createNotiz(String message)
   {
      this.notizen.add( new Notiz(message));
   }
   
   public void clear()
   {
      this.notizen = new ArrayList<Notiz>();
   }
   
   public String getAsHtml()
   {
      if( this.notizen.size() == 0 )
         return "";
      
      StringBuilder strBuilder = new StringBuilder();
      
      
      strBuilder.append("<ul>");
      for( Notiz n : notizen)
      {
         strBuilder.append("<li>" + n.getMessage() + "</li>");
      }
      strBuilder.append("</ul>");
      
      return strBuilder.toString();
   }

}
