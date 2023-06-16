package projetofinal.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton
public class ConnectionFactory {
	
	private static Connection conn = null;
	  
  static
  {
      String url = "jdbc:postgresql://localhost:5432/postgres";
      String user = "postgres";
      String pass = "103301";
      try {
          Class.forName("org.postgresql.Driver");
          conn = DriverManager.getConnection(url, user, pass);
      }
      catch (ClassNotFoundException | SQLException e) {
          e.printStackTrace();
      }
  }
  public static Connection getConnection()
  {
      return conn;
  }
}
