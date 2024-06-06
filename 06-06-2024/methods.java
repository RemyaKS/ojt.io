//method overloading.
public class methods {
    public static void main(String[] args) {
        int x=15;
        int y=25;
        int r=5;
        methods obj=new methods();
        float area_circle=obj.area(r);
        int area_rectangle=obj.area(x,y);
    System.out.println("Area of circle is "+area_circle);
    System.out.println("Area of recrangle is "+area_rectangle);
    }
    public int area(int n1,int n2){
      int result=n1*n2;
        return result;
    }
    public static float area(int n){
     float result=3.15f*n*n;
        return result;
    }
}
