class OuterClass {
    int x = 20;
  
    class InnerClass {
      int y = 10;
    }
  }
  
  public class Inner_class {
    public static void main(String[] args) {
      OuterClass myOuter = new OuterClass();
      OuterClass.InnerClass myInner = myOuter.new InnerClass();
      System.out.println(myInner.y + myOuter.x);
    }
  }
  