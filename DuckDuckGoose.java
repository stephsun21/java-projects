//DuckDuckGoose.java  Author: Stephanie Sun
// 
//Simulates a game (such as Duck Duck Goose) and displays the winner

import javax.swing.JOptionPane;

public class DuckDuckGoose{
    public static void main( String[] args ){
 
    int again;
    
    do
    {
    String participantsStr = JOptionPane.showInputDialog ("Enter the number of participants:");
    int participants = Integer.parseInt(participantsStr);
    String cycleStr = JOptionPane.showInputDialog ("Enter the length of the cycle:");
    int cycle = Integer.parseInt(cycleStr);
    
    
    boolean[] arr = new boolean[participants];
    
    //filling the array
    for(int index = 0; index < participants; index++)
        {
          arr[index] = true;
        }
    JOptionPane.showMessageDialog(null,"The winner is : "+playGame(arr, cycle));
    again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
    }
    while (again == JOptionPane.YES_OPTION);
  }

//take the array of participants and cycle and return the winner's position  
public static int playGame(boolean[] array, int cycle){
  int trueCount=0;
  int index=0;
  int winner=0;
  
  while(index<array.length)
  {
    
    if (array[index] == true)
    {
      trueCount++;
    }
    
    //eliminates players
    if (trueCount==cycle)
    {
      array[index] = false;
      trueCount=0;
    }
    
   
   index++;
   
   if(index==array.length)
     index=0;
   
   if(players(array)==1)
     break;
   
  }
  
  //gives the position of the winner
  for (int i = 0; i <= array.length-1; i++){
      if(array[i] == true)
        {
        winner=i;
        }
 }
 
  return winner;
}

//A method that gives the number of the players left in the game
public static int players(boolean[] array){
  int numberOfPlayer=array.length;
  for (int i = 0; i <= array.length-1; i++){
      if(array[i] == false)
        {
          numberOfPlayer = numberOfPlayer-1;
        }
 }
      return numberOfPlayer;
}
}










