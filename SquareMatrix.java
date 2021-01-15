//SquareMatrix.java  Author: Stephanie Sun
// 
//Represents a matrix

public class SquareMatrix{
  
  //Declaration of instance variables/fields for this class
  public int[][] arr;
  
  //Initialize variables
  public SquareMatrix(int size)
  {
    arr = new int[size][size];
  }
  
  //Adds an integer to the matrix at the specified location.
  public void add(int i, int row, int col)
  {
         arr[row][col] = i;
  }
   
  //Determines whether the matrix illustrates a magic square.
  public boolean isMagic()
  {
    boolean truee = true;
    int n = arr.length;
    int a = n*n;
     
    //Checks if the numbers are only between 1 and n^2 inclusive
    int count = 0;
    for (int row=0; row < arr.length; row++) 
      { 
         for (int col=0; col < arr.length; col++)
         {
           if (arr[row][col]>0 && arr[row][col]<=a)
             count += 1;
         }
      }
   if (count != a)
   {
      truee = false;
   }
     
   
    
    //Check if each of the numbers occurs exactly once in the matrix
    int i=0;
       
    for (int row=0; row < arr.length; row++) 
      { 
         for (int col=0; col < arr.length; col++)
         {
           i += arr[row][col];
         }
      }
    
    int sum = a*(a+1)/2;
     
     
    if (i != sum)
    {
      truee = false;
    }
     
    
    //Check if the sums of the elements in each row are equal
    int rowSum = 0;
    int colSum = 0;
     
    for (int col=0; col < arr.length; col++)
         {
           rowSum += arr[0][col];
         }
      
    for (int row=0; row < arr.length; row++)
      { 
          int rowSum2 = 0;
         for (int col=0; col < arr.length; col++)
         {
           rowSum2 += arr[row][col];
         }
          
         if(rowSum!=rowSum2)
         {
           truee = false;
         }
          
    }
    
    //Check if the sums of the elements in each column are equal
    for (int col=0; col < arr.length; col++)
         {
           colSum += arr[col][0];
         }
      
    for (int row=0; row < arr.length; row++)
      { 
        int colSum2 = 0;
         for (int col=0; col < arr.length; col++)
         {
           colSum2 += arr[col][row];
         }
          
         if(colSum!=colSum2)
         {
           truee = false;
         }
    }
     
    //Check if the sums of the elements in each diagonal are equal
    int diagSum1 = 0;
    int diagSum2 = 0;
     
    for (int row=0; row < arr.length; row++)
      { 
        int col = 0;
        diagSum1 += arr[row][row];
        col++;
      }
    
    int col = n-1;
    for (int row=0; row < arr.length; row++)
      { 
        diagSum2 += arr[row][col];
        col--;
      }
     
     
    if (diagSum1!=diagSum2)
    {
      truee=false;
    }
     
    //Check if the sums of the elements in each row, column, and diagonal are equal
    //Return the result
    
    if(truee==true)
    {
      if(diagSum1==rowSum&&rowSum==colSum)
        return truee;
      else
      {
        return false;
      }
    }
    else
    {
      return false;
    }
  }
 
   //Provides a summary of information on the square matrix
   public String toString()
   {
    String squareMatrix = "";
     
    for (int row=0; row < arr.length; row++) 
      { 
         for (int col=0; col < arr.length; col++)
         {
          squareMatrix += arr[row][col] + " ";
         }
         squareMatrix = squareMatrix + "\n";
    }
    return squareMatrix;
   }
}
   
   















