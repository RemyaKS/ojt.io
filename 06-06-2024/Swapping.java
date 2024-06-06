public class Swapping {
  public static void main(String[] args) {
      int x=20;
      int y=15;
      swapFunction(x,y);
  }  
  public static void swapFunction(int a,int b) {
      System.out.println("Original Value of a :"+a+"  Original Value of b :"+b);
      int c=a;
      a=b;
      b=c;
      System.out.println("Swapped value of a :"+a+"  Swapped value of a :"+b);
  }
}
