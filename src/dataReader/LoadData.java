package dataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

import entyty.StoreCode;

public class LoadData{
	
	private int cancel = 0;
	private int start = 0;
	private char str = ';';
	private String empty = "";
	
	public int rowCount(String fileName) throws FileNotFoundException 
	{
		
		File input = new File(fileName);
		Scanner myReader = new Scanner(input);
		myReader.hasNextLine();
		String data = myReader.nextLine();
		
		int end = data.length();
		int row = 0;
		
		for (int i = 0; i < end; i++) 
		{
			if(data.charAt(i) == str) 
			{
				row++;
			}
		}
		
		myReader.close();
		
		return row+1;
		
	}
	
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
		
	}
	
	public void loadCSV(String fileName) throws FileNotFoundException, SQLException {
		
		File input = new File(fileName);
		try (Scanner myReader = new Scanner(input)) {
			int row = rowCount(fileName);
			
			String table [] = new String [row];
			
			for (;myReader.hasNextLine() == true; )
			{
				start = 0;
				cancel = 0;
				int delimiters = 0;
				
				
				String data = myReader.nextLine();
				
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
					StoreCode.createStoreCode(Integer.valueOf(table[1]), table[0]);
			}
		}
	}

}