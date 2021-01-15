//SquareMatrixDriver.java  Author: Stephanie Sun
// 
//Test of the SquareMatrix class and give all the information

import javax.swing.JOptionPane;

public class SquareMatrixDriver{
    public static void main( String[] args ){

      int again;
     
      do
     {
      //Let the user specify the size of the matrix
      String sizeStr = JOptionPane.showInputDialog ("Enter the size of the matrix:");
      int size = Integer.parseInt(sizeStr);
      
      SquareMatrix arr = new SquareMatrix(size); //instantiate a new object (instance) of the class
      
       //Let the user specify the numbers to be added to the matrix
       for (int row=0; row < size; row++) 
       {
         for (int col=0; col < size; col++) 
       {
           String iStr = JOptionPane.showInputDialog ("Enter the numbers to be added to the matrix at position (" + row + " , " + col + ") : " );
           int i = Integer.parseInt(iStr);
           arr.add(i, row, col);
       }
       }
       
       //Display the matrix and the test result
       JOptionPane.showMessageDialog(null,arr);
       JOptionPane.showMessageDialog(null,arr.isMagic());
       if (arr.isMagic() == true)
         JOptionPane.showMessageDialog(null,"Your matrix is a magic square");
       else
         JOptionPane.showMessageDialog(null,"Your matrix is not a magic square");
      
      //User controlled exit
      again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
    }
    while (again == JOptionPane.YES_OPTION);
  
    }
    }
      
      
 