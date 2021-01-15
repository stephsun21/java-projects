import java.util.Scanner;

//Author:Stephanie Sun

//CaesarCipher.java
//
//A Caesar Cipher is a method of encoding or decoding a message by shifting each character by the same number of letters. 
//For example, with a shift of 5, ‘A’ would encode to ‘F’. With a shift of 5, ‘F’ would decode to ‘A’.

public class CaesarCipher{
  public static void main(String[]args){
    System.out.println("1.encode a string");
    System.out.println("2.decode a string");
    System.out.println("Please enter your choice(type in the number)");
    Scanner scan = new Scanner(System.in);
    int a=scan.nextInt();
    System.out.println("Please enter a string");
    Scanner scan1 = new Scanner(System.in);
    String str=scan1.next();
    System.out.println("Please enter your shift value");
    Scanner scan2 = new Scanner(System.in);
    int shift=scan2.nextInt();
    if (a==1)
      System.out.println(encode(str, shift));
    else
      System.out.println(decode(str, shift));
    
  }
  //This method takes a String and an int as parameters and returns a String, 
  //where each of the characters in the original has been shifted shift number of characters.
  
  public static String encode(String str, int shift){
    char c;
    String str2="";
    for(int i=0;i<=str.length()-1;i++)
    {
      {
        if (str.charAt(i)+shift%26<=90)
        c=(char)(str.charAt(i)+shift%26);
        else
        c=(char)(str.charAt(i)+shift%26-26);
      }
      str2 += c;
    }
    return str2;
  }
  
  //This method takes a String and an int as parameters and returns a String, 
  //where each of the characters in the original has been shifted -shift number of characters.

  public static String decode(String str, int shift){
    char c;
      
    String str2="";
    for(int i=0;i<=str.length()-1;i++)
    {
      {
        if (str.charAt(i)-shift%26>=65)
        c=(char)(str.charAt(i)-shift%26);
        else
        c=(char)(str.charAt(i)-shift%26+26);
      }
      str2 += c;
    }
    return str2;
  }
  
}
    