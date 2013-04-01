package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import tactics.AllVerticalHorizontalRoundNotIn;
import util.InputFile;
import util.ReadTxt;
import util.ReadXls;

public class Window extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Variables
	private JButton exit, inputXls, input10, show10,  avhrni, frequencyDensity;
	public JPanel board, board1, board2, board3, board4, squares1[][] = new JPanel[8][10], squares2[][] = new JPanel[8][10], squares3[][] = new JPanel[8][10], squares4[][] = new JPanel[8][10];
	private int[][] numbers;
	
	//Constructor
	public Window(){
		
		//Setting
		super("Kino");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		//Buttons
		JToolBar bar = new JToolBar();
		inputXls = new JButton("Input Xls");
		input10 = new JButton("Input 10");
		show10 = new JButton("Show");
		show10.setEnabled(false);
		avhrni = new JButton("V # [] x");
		avhrni.setEnabled(false);
		frequencyDensity = new JButton("Frequency Density");
		frequencyDensity.setEnabled(false);
		exit  = new JButton("Exit");
		bar.add(inputXls);
		bar.add(input10);
		bar.add(show10);
		bar.add(avhrni);
		bar.add(frequencyDensity);
		bar.add(exit);
		add(bar, BorderLayout.NORTH);
		
		//Board
		board = new JPanel();
		board.setLayout(new FlowLayout());
		
		//Board1
		//labels
        int index = 1;
        board1 = new JPanel();
        board1.setLayout(new GridLayout(8, 10, 1, 1));
        for(int i = 0;i<8;i++){
            for(int j = 0;j<10;j++){
                squares1[i][j] = new JPanel();
                squares1[i][j].setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
                squares1[i][j].setName(String.format("%d", index));
                squares1[i][j].add(new JLabel(String.format("%d", index)));
                board1.add(squares1[i][j]);
                index++;
            }
        }
        board1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        board.add(board1);
        
        //Board2
        //labels
        index = 1;
        board2 = new JPanel();
        board2.setLayout(new GridLayout(8, 10, 1, 1));
        for(int i = 0;i<8;i++){
        	for(int j = 0;j<10;j++){
        		squares2[i][j] = new JPanel();
        		squares2[i][j].setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
                squares2[i][j].setName(String.format("%d", index));
                squares2[i][j].add(new JLabel(String.format("%d", index)));
                board2.add(squares2[i][j]);
                index++;
             }
        }
        board2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        board.add(board2);
         
         //Board3
         //labels
         index = 1;
         board3 = new JPanel();
         board3.setLayout(new GridLayout(8, 10, 1, 1));
         for(int i = 0;i<8;i++){
         	for(int j = 0;j<10;j++){
         		squares3[i][j] = new JPanel();
         		squares3[i][j].setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
                squares3[i][j].setName(String.format("%d", index));
                squares3[i][j].add(new JLabel(String.format("%d", index)));
                board3.add(squares3[i][j]);
                index++;
              }
         }
         board3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
         board.add(board3);
         
         //Board3
         //labels
         index = 1;
         board4 = new JPanel();
         board4.setLayout(new GridLayout(8, 10, 1, 1));
         for(int i = 0;i<8;i++){
         	for(int j = 0;j<10;j++){
         		squares4[i][j] = new JPanel();
         		squares4[i][j].setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
                squares4[i][j].setName(String.format("%d", index));
                squares4[i][j].add(new JLabel(String.format("%d", index)));
                board4.add(squares4[i][j]);
                index++;
             }
        }
        board4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        board.add(board4);
        add(board, BorderLayout.SOUTH);
        
		
		//Handlers
		ButtonHandler handler = new ButtonHandler();
		inputXls.addActionListener(handler);
		input10.addActionListener(handler);
		show10.addActionListener(handler);
		avhrni.addActionListener(handler);
		frequencyDensity.addActionListener(handler);
		exit.addActionListener(handler);
		
		
	}
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource()==inputXls){
				//Read xls
				InputFile buyFile = new InputFile();//file chooser class
                ReadXls xls = new ReadXls(buyFile.getFile());
				try {
					int rows = Integer.parseInt(JOptionPane.showInputDialog("Please give the number of rows to read!"));
					xls.read(rows);
					numbers = xls.getNumbers();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Enable
				frequencyDensity.setEnabled(true);
				avhrni.setEnabled(true);
				show10.setEnabled(true);
			}else if(event.getSource()==input10){
				//Input 10
				InputFile buyFile = new InputFile();//file chooser class
				ReadTxt txt = new ReadTxt(buyFile.getFile());
				txt.read();
				numbers = txt.getNumbers();
				//Enable
				frequencyDensity.setEnabled(true);
				avhrni.setEnabled(true);
				show10.setEnabled(true);
			}else if(event.getSource()==show10){
				//Show 10
				@SuppressWarnings("unused")
				Show10 show = new Show10(numbers);
			}else if(event.getSource()==avhrni){
				//AllVerticalHorizontalRoundNotIn
				AllVerticalHorizontalRoundNotIn compute = new AllVerticalHorizontalRoundNotIn(numbers);
				int all[][] = compute.getAllTable();
				int horizontal[][] = compute.getHTable();
				int vertical[][] = compute.getVTable();
				int round[][] = compute.getRoundTable();
				int notIn[][] = compute.getNotInTable();
				for(int i = 0;i<8;i++){
		         	for(int j = 0;j<10;j++){
		         		if(all[i][j]==1){
		         			squares1[i][j].setBackground(Color.pink);
		         		}
		         		if(notIn[i][j]==1){
		         			squares4[i][j].setBackground(Color.black);
		         		}
		         		if(horizontal[i][j]==1){
		         			squares2[i][j].setBackground(Color.green);
		         		}
		         		if(vertical[i][j]==1){
		         			squares2[i][j].setBackground(Color.yellow);
		         		}
		         		if(vertical[i][j]==1&&horizontal[i][j]==1){
		         			squares2[i][j].setBackground(Color.cyan);
		         			
		         			squares2[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
		         		}
		         		if(round[i][j]!=0){
		         			if(round[i][j]==1){
		         				squares3[i][j].setBackground(Color.red);
		         			}else if(round[i][j]==2){
		         				squares3[i][j].setBackground(Color.orange);
		         			}else if(round[i][j]==3){
		         				squares3[i][j].setBackground(Color.green);
		         			}else if(round[i][j]==4){
		         				squares3[i][j].setBackground(Color.blue);
		         			}
		         		}
		         	}
				}

			}else if(event.getSource()==frequencyDensity){
				//Frequency Density
				@SuppressWarnings("unused")
				BarChartStatistics chart = new BarChartStatistics(numbers);
			}else if(event.getSource()==exit){
				System.exit(0);
			}
		}
	}
}
