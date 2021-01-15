//  NoughtsCrossesPanel.java       Author: Stephanie
//
//  Panal class for the NoughtsCrosses GUI

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
   
public class NoughtsCrossesPanel extends JPanel
{
  //declaring variables   
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
  ImageIcon nought, cross;
  int change = 0;
  boolean truee = false;
  int again;
   
  //variables used to decides if there is a winner
  int winn1 = 99;
  int winn2 = 98;
  int winn3 = 97;
  int winn4 = 96;
  int winn5 = 95;
  int winn6 = 94;
  int winn7 = 93;
  int winn8 = 92;
  int winn9 = 91;
  
  // Constructor: Sets up the main GUI components.
  public NoughtsCrossesPanel ()
   {
     //Setting the bottons
     b1 = new JButton();
     b1.addActionListener (new B1Listener());
     b2 = new JButton(); 
     b2.addActionListener (new B2Listener());
     b3 = new JButton();
     b3.addActionListener (new B3Listener());
     b4 = new JButton();
     b4.addActionListener (new B4Listener());
     b5 = new JButton();
     b5.addActionListener (new B5Listener());
     b6 = new JButton();
     b6.addActionListener (new B6Listener());
     b7 = new JButton();
     b7.addActionListener (new B7Listener());
     b8 = new JButton();
     b8.addActionListener (new B8Listener());
     b9 = new JButton();
     b9.addActionListener (new B9Listener());

      //setting the background color, size and layout of the panel
     setPreferredSize (new Dimension(400, 400));
     setLayout(new GridLayout(3,3));
     //adding the buttons to the panel
     add(b1);
     add(b2);
     add(b3);
     add(b4);
     add(b5);
     add(b6);
     add(b7);
     add(b8);
     add(b9);
  }
  
  //Represents an action listener for b1 button. All action listeners(b1 to b9) have the same function
  private class B1Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        //loading the image files and setting the images' sizes
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
          
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
 
        //player O's move
        if (change%2==0)
        {
        //display proper image and sound when the botton is clicked
        Sound.noughtAud.play();
        b1.setIcon(image);
        winn1 = 1;
        }
         
        //play X's move
        if(change%2==1)
        {
        //display proper image and sound when the botton is clicked
        Sound.crossAud.play();
        b1.setIcon(image2);
        winn1 = 2;
        }
         
        //count the number of buttons clicked
        change++;
          
