import java.util.Scanner;

public class Methods{
  public static void main(String[]args){
    int a;
    System.out.println("Please choose your desired calculation");
    System.out.println("1. factorial");
    System.out.println("2. firstDigit");
    System.out.println("3. allDigitsOdd");
    System.out.println("4. allDigitsSame");
    System.out.println("5. hasMidpoint");
    
    Scanner scan = new Scanner (System.in);
    a=scan.nextInt();
      if(a==1)
      {
        System.out.println("Please enter a positive integer");
        Scanner scan1 = new Scanner (System.in);
        int n=scan1.nextInt();
        System.out.println("The factorial of "+n+" is "+factorial(n));
      }
      else if(a==2)
      {
        System.out.println("Please enter an integer");
        Scanner scan2 = new Scanner (System.in);
        int b=scan2.nextInt();
        System.out.println("The first digit of "+b+" is "+firstDigit(b));
      }
      else if(a==3)
      {
        System.out.println("Please enter an integer");
        Scanner scan3 = new Scanner (System.in);
        int c=scan3.nextInt();
        System.out.println(allDigitsOdd(c));
      }
       else if(a==4)
      {
        System.out.println("Please enter an integer");
        Scanner scan4 = new Scanner (System.in);
        int d=scan4.nextInt();
        System.out.println(allDigitsSame(d));
      }
        else
      {
        System.out.println("Please enter three integers");
        Scanner scan5 = new Scanner (System.in);
        Scanner scan6 = new Scanner (System.in);
        Scanner scan7 = new Scanner (System.in);
        int e=scan5.nextInt();
        int f=scan6.nextInt();
        int g=scan7.nextInt();
        System.out.println(hasMidpoint(e, f, g));
      }


      
  }
// This method takes an integer as a parameter and returns the product n * (n – 1) * … * 2 * 1.
 public static int factorial(int n){
    int factorial=1;
    for(int i=n;i>=1;i--)
    factorial=factorial*i; 
    return factorial;  

  }
 //This method takes an integer as a parameter and returns the first numeric digit.
 public static int firstDigit(int b){
   String str1;
   int l, firstDigit, k;
   if(b>=0)
   {
   str1=Integer.toString(b);
   l=str1.length()-1;
   k= (int)Math.pow(10,l); 
   firstDigit= b/k;   
   }
   else
   {
   b=Math.abs(b);
   str1=Integer.toString(b);
   l=str1.length()-1;
   k= (int)Math.pow(10,l);
   firstDigit= -(b/k);
   }
   return firstDigit; 
 }
 //This method takes an integer and returns true if all of the individual digits in the number are odd; 
 //false otherwise


public static boolean allDigitsOdd(int c){
  c=Math.abs(c);
  int z, q ;
  for(int i=c;i>=1;)
  {
    z=i%10;  
    q=z%2;   
    i=(i/10); 
    if(q==0) 
      return false; 
  } 
  return true; 
}

//This method takes an integer and returns true if all of the individual digits in the number are all odd or 
//all even; false otherwise

public static boolean allDigitsSame(int d){
 d=Math.abs(d);
  int w, p, z, q; 
  int evenCount=0; 
  int oddCount=0;
  String str1=Integer.toString(d);
  w=str1.length();
  for(int i=d; i>=1;)
  {
    z=i%10;  
    q=z%2;
    i=(i/10);
    if(q==0)
       evenCount++; 
    else
       oddCount++;  
  } 
if (evenCount==w || oddCount==w) 
   return true; 
else
  return false;
}


//This method takes three integers as parameters and returns true if the average of any two of them is the third.
public static boolean hasMidpoint(int e, int f, int g) {
 double midpoint1=(e+f)/2.0;
 double midpoint2=(e+g)/2.0;
 double midpoint3=(g+f)/2.0;
 if(e==midpoint3 || f==midpoint2 || g==midpoint1) 
   return true; 
 else
   return false;
 }
}


 
    
    
    
    
    
    
    
    
    
    
    
    
    
    