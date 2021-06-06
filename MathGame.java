/** Julia Navarro - Lily & Emma's Game
 * June 6, 2021 */

import java.util.*;

public abstract class MathGame{
  private int score;
  private int total;

  public MathGame(){ // Game constructor
    score = 0;
    total = 10;
  }
  
  /** @return returns String stating the user's correct answers out of 10 */
  public String getScore(){
    return "\nYour total score is " + score + "/" + "10";
  }
  
  /** @return returns user's new score when they answer a problem correctly  */
  public int raiseScore(){
    return score += 1;
  }
  
  /** @return returns the total amount of problems left to answer */
  public int getTotal(){
    return total;
  }
  
  /** @return returns the new total of prolems left to answer after the user answers a problem */
  public int turns(){
    return total -= 1;
  }
  
  /** @return promps the user to enter an integer for the problem they are solving and returns their answer */
  public static int getInt(){
    Scanner input = new Scanner(System.in);
    int entry = 0;
    boolean valid = false;
    while(!valid){
      if(input.hasNextInt()){
        entry = input.nextInt();
        valid = true;
      } else {
      input.next();
      System.out.println("\nPlease enter a number.\n");
    }
  }
  return entry;
}

  public abstract int answer(); // Abstract method that will contain the answer to the problem

  public abstract String toString(); // Abstract method that will return a String of the current math problem
  
}
