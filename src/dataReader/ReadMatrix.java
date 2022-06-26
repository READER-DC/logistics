package dataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.Matrix;
import util.CheckArrival;

public class ReadMatrix {
	private int cancel = 0;
	private int start = 0;
	private char str = ';';
	private String empty = "";
	HandlerFiles handlerFiles = new HandlerFiles();
	
	
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}
	
	public void loadMatrix(String fileName) throws FileNotFoundException {
		File inputFile = new File(fileName);
		
		try (Scanner myReader = new Scanner(inputFile)){
			
			int row = handlerFiles.rowCount(fileName);
			
			String table [] = new String [row];
			
			String data = myReader.nextLine();
			
			
			for (;myReader.hasNextLine() == true; )
			{
				start = 0;
				cancel = 0;
				int delimiters = 0;
				
				data = myReader.nextLine();
//				System.out.println(data);
				int end = data.length();
				
				for (int i = 0; i < end; i++) {
					int a = data.indexOf('\"');
					if(a >= 0) {
						data = removeCharAt(data, a);
						end = data.length();
					}
				}
				
				CheckArrival ca = new CheckArrival();
				
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
							} else if(start+160>cancel)
								{
									table[delimiters] = data.substring(start, cancel);
									delimiters += 1;
									start = j+1;
								} else {
									table[delimiters] = data.substring(start, start+160);
									delimiters += 1;
									start = j+1;
									
								}
							
							if ( delimiters == 17 ) {
								if ( 	ca.equalArrivalSKIPARCHIVE_STRING(table[16]) != false &&
										ca.equalArrivalSKIPINET_STRING(table[16]) != false &&
										ca.equalArrivalSKIPINETPRICE_STRING(table[16]) != false &&
										ca.equalArrivalSKIPOPT_STRING(table[16]) != false ) {
									j = end;
								}
							}
						}
						if(data.substring(start, end).equals(empty))
						{
							table[row-1] = "0";
						} else
						{
							table[row-1] = data.substring(start, end);;
							
						}
						
					}
					
					if ( 	ca.equalArrivalSKIPARCHIVE_STRING(table[16]) == false &&
							ca.equalArrivalSKIPINET_STRING(table[16]) == false &&
							ca.equalArrivalSKIPINETPRICE_STRING(table[16]) == false &&
							ca.equalArrivalSKIPOPT_STRING(table[16]) == false ) 
					{
						Matrix.createMatrix(
								  table[0]
								, table[1]
								, table[2]
								, table[3]
								, table[4]
								, Integer.valueOf(table[5])
								, Integer.valueOf(table[6])
								, table[7]
								, table[8]
								, table[9]
								, Integer.valueOf(table[10])
								, Integer.valueOf(table[11])
								, Integer.valueOf(table[12])
								, Integer.valueOf(table[13])
								, Integer.valueOf(table[14])
								, Integer.valueOf(table[15])
								, table[16]
								, table[17]
								, table[18]
								, Integer.valueOf(table[19])
								, Integer.valueOf(table[20])
								, Integer.valueOf(table[21])
								, Integer.valueOf(table[22])
								, Integer.valueOf(table[23]));
						
					}
					
					
					}
			}
		}
	}
