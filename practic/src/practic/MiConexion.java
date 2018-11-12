package practic;

import java.sql.Connection;
import java.sql.DriverManager;

public class MiConexion{
	
	private final String url="jdbc:mysql://localhost:3306/bd_agenda";
	private final String user="root";
	private final String pwd="mysql";
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		Connection con= null;
		try {
			con=DriverManager.getConnection(url,user,pwd);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}

}
