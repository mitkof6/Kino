package util;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

public class ReadXls {
	
	private String filePath;
	private int numbers[][];
	
	//Constructor
	public ReadXls(String filePath){
		this.filePath = filePath;
	}
	
	public void read(int rows) throws IOException  {
		File inputWorkbook = new File(filePath);
		Workbook workBook;
		try {
			//Read xls
			workBook = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = workBook.getSheet(0);
			
			numbers = new int[rows][20];
			//System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t16\t17\t18\t19");
			for(int i = 3;i < rows+3;i++){
				//System.out.printf("%d\t", i-3);
				for(int j = 3;j < 23;j++){
					Cell cell = sheet.getCell(j, i);
					numbers[i-3][j-3] = Integer.parseInt(cell.getContents());
					//System.out.printf("%d\t", numbers[i-3][j-3]);
				}
				//System.out.println();
			}
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}
	
	//Get Numbers
	public int[][] getNumbers(){
		return this.numbers;
	}
}
