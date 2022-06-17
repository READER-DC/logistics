package dataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlerFiles {
	
	private char str = ';';
	
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

}
