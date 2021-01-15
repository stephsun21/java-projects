//  NoughtsCrosses.java       Author: Stephanie
//
// A GUI that represents a TicTacToe game 

import java.util.*; 
import javax.swing.*;
import javax.swing.JOptionPane;
 
public class NoughtsCrosses 
{
  public static void main(String[] args)
  {
     //Creates and displays the NoughtsCrosses GUI.
     try 
     {
       UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
     } 
     catch (Exception e) 
     {
       e.printStackTrace();
     }
     
     JFrame frame = new JFrame("Noughts and crosses");
   
     NoughtsCrossesPanel panel= new NoughtsCrossesPanel();
     
     frame.add(panel);
     frame.setSize (1000,1000);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.getContentPane().add(panel); 
     frame.pack();
     frame.setVisible(true);

     
  }
}