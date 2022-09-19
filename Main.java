/*
* Problem 1: Escape Room
* 
* V1.0
* 10/10/2019
* Copyright(c) 2019 PLTW to present. All rights reserved
*/
import java.util.Scanner;

/**
 * Create an escape room game where the player must navigate
 * to the other side of the screen in the fewest steps, while
 * avoiding obstacles and collecting prizes.
 */
class Main
{

      // describe the game with brief welcome message
      // determine the size (length and width) a player must move to stay within the grid markings
      // Allow game commands:
      //    right, left, up, down: if you try to go off grid or bump into wall, score decreases 
      //    jump over 1 space: you cannot jump over walls
      //    if you land on a trap, spring a trap to increase score: you must first check if there is a trap, if none exists, penalty
      //    pick up prize: score increases, if there is no prize, penalty
      //    help: display all possible commands
      //    end: reach the far right wall, score increase, game ends, if game ended without reaching far right wall, penalty
      //    replay: shows number of player steps and resets the board, you or another player can play the same board
      // Note that you must adjust the score with any method that returns a score
      // Optional: create a custom image for your player use the file player.png on disk
    
      /**** provided code:
      // set up the game
*/
 //     boolean play = true;{
    //  while (play)
      //{
        // get user input and call game methods to play 
        //play = false;
        //}
      //}

public static void main(String[] args) 
  {      
    // welcome message
    System.out.println("Welcome to EscapeRoom!");
    System.out.println("Get to the other side of the room, avoiding walls and invisible traps,");
    System.out.println("pick up all the prizes.\n");
	
    GameGUI game = new GameGUI();
    game.createBoard();
    // size of move
    int m = 60; 
    // individual player moves
    int px = 0;
    int py = 0; 
    
    int score = 0;

    Scanner in = new Scanner(System.in);
    String[] validCommands = { "right", "left", "up", "down", "r", "l", "u", "d",
    "jump", "jr", "jumpleft", "jl", "jumpup", "ju", "jumpdown", "jd",
    "pickup", "p", "quit", "q", "replay", "help", "?", "done"};
  
    // set up game
    boolean play = true;
    while (play)
    {
      /* TODO: get all the commands working */
	  /* Your code here */

    System.out.print("Enter Command: ");
    String input = UserInput.getValidInput(validCommands);
    if(input.equals("right")|| input.equals("r")){
			//System.out.println("Current Score: " + score);
      game.movePlayer(px +m, 0);
      }
			
    else if(input.equals("left")|| input.equals("l")){
      game.movePlayer(px -m, 0);
      }
			
    else if(input.equals("up")|| input.equals("u")){
      game.movePlayer(0, py - m);
      }
			
		else if(input.equals("down") || input.equals("d")){
			game.movePlayer(0,py+m);
		}
			
		else if(input.equals("jumpright") || input.equals("jr")){
			game.movePlayer(2*m, 0);
		}

		else if(input.equals("jumpleft") || input.equals("jl")){
			game.movePlayer(-2*m, 0);
		}        
                                                             
		else if(input.equals("jumpdown") || input.equals("jd")){
			game.movePlayer(0 , 2*m);
		}                                

		else if(input.equals("jumpup") || input.equals("ju")){
			game.movePlayer(0, -2*m);
		}                                                        
			
		else if(input.equals("quit")|| input.equals("q")){
			System.exit(0);
		}	
			
		else if(input.equals("pickup") || input.equals("p")){
      score += game.pickupPrize();
			System.out.println("Current Score: " + score);
      System.out.println();
    }
    else if (input.equals("done")){ 
      game.endGame();
      System.out.println("Final Score: " + score);
    }
      
  	else if(input.equals("help") || input.equals("?")){
		System.out.println();
     System.out.println("Valid Commands are as follows:  \n" + 
     "right, " + "left, " + "up, " + "down, " + "r, " + "l, " + "u, " + "d, " + "jumpup, " + "ju" + "jumpdown, " + "jd" + "jumpright, " + "jr" + "jumpleft, " + "jl" + "pickup, " + "p, " + "quit, " + "q, " + "replay, " + "help, " + "?, " + "done");
		System.out.println();
    }
      
if(game.isTrap(px,py));
{
  score +=game.springTrap(px,py);
}
      
  score +=game.movePlayer(px,py);
      }

        score += game.endGame();

      System.out.println("score=" + score);    
      System.out.println("steps=" + game.getSteps());
   }
}      