package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBPool {
	
	private static Connection[] conn;
	
	private static int index;
	private static int length = 5;
	
	private DBPool() {
	}
	
	public static Connection getConnection() {
		if(conn == null) {
			synchronized (DBPool.class) {
				if(conn == null)
					criarPool();
			}
			
		}
		
		index = (index + 1) % length;
		return conn[index];
		
	}
	
	private static void criarPool() {
		Properties props = loadProperties();
		String url = props.getProperty("dburl");
		
		conn = new Connection[length];
		
		for(int i = 0; i < length; i++) {
			try {
				conn[i] = DriverManager.getConnection(url, props);
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
			
		}
		
	}

	private static Properties loadProperties() {
		try(FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch(IOException e) {
			throw new DbException(e.getMessage());
		}
		
	}
	
}
