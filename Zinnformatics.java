import javax.swing.JOptionPane;
import java.text.NumberFormat;

//Author:Stephanie Sun

//Zinnformatics.java
//
//This method takes the input company name and quantity orderd and output a final invoice through a message box.

public class Zinnformatics{
  public static void main(String[]args){
    int again;
    do{
    String companyName = JOptionPane.showInputDialog ("Enter your company name:");
    String quantityStr = JOptionPane.showInputDialog ("Enter the number of packages that they would like to order:");
    int quantity = Integer.parseInt(quantityStr);
    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
    NumberFormat fmt2 = NumberFormat.getPercentInstance();
    JOptionPane.showMessageDialog (null, "Thank you for your order "+companyName+" ! You have ordered "+ quantityStr+ " packages, at a "+fmt2.format(discount(quantity))+ " discount. Your final cost will be " + fmt1.format(zinnformatics(quantity)));
    again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
    }
    while (again == JOptionPane.YES_OPTION);
  }
  
  //This method takes the quantity orderd and returns the discount the user gets.
  public static double discount(int quantity){
    if(quantity<=9)
      return 0;
    else if(quantity >= 10 && quantity < 20)
      return 0.2;
    else if(quantity >= 20 && quantity < 50)
      return 0.3;
    else if(quantity >= 50 && quantity < 100)
      return 0.4;
    else
      return 0.5;
  }
  
  //This method takes the quantity orderd and discount and returns the final price.
  public static double zinnformatics(int quantity){
    return 99*quantity*(1-discount(quantity));
  }
}
  
  
    
  

    