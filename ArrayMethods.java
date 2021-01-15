import java.util.Scanner;


//This method asks the user for their desired task and gives the output

 public class ArrayMethods{
  public static void main( String[] args ){
    
    
    int again;
    
    do{
    
    //display a menu to ask the user for their desired task.
    int a;
    System.out.println("Please choose your desired task");
    System.out.println("1. reverseArray");
    System.out.println("2. smallestValue");
    System.out.println("3. largestValue");
    
    Scanner scan = new Scanner (System.in);
    a=scan.nextInt();
    
    //get the size and elements of the array from user.
    System.out.println("Please enter the number of elements:");
        Scanner scan1 = new Scanner (System.in);
        int n=scan1.nextInt();
        
        int[] arr = new int[n];
     
        Scanner input = new Scanner(System.in);
        for(int index = 0; index < n; index++)
        {
          System.out.println("Enter element "+index);
          arr[index] = input.nextInt();
        }
        
      //calling different methods.  
      if(a==1)
      {
        System.out.println("The reverse of the array is "+ java.util.Arrays.toString(reverseArray(arr)));
      }
        
      else if(a==2)
      {
        System.out.println("The smallest value of the array is "+smallestValue(arr));
      }
      
      else
      {
        System.out.println("The largest value of the array is "+largestValue(arr));
      }
      
      //user-controlled exit.
      System.out.println("Again? (1 for yes, 2 for no):");
      Scanner scan2 = new Scanner (System.in);
      again=scan2.nextInt();
      
    }
    while (again == 1);
      
      
  }

//This method takes an integer array as a parameter and returns the array in reverse order.
public static int[] reverseArray(int[] arr)
{
  int n = arr.length;
  int[] reverseArr = new int[n];
  for(int i = 0; i < n; i++)
  {
    reverseArr[i] = arr[n-1-i];
  }
  return reverseArr;
}

//This method takes an integer array as a parameter and returns the smallest value in the array.
public static int smallestValue(int[] arr)
{
  int n = arr.length;
  int smallestValue = arr[0];
  
  for(int i = 1; i < n; i++)
  {
    if(smallestValue>arr[i])
      smallestValue=arr[i];
  }
  
  return smallestValue;
}

//This method takes an integer array as a parameter and returns the largest value in the array.
public static int largestValue(int[] arr)
{
  int n = arr.length;
  int largestValue = arr[0];
  
  for(int i = 1; i < n; i++)
  {
    if(largestValue<arr[i])
       largestValue=arr[i];
  }
  
  return largestValue;
}



}
