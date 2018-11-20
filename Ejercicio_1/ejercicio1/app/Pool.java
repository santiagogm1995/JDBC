package ejercicio1.app;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Pool {
	private BasicDataSource basicDataSource;
	private static Pool instance = null;
	
	private Pool()
	{
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("1234");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/Ejercicio1?serverTimezone=UTC");

	}
	
	public static Pool getInstance()
	{
		if(instance == null)
			instance = new Pool();
		
		return instance;
	}

	public BasicDataSource getBasicDataSource() {
		return basicDataSource;
	}
	
	

}
