package testconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Util {
		private static final String url = "jdbc:mysql://localhost:3306/db_logistics";
		private static final String username = "root";
		private static final String password = "root";
		Connection connection = null;
		private Connection getConnection() throws SQLException{
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected database!");
			return connection;
		}
		public void init() throws SQLException {
			connection = getConnection();
		}
		
		public void close() throws SQLException {
			connection.close();
			
		}
		public PreparedStatement createStatement(String sql) throws SQLException {
			
			return connection.prepareStatement(sql);
		}

		
}
