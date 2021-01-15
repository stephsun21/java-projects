//UserInfo.java  Author: Stephanie Sun
// 
//Represents the user

public class UserInfo{
  //Declaration of instance variables/fields for this class
  private String name, address, userName;
  
  //Initialize variables
  public UserInfo()
  {
    name="";
    address="";
    userName="";
  }
  
  //Changes the name of the user, address and username
  public void setName(String name)
  {
    this.name = name;
  }
   
  public void setAddress(String userAddress)
  {
    address = userAddress;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  //Returns the name of the user, address and username
  public String getName()
  {
    return name;
  }
   
  public String getAddress()
  {
    return address;
  }
  
  public String getUserName()
  {
    return userName;
  } 
  
  //This method encrypts its String parameter and returns the corresponding encrypted String.
  public String encrypt(String s)
  {
    s=removeWhitespaceAndConvertToUpper(s);
    s=substitute(s);
    s=swapHalfsForEncrypt(s);
    s=swapFirst2WithLast2(s);
    s=swapMiddleChars(s);
    
    return s;
  }
  
  //This method removes any leading or trailing whitespace from the String 
  //and convert all letters in the string to UPPERCASE.
  public String removeWhitespaceAndConvertToUpper(String s)
  {
    s=s.trim();
    
    s=s.toUpperCase();
    
    return s;
  }
  
  //This method does the character substitutions
  public String substitute(String s)
  {
    s=s.replace('A','@');
    s=s.replace('E','=');
    s=s.replace('I','!');
    s=s.replace('J','?');
    s=s.replace('O','*');
    s=s.replace('P','#');
    s=s.replace('R','&');
    s=s.replace('S','$');
    s=s.replace('T','+');
    s=s.replace('V','^');
    s=s.replace('X','%');
    s=s.replace(' ','_');
    
    return s;
  }
  
  //This method moves the first half of the string to be the last half.
  public String swapHalfsForEncrypt(String s)
  {
    int k = s.length( );
    int a = k%2;
    if(a==0)
    return s.substring(k/2,k) + s.substring(0,k/2);
    else
    return s.substring(k/2+1,k) + s.substring(0,k/2+1);
  }
  
  //This method swaps the first 2 characters of the line with the last two characters.
  public String swapFirst2WithLast2(String s)
  {
    int k = s.length( );
    
    return s.substring(k-2,k) +s.substring(2,k-2) +s.substring(0,2);
  }
  
  //Swap the two characters immediately to the left of the middle of the string with the two characters
  //immediately to the right of the middle of the string.
  public String swapMiddleChars(String s)
  {
    int k = s.length( );
    int a = k%2;
    if(a==0)
    return s.substring(0,k/2-2)+s.substring(k/2,k/2+2)+s.substring(k/2-2,k/2)+s.substring(k/2+2,k);
    else
    return s.substring(0,k/2-1)+s.substring(k/2+1,k/2+3)+s.substring(k/2-1,k/2+1)+s.substring(k/2+3,k);
  }
  
  //Provides a summary of information on the user
   public String toString()
  {
    String info = "";
    
    info = "Name: "+name + "\n";
    info += "Address: "+address + "\n";
    info += "Username: "+userName + "\n";
    
    return info;
   }

}
