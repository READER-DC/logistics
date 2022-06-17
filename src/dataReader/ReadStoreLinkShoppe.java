package dataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import entyty.StoreLinkShoppe;

public class ReadStoreLinkShoppe {
	private int cancel = 0;
	private int start = 0;
	private char str = ';';
	private String empty = "";
	
	HandlerFiles handlerFiles = new HandlerFiles();
	
	public void loadStoreLinkShoppe(String fileName) throws FileNotFoundException {
		File input = new File(fileName);
		try (Scanner myReader = new Scanner(input)) {
			int row = handlerFiles.rowCount(fileName);
			
			String table [] = new String [row];
			
			for (;myReader.hasNextLine() == true; )
			{
				start = 0;
				cancel = 0;
				int delimiters = 0;
				
				String data = myReader.nextLine();
				
				int end = data.length();
								
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
				StoreLinkShoppe.createStoreLinkShope(Integer.valueOf(table[1]), Integer.valueOf(table[0]));
			}
			
	}
	

}
}
