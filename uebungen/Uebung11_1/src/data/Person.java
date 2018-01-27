package data;

public class Person
{
   private String vorname = "";
   private String nachname = "";

   public Person()
   {
      super();
   }
   
   public Person(String vname, String nname)
   {
      super();
      this.setVorname( vname );
      this.setNachname( nname );
      
   }

   public String getVorname()
   {
      return this.vorname.toUpperCase();
   }

   public void setVorname(String vorname)
   {
      this.vorname = vorname;
   }

   public String getNachname()
   {
      return this.nachname.toUpperCase();
   }

   public void setNachname(String nachname)
   {
      this.nachname = nachname;
   }

   
}
