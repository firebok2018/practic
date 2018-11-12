package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class MiConexion {
	
	private final String URL="jdbc:mysql://localhost:3306/bd_agenda";
	private final String USER="root";
	private final String PASS="mysql";
	
	public MiConexion() {}
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL,USER,PASS);
			//JOptionPane.showMessageDialog(null, "Buscando ....");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	

}
