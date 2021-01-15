import javax.swing.JOptionPane;

//Author:Stephanie Sun

//CozaLozaWoza.java
//
//This method takes an integer and return a special string by calling the cozaLozaWoza method.

public class CozaLozaWoza{
  public static void main(String[]args){
    int again;
    do
    {
    String nStr = JOptionPane.showInputDialog("Enter an integer:");
    int n = Integer.parseInt(nStr);
    JOptionPane.showMessageDialog(null, cozaLozaWoza(n));
    again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
    }
    while (again == JOptionPane.YES_OPTION);
  }
  
  //This method returns a string that contains numbers 1 to n, with 11 numbers per line. This method prints "Coza" in place of the numbers which are multiples of 3, 
  //"Loza" for multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, "CozaWoza" for multiples of 3 and 7, "LozaWoza" for multiples of 5 and 7,
  //and "CozaLozaWoza" for multiples of 3, 5 and 7.
  
  public static String cozaLozaWoza(int n){
    String str1;
    String str2="";
    for(int i=1; i<=n; i++){
    {
      if (i%11==0)
        str1= Integer.toString(i)+"\n";
      else if (i%3==0 && i%5==0 && i%7==0)
        str1= "CozaLozaWoza ";
      else if (i%3==0 && i%5==0)
        str1= "CozaLoza ";
      else if (i%3==0 && i%7==0)
        str1= "CozaWoza ";
      else if (i%5==0 && i%7==0)
        str1= "LozaWoza ";
      else if (i%3==0)
        str1= "Coza ";
      else if (i%5==0)
        str1= "Loza ";
      else if (i%7==0)
        str1= "Woza ";
      else 
        str1= Integer.toString(i)+" ";
      }
      str2 += str1;
    }
    return str2;
  }
}

    