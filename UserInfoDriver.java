//UserInfoDriver.java  Author: Stephanie Sun
// 
//Test of the UserInfo class and give all the information


import javax.swing.JOptionPane;

public class UserInfoDriver{
  public static void main( String[] args ){
    
    //Declare variables for later use
    int again;

    String name="";
    String address="";
    String userName="";
    String password="";
    
    do{
    
    UserInfo user = new UserInfo();//instantiate a new object (instance) of the class
    
    //Get information from input
    user.setName(JOptionPane.showInputDialog ("Enter your name: "));
    name=user.getName();
    user.setAddress(JOptionPane.showInputDialog ("Enter your address: "));
    address=user.getAddress();
    user.setUserName(JOptionPane.showInputDialog ("Enter your username: "));
    userName=user.getUserName();
    password=JOptionPane.showInputDialog ("Enter your password: ");
    
    //gives a summary of user's data and the encrypted password
    JOptionPane.showMessageDialog(null,user);
    
    JOptionPane.showMessageDialog(null,"Your original password : "+password);
   
    JOptionPane.showMessageDialog(null,"Your new password : "+user.encrypt(password));
 
    //User controlled exit
    again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
    }
    while (again == JOptionPane.YES_OPTION);
  }
}
    