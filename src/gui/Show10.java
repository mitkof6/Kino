package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Show10 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4855036033201900806L;
	private JPanel  board1, board2, board3, board4, squares1[][] = new JPanel[8][10], squares2[][] = new JPanel[8][10], squares3[][] = new JPanel[8][10], squares4[][] = new JPanel[8][10];
	private JPanel  board5, board6, board7, board8, squares5[][] = new JPanel[8][10], squares6[][] = new JPanel[8][10], squares7[][] = new JPanel[8][10], squares8[][] = new JPanel[8][10];
	private JPanel  board9, board10, squares9[][] = new JPanel[8][10], squares10[][] = new JPanel[8][10];
	
	
	//Constructor
	public Show10(int[][] numbers){
		
				super("10 Rounds");
				this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				setLayout(new GridLayout(4, 2, 2, 2));
		
				//Board1
				//labels
		        int index = 1;
		        board1 = new JPanel();
		        board1.setLayout(new GridLayout(8, 10, 1, 1));
		        Arrays.sort(numbers[0]);
		        for(int i = 0;i<8;i++){
		            for(int j = 0;j<10;j++){
		                squares1[i][j] = new JPanel();
		                squares1[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares1[i][j].setName(String.format("%d", index));
		                squares1[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[0], index)>=0){
		                	squares1[i][j].setBackground(Color.black);
		                }
		                board1.add(squares1[i][j]);
		                index++;
		            }
		        }
		        board1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board1);
		        
		        //Board2
		        //labels
		        index = 1;
		        board2 = new JPanel();
		        board2.setLayout(new GridLayout(8, 10, 1, 1));
		        Arrays.sort(numbers[1]);
		        for(int i = 0;i<8;i++){
		        	for(int j = 0;j<10;j++){
		        		squares2[i][j] = new JPanel();
		        		squares2[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares2[i][j].setName(String.format("%d", index));
		                squares2[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[1], index)>=0){
		                	squares2[i][j].setBackground(Color.black);
		                }
		                board2.add(squares2[i][j]);
		                index++;
		             }
		         }
		        board2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board2);
		         
		         //Board3
		         //labels
		         index = 1;
		         board3 = new JPanel();
		         board3.setLayout(new GridLayout(8, 10, 1, 1));
		         Arrays.sort(numbers[2]);
		         for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		squares3[i][j] = new JPanel();
		         		squares3[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares3[i][j].setName(String.format("%d", index));
		                squares3[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[2], index)>=0){
		                	squares3[i][j].setBackground(Color.black);
		                }
		                board3.add(squares3[i][j]);
		                index++;
		              }
		         }
		         board3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		         add(board3);
		         
		         //Board4
		         //labels
		         index = 1;
		         board4 = new JPanel();
		         board4.setLayout(new GridLayout(8, 10, 1, 1));
		         Arrays.sort(numbers[3]);
		         for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		squares4[i][j] = new JPanel();
		         		squares4[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares4[i][j].setName(String.format("%d", index));
		                squares4[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[3], index)>=0){
		                	squares4[i][j].setBackground(Color.black);
		                }
		                board4.add(squares4[i][j]);
		                index++;
		             }
		        }
		        board4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board4);
		        
		         //Board5
		         //labels
		         index = 1;
		         board5 = new JPanel();
		         board5.setLayout(new GridLayout(8, 10, 1, 1));
		         Arrays.sort(numbers[4]);
		         for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		squares5[i][j] = new JPanel();
		         		squares5[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares5[i][j].setName(String.format("%d", index));
		                squares5[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[4], index)>=0){
		                	squares5[i][j].setBackground(Color.black);
		                }
		                board5.add(squares5[i][j]);
		                index++;
		             }
		        }
		        board5.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board5);
		        
		         //Board6
		         //labels
		         index = 1;
		         board6 = new JPanel();
		         board6.setLayout(new GridLayout(8, 10, 1, 1));
		         Arrays.sort(numbers[5]);
		         for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		squares6[i][j] = new JPanel();
		         		squares6[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares6[i][j].setName(String.format("%d", index));
		                squares6[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[5], index)>=0){
		                	squares6[i][j].setBackground(Color.black);
		                }
		                board6.add(squares6[i][j]);
		                index++;
		             }
		        }
		        board6.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board6);
		        
		         //Board7
		         //labels
		         index = 1;
		         board7 = new JPanel();
		         board7.setLayout(new GridLayout(8, 10, 1, 1));
		         Arrays.sort(numbers[6]);
		         for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		squares7[i][j] = new JPanel();
		         		squares7[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares7[i][j].setName(String.format("%d", index));
		                squares7[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[6], index)>=0){
		                	squares7[i][j].setBackground(Color.black);
		                }
		                board7.add(squares7[i][j]);
		                index++;
		             }
		        }
		        board7.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board7);
		        
		         //Board8
		         //labels
		         index = 1;
		         board8 = new JPanel();
		         board8.setLayout(new GridLayout(8, 10, 1, 1));
		         Arrays.sort(numbers[7]);
		         for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		squares8[i][j] = new JPanel();
		         		squares8[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares8[i][j].setName(String.format("%d", index));
		                squares8[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[7], index)>=0){
		                	squares8[i][j].setBackground(Color.black);
		                }
		                board8.add(squares8[i][j]);
		                index++;
		             }
		        }
		        board8.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board8);
		        
		         //Board9
		         //labels
		         index = 1;
		         board9 = new JPanel();
		         board9.setLayout(new GridLayout(8, 10, 1, 1));
		         Arrays.sort(numbers[8]);
		         for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		squares9[i][j] = new JPanel();
		         		squares9[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares9[i][j].setName(String.format("%d", index));
		                squares9[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[8], index)>=0){
		                	squares9[i][j].setBackground(Color.black);
		                }
		                board9.add(squares9[i][j]);
		                index++;
		             }
		        }
		        board9.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board9);
		        
		         //Board10
		         //labels
		         index = 1;
		         board10 = new JPanel();
		         board10.setLayout(new GridLayout(8, 10, 1, 1));
		         Arrays.sort(numbers[9]);
		         for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		squares10[i][j] = new JPanel();
		         		squares10[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 1));
		                squares10[i][j].setName(String.format("%d", index));
		                squares10[i][j].add(new JLabel(String.format("%d", index)));
		                if(Arrays.binarySearch(numbers[9], index)>=0){
		                	squares10[i][j].setBackground(Color.black);
		                }
		                board10.add(squares10[i][j]);
		                index++;
		             }
		        }
		        board10.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		        add(board10);
		        
		        
		        this.setVisible(true);
		        this.pack();
	}

}
