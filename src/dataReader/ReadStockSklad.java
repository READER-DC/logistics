package dataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

import entity.StockSklad;

public class ReadStockSklad {
	
	private int cancel = 0;
	private int start = 0;
	private char str = ';';
	private String empty = "";
	
	HandlerFiles handlerFiles = new HandlerFiles();
	
	
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
		
	}
	
	public void loadSkladStock(String fileName) throws FileNotFoundException, SQLException {
		
		File input = new File(fileName);
		try (Scanner myReader = new Scanner(input)) {
			
			int row = handlerFiles.rowCount(fileName);
			
			String table [] = new String [row];
			
			String data = myReader.nextLine();
			
			for (;myReader.hasNextLine() == true; )
			{
				start = 0;
				cancel = 0;
				int delimiters = 0;
				
				data = myReader.nextLine();
				
				int end = data.length();
				
				for (int i = 0; i < end; i++) {
					int a = data.indexOf('\"');
					
					if(a >= 0) {
						data = removeCharAt(data, a);
						end = data.length();
					}
				}
								
					for( int j = 0; j<end; j++) 
					{
						if(data.charAt(j) == str)
						{
							cancel = j;
							if(data.substring(start, cancel).equals(empty))
							{
								table[delimiters] = "0";
								delimiters += 1;
								start = j+1;
							} else
							{
								table[delimiters] = data.substring(start, cancel);
								delimiters += 1;
								start = j+1;
							}
						}
						table[row-1] = data.substring(start, end);	
					}
					StockSklad.createStockSklad(
							table[0], 
							Integer.valueOf(table[1]), 
							table[2], 
							Integer.valueOf(table[3]), 
							Integer.valueOf(table[4]), 
							Double.valueOf(table[5]), 
							Integer.valueOf(table[6]), 
							Integer.valueOf(table[7]), 
							Double.valueOf(table[8]), 
							Integer.valueOf(table[9]), 
							table[10], table[11], table[12], table[13],table[14]);
			}
		}
	}


}
