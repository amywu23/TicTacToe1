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
for(int x =0; x <4; x++){
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
        }
    }
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

}