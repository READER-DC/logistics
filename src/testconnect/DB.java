package testconnect;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import dataReader.LoadData;
import loaderDB.LoadStoreCodeDB;

public class DB 
{
	
	
	public static void main(String[] args) throws SQLException, FileNotFoundException 
	{	
		String fileName1 = "/home/reader-01/Documents/01Project/Договора.csv";
		LoadData loadData = new LoadData();
		loadData.loadCSV(fileName1);
		
		LoadStoreCodeDB insertCodeDB = new LoadStoreCodeDB();
		insertCodeDB.insertInTo();
		
		
		
		
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
