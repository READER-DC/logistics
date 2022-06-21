package loaderDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.StockSklad;
import testconnect.Util;

public class LoadStockSkladDB {
	
	
	
	public LoadStockSkladDB() {
		
	}

	public void insertInTo() throws SQLException {
		Util conn = new Util();
		conn.init();
		String sql = "insert into stock_sklad(skladName,  itemCode, itemName, inReserve,  allStock, cost, freeStock,\n"
				+ "				inReserveForm, pCost, generalStock, relevance, arrival, subCategory,\n"
				+ "				inDelivery, brand) VALUES ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,? )";
		
		PreparedStatement stmt = conn.createStatement(sql);
		stmt.executeUpdate("DELETE FROM stock_sklad");
		
		for (StockSklad ss : StockSklad.arrayListStockSklads) {

			String sqlAddStockSklad;
			sqlAddStockSklad = "insert into stock_sklad(skladName,  itemCode, itemName, inReserve,  allStock, cost, freeStock,\n"
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
			
			stmt.executeUpdate(sqlAddStockSklad);
		}
		
		conn.close();
		
		System.out.println("table \"stock_sklad\" updated");
		
	}

}
