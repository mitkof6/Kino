package tactics;

import java.util.Arrays;

public class AllVerticalHorizontalRoundNotIn {
	
	//Variables
	private int[][] numbers;
	private int[][] table = new int[8][10];
	private int[][] notInTable = new int[8][10];
	private int[][] hTable = new int[8][10];
	private int[][] vTable = new int[8][10];
	private int[][] roundTable = new int[8][10];
	private int[] all = new int[100];
	
	//Constructor
	public AllVerticalHorizontalRoundNotIn(int[][] numbers){
		this.numbers = numbers;
		All();
		VerticalHorizontal();
		Round();
	}
	
	//Methods
	private void All(){
		int k = 0;
		for(int i = 0;i<5;i++){
			for(int j = 0;j<20;j++){
				all[k] = numbers[i][j];
				k++;
			}
		}
		Arrays.sort(all);
	}
	
	private void VerticalHorizontal(){
		createTheTable(table);
		
		//Horizontal
		for(int i = 0;i<8;i++){
			for(int j = 0;j<10;j++){
				if(table[i][j]==0){
					hTable[i][j]=0;
					continue;
				}
				int counter = 0;
				while(table[i][j+counter]!=0){
					if(counter+j+1>=10){
						break;
					}
					counter++;
				}
				if(counter>=4){
					for(int k = j;k<=j+counter;k++){
						hTable[i][k]=1;
					}
					j=j+counter-1;
				}
			}
		}
		
		//Vertical
		for(int j = 0;j<10;j++){
			for(int i = 0;i<8;i++){
				if(table[i][j]==0){
					vTable[i][j]=0;
					continue;
				}
				int counter = 0;
				while(table[i+counter][j]!=0){
					if(counter+i+1>=8){
						break;
					}
					counter++;
				}
				if(counter>=4){
					for(int k = i;k<=i+counter;k++){
						vTable[k][j]=1;
					}
					i=i+counter-1;
				}
			}
		}
			
		/*	
		for(int i = 0;i<8;i++){//check
			for(int j = 0;j<10;j++){
				System.out.printf("%d\t", hTable[i][j]);//check
			}
			System.out.println();//check
		}
		System.out.println();
		
		for(int i = 0;i<8;i++){//check
			for(int j = 0;j<10;j++){
				System.out.printf("%d\t", vTable[i][j]);//check
			}
			System.out.println();//check
		}*/
	}
	
	private void Round(){
		int pivotI = 7, pivotJ = 9, i = 0, j = 0, pivotJR = 0, pivotIR = 0, index = 1;
		boolean horizontal = true, vertical = false, reverse = false;
		while(true){
			
			if(table[i][j]==1){
				roundTable[i][j] = index;
			}else{
				roundTable[i][j] = 0;
			}
			
			if(i==4&&j==3){
				/*System.out.println();
				for(int z = 0;z<8;z++){//check
					for(int x = 0;x<10;x++){
						System.out.printf("%d\t", roundTable[z][x]);//check
					}
					System.out.println();//check
				}*/
				break;
			}
			
			if(reverse==true){
				if(horizontal==true&&j>=pivotJR){
					j--;
					if(j==pivotJR){
						horizontal = false;
						vertical = true;
						i=pivotI;
					}
				}else if(vertical==true&&i>=pivotIR){
					i--;
					if(i==pivotIR){
						reverse = false;
						horizontal = true;
						vertical = true;
						pivotI--;
						pivotJ--;
						pivotIR++;
						pivotJR++;
						i=pivotIR;
						j=pivotJR;
						
						index++;
					}
				}
				
			}else{
				if(horizontal==true&&j<pivotJ){
					j++;
					if(j==pivotJ){
						horizontal = false;
						vertical = true;
					}
				}else if(vertical==true&&i<pivotI){
					i++;
					if(i==pivotI){
						horizontal = true;
						vertical = false;
						reverse = true;
						j=pivotJ;
					}
				}
			}	
		}
	}
	
	private void createTheTable(int[][] table){
		int index = 1;
		for(int i = 0;i<8;i++){
			for(int j = 0;j<10;j++){
				if(Arrays.binarySearch(all, index)>=0){
					table[i][j]=1;
					notInTable[i][j]= 0;
				}else{
					table[i][j]=0;
					notInTable[i][j]= 1;
				}
				index++;
			}
		}
		
		/*for(int i = 0;i<8;i++){//check
			for(int j = 0;j<10;j++){
				System.out.printf("%d\t", table[i][j]);//check
			}
			System.out.println();//check
		}
		System.out.println();//check*/
	}
	
	//Get Methods
	public int[][] getAllTable(){
		return table;
	}
	
	public int[][] getHTable(){
		return hTable;
	}
	
	public int[][] getVTable(){
		return vTable;
	}
	
	public int[][] getRoundTable(){
		return roundTable;
	}
	
	public int[][] getNotInTable(){
		return notInTable;
	}

}
