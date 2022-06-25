package dataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

import entity.DeliveryShoppe;

public class ReadDeliveryShoppe {
	private int cancel = 0;
	private int start = 0;
	private char str = ';';
	private String empty = "";
	
	HandlerFiles handlerFiles = new HandlerFiles();
	
	
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
		
	}
	
	public void loadDeliveryShoppe(String fileName) throws FileNotFoundException, SQLException {
			
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
								} else if (start+160>cancel)
								{
									table[delimiters] = data.substring(start, cancel);
									delimiters += 1;
									start = j+1;
								} else {
									table[delimiters] = data.substring(start, start+160);
									delimiters += 1;
									start = j+1;
									
								}
								
							}
							table[row-1] = data.substring(start, end);
							
						}
						
						DeliveryShoppe.CreateDeliveryShoppe(
								table[0]
								, table[1]
								, table[2]
								, table[3]
								, table[4]
								, Long.valueOf(table[5])
								, table[6]
								, table[7]
								, Integer.valueOf(table[8])
								, table[9]
								, table[10]
								, Integer.valueOf(table[11])
								, table[12]
								, Double.valueOf(table[13])
								, Double.valueOf(table[14])
								, table[15]
								, Double.valueOf(table[16])
								, table[17]
								, table[18]
								, table[19]);
				}
				
			}
		}

}
