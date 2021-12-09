// Importing the class JOptionPane to include some graphics in my program
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Show message when program starts
      JOptionPane.showMessageDialog(null,"Welcome to my program");  
      // Creating an object named object1 of class numbergame
      numbergame object1 = new numbergame();
      char rep = 'f';
      do{
      //I am calling method runProg() for object named object1
      object1.runProg();
      // Asks the user if they'd like to play again
      System.out.print("Do you want to play again? (Press y to repeat) ");
      // Gets user input
      rep = Keyboard.readChar();
    } while ((rep == 'y')||(rep =='Y'));
      //this is a graphical dialog box to thank the user before closing
      JOptionPane.showMessageDialog(null,"Thanks for using my program, Goodbye!");  
    }
}