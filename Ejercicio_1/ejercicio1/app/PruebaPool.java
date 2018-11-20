package ejercicio1.app;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;


public class PruebaPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicDataSource basicDataSource = Pool.getInstance().getBasicDataSource();
		try (Connection conexion = basicDataSource.getConnection();)
		{
			PreparedStatement s = conexion.prepareStatement("select 1");
			ResultSet resultado = s.executeQuery();
			
			while(resultado.next())
				System.out.println(resultado.getString(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
