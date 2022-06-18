package loaderDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Matrix;
import testconnect.Util;

public class LoadMatrixDB {
	public LoadMatrixDB() {
		
	}
	
	public void insertInTo() throws SQLException {
		Util conn = new Util();
		conn.init();
		String sql = "insert into Matrix(subgroup_name, group_name, sub_category, category, sku,\n"
				+ "				item_code, store_code, store_name, cooperation_scheme, format, on_the_road,\n"
				+ "				stock, min_matrix, max_matrix, adress, bz, assortment_type, date_in,\n"
				+ "				date_out, sold_in14days, promotion, stock_substitute, on_the_road_substitute,\n"
				+ "				bzh) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? )";
		
		PreparedStatement stmt = conn.createStatement(sql);
		stmt.executeUpdate("DELETE FROM Matrix");
		
		for (Matrix Matrix : Matrix.arrayListMatrix) {

			String sqlAddMatrix;
			sqlAddMatrix = "insert into Matrix(subgroup_name, group_name, sub_category, category, sku, item_code, store_code, store_name, cooperation_scheme, format, on_the_road, stock, min_matrix, max_matrix, adress, bz, assortment_type, date_in, date_out, sold_in14days, promotion, stock_substitute, on_the_road_substitute, bzh) VALUES (\""
					+ Matrix.getSubgroup_name() 	+ "\", "
					+ "\"" + Matrix.getGroup_name()	+"\", "
					+ "\"" + Matrix.getSub_category()+ "\", "
					+ "\"" + Matrix.getCategory()	+"\", "
					+ "\"" + Matrix.getSku()		+"\", "
					+ Matrix.getItem_code()			+", "
					+ Matrix.getStore_code()		+", "
					+ "\"" + Matrix.getStore_name()	+ "\" ,"
					+ "\"" + Matrix.getCooperation_scheme()	+"\", "
					+ "\"" + Matrix.getFormat()		+"\", "
					+ Matrix.getOn_the_road()		+", "
					+ Matrix.getStock()				+", "
					+ Matrix.getMin_matrix()		+", "
					+ Matrix.getMax_matrix()		+", "
					+ Matrix.getAdress()			+", "
					+ Matrix.getBz()				+", "
					+ "\"" + Matrix.getAssortment_type()	+"\", "
					+ "\"" + Matrix.getDate_in()	+"\", "
					+ "\"" + Matrix.getDate_out()	+"\", "
					+ Matrix.getSold_in14days()		+", "
					+ Matrix.getPromotion()			+", "
					+ Matrix.getStock_substitute()	+", "
					+ Matrix.getOn_the_road_substitute()+", "
					+ Matrix.getBzh()
					+ ")";
			System.out.println("sqlinsert = "+ sqlAddMatrix);
			
			stmt.executeUpdate(sqlAddMatrix);
		}
		
		conn.close();
		System.out.println("table \"Matrix\" updated");
		
	}

}
