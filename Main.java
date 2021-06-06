import java.util.*;

class Main {
  public static void main(String[] args) {
    
    System.out.println("\nWelcome to the MATH GAME! ");
    String emma = "Emma";
    String lily = "Lily";
    String student = " ";

    do{
      student = name();
      if(student.compareToIgnoreCase(emma) == 0){
        System.out.println("\nHello Emma!");
        MathGame e = new Emma();
        while(e.getTotal() > 0){
          System.out.print(e);
          if(e.getInt() == e.answer()){
            e.raiseScore();
          } else {
            System.out.println("INCORRECT: The answer is " + e.answer());
          }
          e.turns();
        }
        System.out.println(e.getScore());
        break;
      }
      else if(student.compareToIgnoreCase(lily) == 0){
        System.out.println("\nHello Lily!");
        MathGame l = new Lily();
        while(l.getTotal() > 0){
          System.out.print(l);
          if(l.getInt() == l.answer()){
            l.raiseScore();
          } else {
            System.out.println("INCORRECT: The answer is " + l.answer());
          }
          l.turns();
        }
        System.out.println(l.getScore());
        break;
      }
    }while(student.compareToIgnoreCase(emma) != 0 || student.compareToIgnoreCase(lily) != 0);
  }

  public static String name() {
    System.out.print("\nAre you EMMA or LILY? \n\n");
    Scanner entry = new Scanner(System.in);
    String name = entry.nextLine();
    return name;
  }
}