package loaderDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entyty.StoreCode;
import testconnect.Util;

public class LoadStoreCodeDB {
	
	
	public LoadStoreCodeDB() {
	
	}
	public void insertInTo() throws SQLException {
		Util conn = new Util();
		conn.init();
		String sql = "insert into storecode(storecode, storename) VALUES (?	, ? )";
		
		PreparedStatement stmt = conn.createStatement(sql);
		stmt.executeUpdate("DELETE FROM storecode");
		
		for (StoreCode sc : StoreCode.arrayListStoreCodes) {

			String sqlAddStoreCode;
			sqlAddStoreCode = "insert into storecode(storecode, storename) VALUES ("
					+ sc.getStoreCode() 
					+ ",\""
					+ sc.getStoreName() 
					+ "\")";
//			System.out.println("sqlinsert = "+ sqlAddStoreCode);
			
			stmt.executeUpdate(sqlAddStoreCode);
		}
		
		conn.close();
		System.out.println("table \"storecode\" updated");
		
	}
	

}
