public class numbergame {
    // Clear function ( Used to clear screen once user decides to retries. )
    public static void clearScreen(){
        for (int x=0; x <30;x++)  System.out.println(" ");
    }
    
    public static void runProg() {
     clearScreen(); // Clears screen at the start of the program
     // Welcome message
     System.out.println("Welcome to the");
     System.out.println("  _   _                 _                  _____   ");                   
     System.out.println("| \\ | |               | |                / ____|   ");                  
     System.out.println("|  \\| |_   _ _ __ ___ | |__   ___ _ __  | |  __  __ _ _ __ ___   ___ ");
     System.out.println("| . ` | | | | \'_ ` _ \\| \'_ \\ / _ \\ \'__| | | |_ |/ _` | \'_ ` _ \\ / _ \\");
     System.out.println("| |\\  | |_| | | | | | | |_) |  __/ |    | |__| | (_| | | | | | |  __/");
     System.out.println("|_| \\_|\\__,_|_| |_| |_|_.__/ \\___|_|     \\_____|\\__,_|_| |_| |_|\\___|");
     // User input for difficulty level
     System.out.println("***********************************");
     System.out.println("*1) Easy                          *");
     System.out.println("*2) Medium                        *");
     System.out.println("*3) Hard                          *");
     System.out.println("***********************************");
     // Get user's input
     int level = Keyboard.readInt();
     int guess;
     int tries = 0;
     // Sets the amount of tries based on the level the user chooses.
     if (level == 1) tries = 5;
     else if (level == 2) tries = 3;
     else if (level == 3) tries = 1;
     else System.out.println("Incorrect Value.");
     // Generates a random number
     int lucky = (int) (10 * Math.random()) + 1;
     int[] guessList = new int[5]; 
     // Shows how many tries left & if the number should be smalle or bigger if the number isn't guessed yet
     do{
          System.out.print("Tries left: " + tries + ", Enter your guess ");
          guess = Keyboard.readInt();
          guessList[tries-1] = guess;
          tries--;
          if ((guess > lucky)&&(tries>0)) System.out.println("Unlucky, try a smaller number. ");
          else if ((guess < lucky)&&(tries>0)) System.out.println("Unlucky, try a bigger number. ");
        }while((lucky != guess) && (tries > 0));
        // If user guesses number, show "Well Done!"  
        if (guess == lucky )
          System.out.println("Well Done!");
          else System.out.println("The number was " + lucky);
          // Shows the user's guesses when the game is over
          System.out.println("The list of user guesses was ");
          for (int cnt = 4; cnt >= 0 ; cnt--)
             if (guessList[cnt] != 0) System.out.print(guessList[cnt] + " ");
    }
}
