//Bank.java  Author: Stephanie Sun
// 
//Represents the branch


public class Branch{
  
  //Declaration of instance variables/fields for this class
  private String address, phoneNumber;
  private BankTeller bankTeller;
  private static int branchCounts;
  
  //Initialize variables
  public Branch()
  {
    address="";
    phoneNumber="";
    bankTeller=null;
  }
  
  //Changes the address and phone number 
  public void setAddress( String address )
  {
    this.address=address;
    
    branchCounts++;//counts the number of branches amongst the Bank.
  }
  
  public void setPhoneNumber( String phoneNumber )
  {
    this.phoneNumber=phoneNumber;
  }
  
  
  public void setBankTeller( BankTeller bankTeller )
  {
    this.bankTeller=bankTeller;
  }
  
  //Returns the address and phone number 
  public String getAddress()
  {
    return address;
  }
  
  public String getPhoneNumber()
  {
    return phoneNumber;
  }
  
  public BankTeller getBankTeller()
  {
    return bankTeller;
  }
  
  
  //Returns branchCounts
  public static int getBranchCounts()
   {
     return branchCounts;
   }
  
  //Provides a summary of information on the branch
  public String toString()
  {
    String bankInfo="";
    
    bankInfo += "Address: "+address+"\n";
    bankInfo += "Phone Number: "+phoneNumber+"\n";
    bankInfo += "Bankteller: "+bankTeller+"\n";
    
    return bankInfo;
  }
}