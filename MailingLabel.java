import javax.swing.JOptionPane;

//Author:Stephanie Sun

//MailingLabel.java
//
//This method takes the input delimiter and String, which contains user's name and address, and retrurns a delimited mailing label
//A delimited string is a string literal that contains special characters (“delimiters”) to signify a separation between different elements of information.

public class MailingLabel{
  public static void main(String[]args){
    String delimiter;
    String str;
    int again;
    do
    {
    delimiter = JOptionPane.showInputDialog ("Enter your delimiter:");
    str = JOptionPane.showInputDialog ("Enter a delimited string that holds your name and address: ");
    System.out.println(mailingLabel(str, delimiter));
    again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
  }
    while (again == JOptionPane.YES_OPTION);
  }
  
  //This method delimite the input String
  public static String mailingLabel(String str, String delimiter){
    return str.replaceAll(delimiter,"\n");
  }
}

