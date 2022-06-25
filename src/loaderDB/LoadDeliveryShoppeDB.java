package loaderDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.DeliveryShoppe;
import testconnect.Util;

public class LoadDeliveryShoppeDB {
	
	public LoadDeliveryShoppeDB() {
		
	}
	
	
	public void insertInTo() throws SQLException {
		Util conn = new Util();
		conn.init();
		String sql = "insert into delivery_shoppe(invoicePayer, statu, businessTransaction, basicСlient,\n"
				+ "				additionalСlient, numTransaction, dateTransaction, curency, itemCode,\n"
				+ "				itemNumber, itemName, Qty, serialNum, cost, costUAH, party,\n"
				+ "				sumCost, bString, notes, finalSalePriceUAH) VALUES ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = conn.createStatement(sql);
		stmt.executeUpdate("DELETE FROM delivery_shoppe");
		
		for (DeliveryShoppe ds : DeliveryShoppe.arrayListDeliveryShoppe) {

			String sqlAddDeliveryShoppe;
			sqlAddDeliveryShoppe = "insert into delivery_shoppe(invoicePayer, status, businessTransaction, basicСlient,\n"
					+ "				additionalСlient, numTransaction, dateTransaction, curency, itemCode,\n"
					+ "				itemNumber, itemName, Qty, serialNum, cost, costUAH, party,\n"
					+ "				sumCost, bString, notes, finalSalePriceUAH) VALUES ("
					+ "\"" + ds.getInvoicePayer() + "\","
					+ "\"" + ds.getStatu() + "\","
					+ "\"" + ds.getBusinessTransaction() + "\","
					+ "\"" + ds.getBasicСlient() + "\","
					+ "\"" + ds.getAdditionalСlient() + "\","
					+ ds.getNumTransaction() + ","
					+ "\"" + ds.getDateTransaction() + "\","
					+ "\"" + ds.getCurency() + "\","
					+ ds.getItemCode() + ","
					+ "\"" + ds.getItemNumber() + "\","
					+ "\"" + ds.getItemName() + "\","
					+ ds.getQty() + ","
					+ "\"" + ds.getSerialNum() + "\","
					+ ds.getCost() + ","
					+ ds.getCostUAH() + ","
					+ "\"" + ds.getParty() + "\","
					+ ds.getSumCost() + ","
					+ "\"" + ds.getbString() + "\","
					+ "\"" + ds.getNotes() + "\","
					+ "\"" + ds.getFinalSalePriceUAH() + "\""
					+ ")";
//			System.out.println("sqlinsert = "+ sqlAddDeliveryShoppe);
			
			stmt.executeUpdate(sqlAddDeliveryShoppe);
		}
		
		conn.close();
		System.out.println("table \"delivery_shoppe\" updated");
		
	}

}
