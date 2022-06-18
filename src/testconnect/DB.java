package testconnect;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Timer;

import dataReader.ReadMatrix;
import dataReader.ReadStockSklad;
import dataReader.ReadStoreCode;
import dataReader.ReadStoreLinkShoppe;
import loaderDB.LoadMatrixDB;
import loaderDB.LoadStockSkladDB;
import loaderDB.LoadStoreCodeDB;
import loaderDB.LoadStoreLinkShoppeDB;

public class DB 
{
	
	
	public static void main(String[] args) throws SQLException, FileNotFoundException 
	{	
		String storeCode = "/home/reader-01/Documents/01Project/Договора.csv";
		String storeLinkShoppe = "/home/reader-01/Documents/01Project/store_link_shop.csv";
		String matrixString = "/home/reader-01/Documents/01Project/Matrix.csv";
		String stockSkladString = "/home/reader-01/Documents/01Project/stock.csv";
				
		ReadStoreCode readStoreCode = new ReadStoreCode();
		readStoreCode.loadStoreCode(storeCode);
		LoadStoreCodeDB insertStoreCodeDB = new LoadStoreCodeDB();
		insertStoreCodeDB.insertInTo();
		
		ReadStoreLinkShoppe readStoreLinkShoppe = new ReadStoreLinkShoppe();
		readStoreLinkShoppe.loadStoreLinkShoppe(storeLinkShoppe);
		LoadStoreLinkShoppeDB insertLinkShoppeDB = new LoadStoreLinkShoppeDB();
		insertLinkShoppeDB.insertInTo();
		
		ReadStockSklad readStockSklad = new ReadStockSklad();
		readStockSklad.loadSkladStock(stockSkladString);
		LoadStockSkladDB insertStockSkladDB = new LoadStockSkladDB();
		insertStockSkladDB.insertInTo();
		
//		ReadMatrix readMatrix = new ReadMatrix();
//		readMatrix.loadMatrix(matrixString);
//		LoadMatrixDB insertMatrixDB = new LoadMatrixDB();
//		insertMatrixDB.insertInTo();
		
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
