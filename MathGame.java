import java.util.*;

public abstract class MathGame{
  private int score;
  private int total;

  public MathGame(){
    score = 0;
    total = 10;
  }

  public String getScore(){
    return "\nYour total score is " + score + "/" + "10";
  }

  public int raiseScore(){
    return score += 1;
  }

  public int getTotal(){
    return total;
  }

  public int turns(){

    return total -= 1;
  }

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

  public abstract int answer();

  public abstract String toString();
  
}