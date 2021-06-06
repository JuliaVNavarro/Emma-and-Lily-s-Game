public class Lily extends MathGame{
  private int random;

  public Lily(){
    super();
  }

  @Override
  public int answer(){
    return 1 + random;
  }

  public int getRandom(){
    random = (int) (Math.random() * 9);
    return random;
  }

  @Override
  public String toString(){
    return "\n1 + " + getRandom() + " = " ;
  }


}