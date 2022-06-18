package loaderDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.StoreLinkShoppe;
import testconnect.Util;

public class LoadStoreLinkShoppeDB {


	public void insertInTo() throws SQLException {
		Util conn = new Util();
		conn.init();
		String sql = "insert into store_link_shop(shop_code, store_code) VALUES (?	, ? )";
		
		PreparedStatement stmt = conn.createStatement(sql);
		stmt.executeUpdate("DELETE FROM store_link_shop");
		
		for (StoreLinkShoppe sls : StoreLinkShoppe.arrayListStoreLinkShoppe) {
	
			String sqlAddStoreLinkShoppe;
			sqlAddStoreLinkShoppe = "insert into store_link_shop(shop_code, store_code) VALUES ("
					+ sls.getShoppeCode() 
					+ ","
					+ sls.getStoreCode() 
					+ ")";
//			System.out.println("sqlinsert = "+ sqlAddStoreLinkShoppe);
			
			stmt.executeUpdate(sqlAddStoreLinkShoppe);
		}
		
		conn.close();
		System.out.println("table \"store_link_shop\" updated");
	}


}

