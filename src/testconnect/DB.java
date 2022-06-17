package testconnect;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import dataReader.ReadStoreCode;
import dataReader.ReadStoreLinkShoppe;
import loaderDB.LoadStoreCodeDB;
import loaderDB.LoadStoreLinkShoppeDB;

public class DB 
{
	
	
	public static void main(String[] args) throws SQLException, FileNotFoundException 
	{	
		String storeCode = "/home/reader-01/Documents/01Project/Договора.csv";
		String storeLinkShoppe = "/home/reader-01/Documents/01Project/store_link_shop.csv";
		ReadStoreCode readStoreCode = new ReadStoreCode();
		readStoreCode.loadStoreCode(storeCode);
		LoadStoreCodeDB insertStoreCodeDB = new LoadStoreCodeDB();
		insertStoreCodeDB.insertInTo();
		
		ReadStoreLinkShoppe readStoreLinkShoppe = new ReadStoreLinkShoppe();
		readStoreLinkShoppe.loadStoreLinkShoppe(storeLinkShoppe);
		LoadStoreLinkShoppeDB insertLinkShoppeDB = new LoadStoreLinkShoppeDB();
		insertLinkShoppeDB.insertInTo();
		
		
		
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
