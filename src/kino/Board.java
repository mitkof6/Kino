/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kino;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author mitkof6
 */
public class Board extends JFrame {
    
    JButton exit;
    JPanel squares[][] = new JPanel[8][10], board;
    JLabel number;
    //consturctor
    public Board(){
        super("Kino");
        setLayout(new BorderLayout());//set layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set exit action
        
        //labels
        int index = 1;
	board = new JPanel();
	board.setLayout(new GridLayout(8, 10, 1, 1));
        for(int i = 0;i<8;i++){
            for(int j = 0;j<10;j++){
                squares[i][j] = new JPanel();
                squares[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                squares[i][j].setName(String.format("%d", index));
                squares[i][j].add(new JLabel(String.format("%d", index)));
               


                board.add(squares[i][j]);
                index++;
            }
	}
	add(board);
        
        //buttons
        exit = new JButton("Exit");
        JToolBar bar = new JToolBar();//add toolbar
        bar.add(exit);
        add(bar, BorderLayout.NORTH);//add layout position
        
        //button handlers
        ButtonHandler handler = new ButtonHandler();
        exit.addActionListener(handler);
        
    }
    
    private class ButtonHandler implements ActionListener{//button action listener
        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==exit){
                //exit
                System.exit(1);
            }
        }
    }
}
