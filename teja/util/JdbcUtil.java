package in.teja.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {

	private JdbcUtil() {
	}

	static {
		// Step1: loading and register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	public static Connection getJdbcConnection() throws SQLException, IOException {

//		 //STEP 02 establish connection to database
	      String url="jdbc:mysql://localhost:3306/teja";
	   
	       //username and password may vary person to person
	       String username="root";
           String password="Kiran@5327";
	       Connection connection =DriverManager.getConnection(url,username,password);
	
//		// Take the data from properties file
//	       FileInputStream fis=new FileInputStream("Application1.properties");
//		   Properties prop =new Properties();
//		   prop.load(fis);
//
//		// Step2. Establish the Connection
//		Connection connection = DriverManager.getConnection(prop.getProperty("url"),
//		prop.getProperty("username"), prop.getProperty("password"));
//		System.out.println("CONNECTION object created...");
		return connection;
	}

	public static void cleanUp(Connection con, Statement statement, ResultSet resultSet) throws SQLException {
		// Step6. Close the resources
		if (con != null) {
			con.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (resultSet != null) {
			resultSet.close();
		}
	}
}