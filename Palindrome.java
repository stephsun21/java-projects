import javax.swing.JOptionPane;

//Author:Stephanie Sun

//Palindrome.java
//
//A palindrome method prompts user for a String, gives the reverse string and determines whether or not it is a palindrome.

public class Palindrome{
  public static void main(String[]args){
    String str;
    int again;
    do
    {
    str = JOptionPane.showInputDialog ("Enter a string: ");
    JOptionPane.showMessageDialog (null, "The reverse String is "+reverseString(str));
    JOptionPane.showMessageDialog (null, isPalindrome(str));
    again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
    }
    while (again == JOptionPane.YES_OPTION);
  }
  
  //This method takes a String and return the reversed original String
   public static String reverseString(String str){
   char character;
   String reverseStr="";
   for (int i=str.length()-1;i>=0;i--){
     {
       character = str.charAt(i);
       reverseStr += character;
     }
   }
   return reverseStr;
 }
 
  //This method comapares the original String with the reversed String and return true if they are equal
  //false when they're not equal
  public static boolean isPalindrome(String str){
    if (str.compareTo(reverseString(str))==0)
      return true;
    else 
      return false;
  }
}