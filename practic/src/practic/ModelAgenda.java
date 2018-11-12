package practic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ModelAgenda {
	
	public List<Agenda> listaAgenda(){
		
		List<Agenda> datos= new ArrayList<Agenda>();
		
		Connection con = null;
		PreparedStatement pst=null;
		ResultSet rs = null;
		try {
			con = new MiConexion().getConnection();
			String codMySql="select*from tb_agenda";
			pst= con.prepareStatement(codMySql);
			
			Agenda a = null;
			
			while (rs.next()) {
				a= new Agenda();
				a.setId(rs.getInt(" ID Agenda"));
				a.setApellidos(rs.getString("Apellidos "));
				a.setNombre(rs.getString("Nombres"));
				a.setDirrecion(rs.getString("Dirrecion"));
				a.setEdad(rs.getInt("edad"));
				a.getFechaNac(rs.getDate("Fecha Ncimiento").toString());
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
