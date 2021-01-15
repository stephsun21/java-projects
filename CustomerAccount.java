//Bank.java  Author: Stephanie Sun
// 
//Represents the customer account


public class CustomerAccount{
  
  //Declaration of instance variables/fields for this class
  
  private String customerName, accountNumber, idNumber, accountType;
  private double balance;
  
  //Initialize variables
  public CustomerAccount()
  {
    customerName="";
    accountNumber="";
    idNumber="";
    balance=0;
    accountType="";
  }
  
  //Changes the variables
  public void setCustomerName( String customerName )
  {
    this.customerName=customerName;
  }
  
  public void setAccountNumber( String accountNumber )
  {
    this.accountNumber=accountNumber;
  }
  
  public void setIdNumber( String idNumber )
  {
    this.idNumber=idNumber;
  }
  
  public void setAccountType( String accountType )
  {
    this.accountType=accountType;
  }
  
  public void setBalance( double balance )
  {
    this.balance=balance;
  }
  
  //Returns the variables
  public String getCustomerName()
  {
    return customerName;
  }
    
  public String getAccountNumber()
  {
    return accountNumber;
  }
    
  public String getIdNumber()
  {
    return idNumber;
  }
  
  public double getBalance()
  {
    return balance;
  }
  
   public String getAccountType()
  {
    return accountType;
  }
   
   //Provides a summary of information on customer account
    public String toString()
  {
    String bankInfo="";
    
    bankInfo += "Customer name: "+customerName+"\n";
    bankInfo += "Account number: "+accountNumber+"\n";
    bankInfo += "ID number: "+idNumber+"\n";
    bankInfo += "Account type: "+accountType+"\n";
    bankInfo += "Balance: "+balance+"\n";
    
    return bankInfo;
  }
   
  
   
}