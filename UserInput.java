/**
 * Validate user input according to string array of acceptable inputs.
 * 
 * @author GShorr, PLTW
 * @version 4/16/2019
 */
import java.util.Scanner;

 public class UserInput
{
    /**
     * Verifies that one of the string array provided as an argument will be
     * returned. 
     * <P>
     * Example usage:
     * String input = User.getValidInput("yes", "no", "y", "n");
     * <P>
     * Only yes, no, y, and n are valid inputs. If the user types anything
     * else, they will be prompted to re-enter.
     * <P>
     * Uppercase versions of the commands are acceptable and automatically
     * converted to lowercase prior to validating.
     * <P>
     * @return the valid command the user entered
     * 
     */
    public static String getValidInput(String[] validInputs)
  {
        String input = "";
        boolean valid = false;
        do
        {
            input = getLine().toLowerCase();
            for(String str : validInputs)
            {
                if(input.equals(str.toLowerCase()))
                    valid = true;
            }
            if(!valid)
                System.out.print("Invalid input. Please try again\n>");
        }
        while(!valid);
        return input;
    }
    
    public static String getLine()
    {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }


  }

/* 
Requirements - must incorporate 7/9 reqs

Player actions that update the score:
 1. Move the player one space. (done)
 2. Spring a trap.(done)
 3. Jump over a space. (done)
 4. Pick up a prize.(done)
 5. Quit the game.(done)
 6. Replay. 

Player actions that do not update the score:
 7. Show a help message with all the valid commands. (done)

General:
 8. Keep a running score. (done)
 9. Deduct point(s) if the user enters an invalid command.()
*/
