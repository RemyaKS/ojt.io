 class nonaccex {
    public static int a=0;
    public int b=0;
    public final int z=0;
    public nonaccex(){
        a++;
        b++;
    }
    public void result(){
        System.out.println("the value of a ="+a);
        System.out.println("the value of b="+b);
    }
}
public class nonacces{
    public static void main(String[] args) {
    nonaccex obj1=new nonaccex();
    System.out.println("the value of a ="+obj1.a);
    System.out.println("the value of b="+obj1.b);
    obj1.result();
    nonaccex obj2=new nonaccex();
    System.out.println("the value of a ="+obj2.a);
    System.out.println("the value of b="+obj2.b);
    obj2.result();
    }
    

}
