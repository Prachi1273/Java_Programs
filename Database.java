import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Database  
{	
   public static void main(String a[]) throws java.lang.Exception
   {
      String URL ="jdbc:postgresql://localhost:5432/ppa41";
      String Username = "root";
      String Password ="root";
      String Query  = "select * from student";
      Class.forName("org.postgresql.Driver");
      Connection cobj = DriverManager.getConnection(URL,Username,Password);
      
      Statement  sobj = cobj.createStatement();
      
      ResultSet  robj = sobj.executeQuery(Query);
      
      while(robj.next())
      {
         System.out.println("rid : "+robj.getInt("rid"));
         System.out.println("name : "+robj.getString("name"));
         System.out.println("city : "+robj.getString("city"));
         System.out.println("marks : "+robj.getInt("marks"));
      }
   }
}
