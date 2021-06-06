public class Emma extends MathGame{
  private int random1;
  private int random2;

  public Emma(){
    super();
  }

  @Override
  public int answer(){
    return random1 + random2;
  }


  public int getRandom1(){
    random1 = (int) (Math.random() * 15) + 1;
    return random1;
  }

  public int getRandom2(){
    random2 = (int) (Math.random() * 20) + 1;
    return random2;
  }

  @Override
  public String toString(){
    return "\n" + getRandom1() + " + " + getRandom2() + " = " ;
  }
}