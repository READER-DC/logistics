package loaderDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Stock;
import testconnect.Util;

public class LoadStockDB {
	
	
	
	public LoadStockDB() {
		
	}

	public void insertInTo() throws SQLException {
		Util conn = new Util();
		conn.init();
		String sql = "insert into stock(skladName,  itemCode, itemName, inReserve,  allStock, cost, freeStock,\n"
				+ "				inReserveForm, pCost, generalStock, relevance, arrival, subCategory,\n"
				+ "				inDelivery, brand) VALUES ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,? )";
		
		PreparedStatement stmt = conn.createStatement(sql);
		stmt.executeUpdate("DELETE FROM stock");
		
		for (Stock ss : Stock.arrayListStock) {

			String sqlAddStock;
			sqlAddStock = "insert into stock(skladName,  itemCode, itemName, inReserve,  allStock, cost, freeStock,\n"
					+ "				inReserveForm, pCost, generalStock, relevance, arrival, subCategory,\n"
					+ "				inDelivery, brand) VALUES ("
					+ "\"" + ss.getSkladName() + "\", "
					+ ss.getItemCode() + ", "
					+ "\"" + ss.getItemName() +"\", "
					+ ss.getInReserve() + ", "
					+ ss.getAllStock() + ", "
					+ ss.getCost() + ", "
					+ ss.getFreeStock() + ", "
					+ ss.getInReserveForm() + ", "
					+ ss.getPCost() + ", "
					+ ss.getGeneralStock() + ", "
					+ "\"" + ss.getRelevance()+"\", "
					+ "\"" + ss.getArrival()+"\", "
					+ "\"" + ss.getSubCategory()+"\", "
					+ "\"" + ss.getInDelivery()+"\", "
					+ "\"" + ss.getBrand()+"\""
					+")";
					
//			System.out.println("sqlinsert = "+ sqlAddStockSklad);
			
			stmt.executeUpdate(sqlAddStock);
		}
		
		conn.close();
		
		System.out.println("table \"stock\" updated");
		
	}

}