        //when no player wins the game
        if(isWinner() == false && change==9)
            {
              //display proper dialog and sound
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              //ask if the user wants to play the game again
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        //when player O wins the game 
        if(isWinner() == true && change%2==1)
            {
              //display proper dialog and sound
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
        //when player X wins the game  
        if (isWinner() == true && change%2==0)
            {
              //display proper dialog and sound
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
      }
   }

  //Represents an action listener for b2 button.
  private class B2Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
           
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
           
        if (change%2==0)
        {
        Sound.noughtAud.play();
        b2.setIcon(image);
        winn2 = 1;
        }
        else
        {
        Sound.crossAud.play();
        b2.setIcon(image2);
        winn2 = 2;
        }
       
        change++;
         
        if(isWinner() == false && change==9)
            {
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        if(isWinner() == true && change%2==1)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
        }
          
        if (isWinner() == true && change%2==0)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
      }
   }
      }
  
  //Represents an action listener for b3 button.
  private class B3Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
          
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
          
        if (change%2==0)
        {
        Sound.noughtAud.play();
        b3.setIcon(image);
        winn3 = 1;
        }
        else
        {
        Sound.crossAud.play();
        b3.setIcon(image2);
        winn3 = 2;
        }
           
        change++;
          
        if(isWinner() == false && change==9)
            {
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        if(isWinner() == true && change%2==1)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
          
        if (isWinner() == true && change%2==0)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
        }
      }
   }
     
  //Represents an action listener for b4 button.
  private class B4Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
           
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
          
        if (change%2==0)
        {
        Sound.noughtAud.play();
        b4.setIcon(image);
        winn4 = 1;
        }
        else
        {
        Sound.crossAud.play();
        b4.setIcon(image2);
        winn4 = 2;
        }
          
        change++;
          
        if(isWinner() == false && change==9)
            {
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        if(isWinner() == true && change%2==1)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
          
        if (isWinner() == true && change%2==0)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }  
      }
   }
     
  //Represents an action listener for b5 button.
  private class B5Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
           
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
          
        if (change%2==0)
        {
        Sound.noughtAud.play();
        b5.setIcon(image);
        winn5 = 1;
        }
        else
        {
        Sound.crossAud.play();
        b5.setIcon(image2);
        winn5 = 2;
        }
           
        change++;
          
        if(isWinner() == false && change==9)
            {
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        if(isWinner() == true && change%2==1)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
          
        if (isWinner() == true && change%2==0)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
      }
   }
     
  //Represents an action listener for b6 button.
  private class B6Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
           
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
          
        if (change%2==0)
        {
        Sound.noughtAud.play();
        b6.setIcon(image);
        winn6 = 1;
        }
        else
        {
        Sound.crossAud.play();
        b6.setIcon(image2);
        winn6 = 2;
        }
  
        change++;
          
        if(isWinner() == false && change==9)
            {
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        if(isWinner() == true && change%2==1)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
          
        if (isWinner() == true && change%2==0)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
      }
   }
     
  //Represents an action listener for b7 button.
  private class B7Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
           
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
          
        if (change%2==0)
        {
        Sound.noughtAud.play();
        b7.setIcon(image);
        winn7 = 1;
        }
        else
        {
        Sound.crossAud.play();
        b7.setIcon(image2);
        winn7 = 2;
        }
         
        change++;
          
        if(isWinner() == false && change==9)
            {
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        if(isWinner() == true && change%2==1)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
          
        if (isWinner() == true && change%2==0)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
      }
   }
     
  //Represents an action listener for b8 button.
  private class B8Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
           
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
          
        if (change%2==0)
        {
        Sound.noughtAud.play();
        b8.setIcon(image);
        winn8 = 1;
        }
        else
        {
        Sound.crossAud.play();
        b8.setIcon(image2);
        winn8 = 2;
        }
           
        change++;
          
        if(isWinner() == false && change==9)
            {
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        if(isWinner() == true && change%2==1)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
          
        if (isWinner() == true && change%2==0)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            } 
      }
   }
     
  //Represents an action listener for b9 button.
  private class B9Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
        nought = new ImageIcon("nought.jpg");
        Image size = nought.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(size);
           
        cross = new ImageIcon("images.png");
        Image size2 = cross.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(size2);
         
        if (change%2==0)
        {
        Sound.noughtAud.play();
        b9.setIcon(image);
        winn9 = 1;
        }
        else
        {
        Sound.crossAud.play();
        b9.setIcon(image2);
        winn9 = 2;
        }
  
        change++;
         
        if(isWinner() == false && change==9)
            {
              Sound.flatAud.play();
              JOptionPane.showMessageDialog(null, "Game Over. Nobody wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.flatAud.stop();
              restart();
              }
            }
          
        if(isWinner() == true && change%2==1)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. O wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
          
        if (isWinner() == true && change%2==0)
            {
              Sound.clapping.play();
              JOptionPane.showMessageDialog(null, "Game Over. X wins!");
              again = JOptionPane.showConfirmDialog (null, "Do you want to continue the program?");
              if (again == JOptionPane.YES_OPTION)
              {
              Sound.clapping.stop();
              restart();
              }
            }
      }
  }
    
  //method to decide if there is a winner
  public boolean isWinner()
  {
    //horizontal wins
    if (winn1==winn2 && winn2==winn3)
      truee = true;
    else if (winn4==winn5 && winn5==winn6)
      truee = true;
    else if (winn7==winn8 && winn8==winn9)
      truee = true;
    
    //vertical wins
    else if (winn1==winn4 && winn4==winn7)
      truee = true;
    else if (winn2==winn5 && winn5==winn8)
      truee = true;
    else if (winn3==winn6 && winn6==winn9)
      truee = true;
    
    //diagonal wins
    else if (winn1==winn5 && winn5==winn9)
      truee = true;
    else if (winn3==winn5 && winn5==winn7)
      truee = true;
    else
      truee = false;
      
    return truee;
  }
 
  //method to reset the image on the panel and variables used to decides if there is a winner
  public void restart()
  {
    b1.setIcon(null);
    b2.setIcon(null);
    b3.setIcon(null);
    b4.setIcon(null);
    b5.setIcon(null);
    b6.setIcon(null);
    b7.setIcon(null);
    b8.setIcon(null);
    b9.setIcon(null);
     
    winn1 = 99;
    winn2 = 98;
    winn3 = 97;
    winn4 = 96;
    winn5 = 95;
    winn6 = 94;
    winn7 = 93;
    winn8 = 92;
    winn9 = 91;
     
    change = 0;
  }
  }
