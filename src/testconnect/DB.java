package testconnect;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import dataReader.ReadMatrix;
import dataReader.ReadSales;
import dataReader.ReadStock;
import dataReader.ReadStoreCode;
import dataReader.ReadStoreLinkShoppe;
import dataReader.ReadDeliveryShoppe;
import loaderDB.LoadDeliveryShoppeDB;
import loaderDB.LoadMatrixDB;
import loaderDB.LoadSalesDB;
import loaderDB.LoadStockDB;
import loaderDB.LoadStoreCodeDB;
import loaderDB.LoadStoreLinkShoppeDB;
import util.TimeTableStarts;

public class DB 
{
	
	
	public static void main(String[] args) throws SQLException, FileNotFoundException 
	{	
		String storeCode = "/home/reader-01/Documents/01Project/Договора.csv";
		String storeLinkShoppe = "/home/reader-01/Documents/01Project/store_link_shop.csv";
		String stockSkladString = "/home/reader-01/Documents/01Project/stock.csv";
		String deliveryShoppeString = "/home/reader-01/Documents/01Project/deliveryShoppe.csv";
		String matrixString = "/home/reader-01/Documents/01Project/Matrix.csv";
		String saleString = "/home/reader-01/Documents/01Project/sales.csv";
		
//				
//		ReadStoreCode readStoreCode = new ReadStoreCode();
//		readStoreCode.loadStoreCode(storeCode);
//		LoadStoreCodeDB insertStoreCodeDB = new LoadStoreCodeDB();
//		insertStoreCodeDB.insertInTo();
//		
//		ReadStoreLinkShoppe readStoreLinkShoppe = new ReadStoreLinkShoppe();
//		readStoreLinkShoppe.loadStoreLinkShoppe(storeLinkShoppe);
//		LoadStoreLinkShoppeDB insertLinkShoppeDB = new LoadStoreLinkShoppeDB();
//		insertLinkShoppeDB.insertInTo();
		
		ReadStock readStock = new ReadStock();
		readStock.loadStock(stockSkladString);
		LoadStockDB insertStockDB = new LoadStockDB();
		insertStockDB.insertInTo();
		
		ReadDeliveryShoppe readDeliveryShoppe = new ReadDeliveryShoppe();
		readDeliveryShoppe.loadDeliveryShoppe(deliveryShoppeString);
		LoadDeliveryShoppeDB insertDeliveryShoppeDB = new LoadDeliveryShoppeDB();
		insertDeliveryShoppeDB.insertInTo();
		
		ReadSales readSales = new ReadSales();
		readSales.loadSales(saleString);
		LoadSalesDB insertSalesDB = new LoadSalesDB();
		insertSalesDB.insertInTo();
		
		ReadMatrix readMatrix = new ReadMatrix();
		readMatrix.loadMatrix(matrixString);
		LoadMatrixDB insertMatrixDB = new LoadMatrixDB();
		insertMatrixDB.insertInTo();
		
		TimeTableStarts ttStarts = new TimeTableStarts();
		ttStarts.loadTimetableStartsDB();
		
		System.out.println("Succes!");

		
//		
//		ResultSet rs = stmt.executeQuery(sql);
//		
//		while (rs.next()) {
//            String storeCode = rs.getString(1);
//            String storeName = rs.getString(2);
//            System.out.println("----------------------------------------");
//            System.out.println("Code:" + storeCode);
//            System.out.println("Name:" + storeName);
//        }
	}
}
