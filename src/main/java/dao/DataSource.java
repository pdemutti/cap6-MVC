package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	private Connection connection;
		
	public DataSource() {
	      try {
	         Class.forName("org.postgresql.Driver");
	         connection = DriverManager
	            .getConnection("jdbc:postgresql://ec2-52-200-68-5.compute-1.amazonaws.com:5432/d28jiimgl2ajl0",
	            "xclspaxkjqlgxo", "4b88ad90f0ec2d16acf6a1b1e1f1607fbf51ffbea77802d0e7656e41adbc752a");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	}
	
	public Connection getConnection(){
         return this.connection;
 	}
}