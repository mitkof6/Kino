package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxt {
	
	private String filePath;
	private int numbers[][] = new int[10][20];
	
	//Constructor
	public ReadTxt(String filePath){
		this.filePath = filePath;
	}
	
	//Read txt
	public void read(){
		
		Scanner inputStream;
		
		try {
			inputStream = new Scanner(new File(filePath));
			
	        //System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t16\t17\t18\t19");
	        int i = 0;
	        
	        while(inputStream.hasNext()){
	        	
	        	String[] arrayTemp = inputStream.nextLine().split(";\\s*");//split elements
	        	//System.out.printf("%d\t", i);
	        	
	        	for(int j = 0;j<arrayTemp.length;j++){
	        		numbers[i][j] = Integer.parseInt(arrayTemp[j].toString());
	        		//System.out.printf("%d\t", numbers[i][j]);
	        	}
	        	
	        	//System.out.println();
	        	i++;
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//make an input stream 
	}
	
	//Get Numbers
	public int[][] getNumbers(){
		return this.numbers;
	}

}
