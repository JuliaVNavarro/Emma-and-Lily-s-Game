/** Julia Navarro - Lily & Emma's Game
 * June 6, 2021 */

import java.util.*;

class Main {
  public static void main(String[] args) {
    
    /** Welcome message is displayed.
      * Strings contining "Emma" & "Lily" to be used for comparison.
      * Empty placeholder String used for user entry */
    System.out.println("\nWelcome to the MATH GAME! ");
    String emma = "Emma";
    String lily = "Lily";
    String student = " ";

    do { // The user will be continuously prompted to enter their name until their entry matches "Emma" or "Lily"
      student = name(); // Empty string will be replaced by user's entry (please see name() method below)
      
      /** Using the compareToIgnoreCase, if the user's entry matches the String "Emma", then a new
        * object will be created in the MathGame and Emma classes, providing math problems for Emma's
        * math level. */
      if(student.compareToIgnoreCase(emma) == 0) {
        System.out.println("\nHello Emma!");
        MathGame e = new Emma();
        
        /** Emma will be prompted to answer math problems until she has answered all 10. Once all 10 have been answered,
          * the loop and the game will end. */
        while(e.getTotal() > 0) {
          System.out.print(e);
          if(e.getInt() == e.answer()) { // If Emma answers correctly, her score will be raised. 
            e.raiseScore();
          } else { // Otherwise, Emma will be notified that her answer is incorrect, and she will be notifed of the correct answer. 
            System.out.println("INCORRECT: The answer is " + e.answer());
          }
          e.turns(); // Total amount of problems is deducted after each problem is answered.
        }
        System.out.println(e.getScore()); // Once Emma completes the 10 problems, her total score will be displayed. 
        break;
      }
      
      /** Using the compareToIgnoreCase, if the user's entry matches the String "Lily", then a new
        * object will be created in the MathGame and Emma classes, providing math problems for Lily's
        * math level. */
      else if(student.compareToIgnoreCase(lily) == 0) {
        System.out.println("\nHello Lily!");
        MathGame l = new Lily();
        
        /** Lily will be prompted to answer math problems until she has answered all 10. Once all 10 have been answered,
          * the loop and the game will end. */
        while(l.getTotal() > 0) {
          System.out.print(l);
          if(l.getInt() == l.answer()) { // If Lily answers correctly, her score will be raised. 
            l.raiseScore();
          } else {
            System.out.println("INCORRECT: The answer is " + l.answer());
          }
          l.turns();
        }
        System.out.println(l.getScore());
        break;
      }
    } while(student.compareToIgnoreCase(emma) != 0 || student.compareToIgnoreCase(lily) != 0);
  }

  public static String name() {
    System.out.print("\nAre you EMMA or LILY? \n\n");
    Scanner entry = new Scanner(System.in);
    String name = entry.nextLine();
    return name;
  }
}
