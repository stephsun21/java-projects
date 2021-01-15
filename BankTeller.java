//Bank.java  Author: Stephanie Sun
// 
//Represents the bankteller

public class BankTeller{
  
  //Declaration of instance variables/fields for this class
  private String name, tellerID;
  private static int count = 0;
  
  //Initialize variables
  public BankTeller()
  {
    name="";
    tellerID="";
  }
  
  //Changes the name of the bankteller and teller ID
  public void setName( String name )
  {
    this.name = name;
  }
  
  public void setTellerID( String tellerID )
  {
    this.tellerID=tellerID;
  }
  
  //Returns the name of the bankteller and teller ID
  public String getName()
  {
    count++; //counts the number of tellers amongst all of the branches of the bank
    return name;
  }
  
  public String getTellerID()
  {
    return tellerID;
  }
  
  //make a deposit to a customer account and return the balance
  public double getBalance(CustomerAccount info)
  {
    return info.getBalance();
  }
  
  public void deposit(CustomerAccount info, double deposit)
  {
    info.setBalance(info.getBalance()+ deposit);
  }
  
  //make a withdrawal to a customer account and return the balance
  public boolean withdraw(CustomerAccount info, double withdrawal)
  {
    if (info.getBalance()>=withdrawal)
    {
      info.setBalance(info.getBalance()-withdrawal);
      return true;
    }
    else
      return false;
  }
  
  //return the count 
  public static int getCount ()
   {
     return count;
   }
  
  //Provides a summary of information on the bankteller
  public String toString()
  {
    String bankInfo="";
    
    bankInfo += "Teller name: "+name+"\n";
    bankInfo += "Teller ID: "+tellerID+"\n";
    
    return bankInfo;
  }
}






















