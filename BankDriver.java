//Bank.java  Author: Stephanie Sun
// 
//Test of all four classes and give all the information

public class BankDriver{
  public static void main(String[] args)
  {
    //Declare variables for later use
    
    String bankName = "";
    Branch branch = null;
    String name = "";
    String tellerID = "";
    String address = "";
    String phoneNumber = "";
    BankTeller bankTeller = null;
    String customerName = "";
    String accountNumber = "";
    String idNumber = "";
    String accountType = "Deposit";
    double balance = 0;
    
    Bank greatNeckBank = new Bank(); //instantiate a new object (instance) of the class
    
    greatNeckBank.setBankName( "Great Neck Bank" ); //Set up the properties for this object, using the class' set methods.    
    
    bankName = greatNeckBank.getBankName();//Declare and initialize or instantiate variables
                                           //to store the results of calling the class' get()
                                           //methods.
    
    
    
    Branch greatNeckRoadBranch = new Branch();
    
    greatNeckRoadBranch.setAddress( "Great Neck, NY" );
    greatNeckRoadBranch.setPhoneNumber( "929-000-0000" );
    
    address = greatNeckRoadBranch.getAddress();
    phoneNumber = greatNeckRoadBranch.getPhoneNumber();
    
    BankTeller steph = new BankTeller();
    
    steph.setName( "Steph" );
    steph.setTellerID( "9256" );
    
    name = steph.getName();
    tellerID = steph.getTellerID();
    
    CustomerAccount stephen = new CustomerAccount();
    
    stephen.setCustomerName( "Stephen" );
    stephen.setAccountNumber( "00101" );
    stephen.setIdNumber( "300007216" );
    stephen.setAccountType( "Deposit" );
    stephen.setBalance(10000);
    
    customerName = stephen.getCustomerName();
    accountNumber = stephen.getAccountNumber();
    idNumber = stephen.getIdNumber();
    accountType = stephen.getAccountType();
    balance = stephen.getBalance();                    
    
    //Prints out a summary of all band data to the console.
    System.out.println(greatNeckBank);
    System.out.println("Number of branches amongst the Bank: " + Branch.getBranchCounts());
    System.out.println(greatNeckRoadBranch);
    System.out.println("Number of tellers amongst all of the branches of the bank: " + BankTeller.getCount());
    System.out.println(steph);
    System.out.println(stephen);
    
    
    //Gives the balance after deposit
    steph.deposit(stephen,5000);
    
    System.out.println("After deposit:");
    System.out.println(stephen);
    
    //gives the balance after withdrawal
    steph.withdraw(stephen,7000);
    
    System.out.println("After withdrawal:");
    System.out.println(stephen);
    
  }
}