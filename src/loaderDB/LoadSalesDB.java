package loaderDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Sales;
import testconnect.Util;

public class LoadSalesDB {
	
	public LoadSalesDB() {
		
	}
	
	public void insertInTo() throws SQLException {
		Util conn = new Util();
		conn.init();
		String sql = "insert into sales(invoicePayer, statu, businessTransaction, basicСlient,\n"
				+ "				additionalСlient, numTransaction, dateTransaction, curency, itemCode,\n"
				+ "				itemNumber, itemName, Qty, serialNum, cost, costUAH, party,\n"
				+ "				sumCost, bString, notes, finalSalePriceUAH) VALUES ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = conn.createStatement(sql);
				
		for (Sales s : Sales.arrayListSales) {

			String sqlAddSales;
			sqlAddSales = "insert into sales(invoicePayer, status, businessTransaction, basicСlient,\n"
					+ "				additionalСlient, numTransaction, dateTransaction, curency, itemCode,\n"
					+ "				itemNumber, itemName, Qty, serialNum, cost, costUAH, party,\n"
					+ "				sumCost, bString, notes, finalSalePriceUAH) VALUES ("
					+ "\"" + s.getInvoicePayer() + "\","
					+ "\"" + s.getStatu() + "\","
					+ "\"" + s.getBusinessTransaction() + "\","
					+ "\"" + s.getBasicСlient() + "\","
					+ "\"" + s.getAdditionalСlient() + "\","
					+ s.getNumTransaction() + ","
					+ "\"" + s.getDateTransaction() + "\","
					+ "\"" + s.getCurency() + "\","
					+ s.getItemCode() + ","
					+ "\"" + s.getItemNumber() + "\","
					+ "\"" + s.getItemName() + "\","
					+ s.getQty() + ","
					+ "\"" + s.getSerialNum() + "\","
					+ s.getCost() + ","
					+ s.getCostUAH() + ","
					+ "\"" + s.getParty() + "\","
					+ s.getSumCost() + ","
					+ "\"" + s.getbString() + "\","
					+ "\"" + s.getNotes() + "\","
					+ "\"" + s.getFinalSalePriceUAH() + "\""
					+ ")";
//			System.out.println("sqlinsert = "+ sqlAddDeliveryShoppe);
			
			stmt.executeUpdate(sqlAddSales);
		}
		
		conn.close();
		System.out.println("table \"sales\" updated");
		
	}

}
