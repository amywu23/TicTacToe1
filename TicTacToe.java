import java.awt.*;
import javax.swing.*;
import javax.swing.event.SwingPropertyChangeSupport;


import java.util.ArrayList;
import java.util.Scanner;


public class TicTacToe{

    private String player1 = "X";
    private String player2 = "O";
    private int playTurn = 0;
    private Board board;


    public static void main(String args[]){
        TicTacToe t = new TicTacToe();
        t.startGame();

    }

    public void startGame(){
        
        board = new Board();
        board.drawBoard();
while(!isGameOver()){
        if (playTurn == 0){
            Scanner s = new Scanner(System.in);
            System.out.println("Player 1, please enter a position to be replaced by X:");
            int one = s.nextInt();
            if(one%3==0){
                Position.set(one-1, "X\n");
            }
            else{
            Position.set(one-1, player1);}
            playTurn++; 
            callArray();
            if(isGameOver()){
                // System.out.println("player 1 wins");
                break;
  
            }

        }    
       
        if (playTurn == 1){
            Scanner s = new Scanner(System.in);
        System.out.println("Player 2, please enter a position to be replaced by O:");
        int one = s.nextInt();
        if(one%3==0){
            Position.set(one-1, "O\n");
        }
        else{
        Position.set(one-1, player2);}
        playTurn--;
        callArray();
        if(isGameOver()){
            // System.out.println("player 2 wins");
            break;

        }
        }
    }
    // Scanner s = new Scanner(System.in);
    //         System.out.println("Player 1, please enter a position to be replaced by X:");
    //         int one = s.nextInt();
    //         if(one%3==0){
    //             Position.set(one-1, "X\n");
    //         }
    //         else{
    //         Position.set(one-1, player1);}
    //         playTurn++; 
    //         callArray();
    
    }


   ArrayList<String> Position = new ArrayList<String>() {
      {
         add("_");
         add("_");
         add("_\n");
         add("_");
         add("_");
         add("_\n");
         add("_");
         add("_");
         add("_\n");

      }
   
    };
    
    
    public void callArray(){
    for(int i=0;i<9;i++)
        {
            System.out.print(Position.get(i)+" ");
        }

    }

public boolean isGameOver(){
if (Position.get(0).equals("X") && Position.get(1).equals("X") && Position.get(2).equals("X\n")){
 System.out.println("1 wins");
    return true;
}
if (Position.get(3).equals("X") && Position.get(4).equals("X") && Position.get(5).equals("X\n")){
    System.out.println("1 wins");
       return true;
}
if (Position.get(6).equals("X") && Position.get(8).equals("X") && Position.get(8).equals("X\n")){
    System.out.println("1 wins");
       return true;
}

//diagonal


if (Position.get(0).equals("X") && Position.get(4).equals("X") && Position.get(8).equals("X\n")){
    System.out.println("1 wins");
       return true;
}
if (Position.get(2).equals("X\n") && Position.get(4).equals("X") && Position.get(6).equals("X")){
    System.out.println("1 wins");
       return true;
}

//vertical

if (Position.get(0).equals("X") && Position.get(3).equals("X") && Position.get(6).equals("X")){
    System.out.println("1 wins");
       return true;
}
if (Position.get(1).equals("X") && Position.get(4).equals("X") && Position.get(7).equals("X")){
    System.out.println("1 wins");
       return true;
}
if (Position.get(2).equals("X\n") && Position.get(5).equals("X\n") && Position.get(8).equals("X\n")){
    System.out.println("1 wins");
       return true;
}





if (Position.get(0).equals("O") && Position.get(1).equals("O") && Position.get(2).equals("O\n")){
    System.out.println("2 wins");
       return true;
   }
   if (Position.get(3).equals("O") && Position.get(4).equals("O") && Position.get(5).equals("O\n")){
       System.out.println("2 wins");
          return true;
   }
   if (Position.get(6).equals("O") && Position.get(8).equals("O") && Position.get(8).equals("O\n")){
       System.out.println("2 wins");
          return true;
   }
   
   //diagonal
   
   
   if (Position.get(0).equals("O") && Position.get(4).equals("O") && Position.get(8).equals("O\n")){
       System.out.println("2 wins");
          return true;
   }
   if (Position.get(2).equals("O\n") && Position.get(4).equals("O") && Position.get(6).equals("O")){
       System.out.println("2 wins");
          return true;
   }
   
   //vertical
   
   if (Position.get(0).equals("O") && Position.get(3).equals("O") && Position.get(6).equals("O")){
       System.out.println("2 wins");
          return true;
   }
   if (Position.get(1).equals("O") && Position.get(4).equals("O") && Position.get(7).equals("O")){
       System.out.println("2 wins");
          return true;
   }
   if (Position.get(2).equals("O\n") && Position.get(5).equals("O\n") && Position.get(8).equals("O\n")){
       System.out.println("2 wins");
          return true;
   }
   
return false;
}



}