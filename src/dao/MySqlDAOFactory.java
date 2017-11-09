package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDAOFactory {
	public static final String driver = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static final String dbUserName = "system";
	public static final String dbPassword = "123";
	
	public static Connection createConnection()throws ClassNotFoundException
	{
		  Connection conn = null;
		  try 
		  {
			  
			 Class.forName(driver);
			 conn = DriverManager.getConnection(url, dbUserName, dbPassword);	
			 if(conn!=null)
			 System.out.println("Connection enabled");
			
		  } 
	
		  catch (Exception e) 
		  {
			  e.printStackTrace();
		  }
		  return conn;
	}
}
