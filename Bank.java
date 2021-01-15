
//Bank.java  Author: Stephanie Sun
// 
//Represents the bank

public class Bank
{
  //Declaration of instance variables/fields for this class
  
  private String bankName;
  private Branch branch;
  
  
  //Initialize variables
  public Bank()
  {
    bankName="";
    branch=null;
  }
  
  //Changes the name of the bank and branch
  public void setBankName( String name )
  {
    bankName = name;
  }
  
  public void setBranch( Branch branch )
  {
    this.branch = branch;
  }
  
  //Returns the name of the bank and branch
  public String getBankName()
  {
    return bankName;
  }
  
  public Branch getBranch()
  {
    return branch;
  }
  
  
  //Provides a summary of information on the bank
  public String toString()
  {
    
    String bankInfo="";
    
    bankInfo += "Bank name: "+bankName+"\n";
    bankInfo += "Branch: "+branch+"\n";
    
    return bankInfo;
  }
}