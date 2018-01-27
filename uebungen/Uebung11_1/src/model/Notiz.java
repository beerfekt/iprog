package model;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

public class Notiz implements Serializable
{
   private static final long serialVersionUID = -1967124495050018030L;
   private static DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
   private String message = null;
   
   public Notiz(String message)
   {
      super();
      this.message = message + " (" + formatter.format(new Date() ) + ")";
   }
   
   public String getMessage()
   {
      return this.message;
   }
}
