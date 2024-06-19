 class shape {
    void draw(){
        System.out.println("Drawing a shape");  
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Drawing a circle");
    }

}
class rectangle extends shape{
    void draw(){
        System.out.println("Drawing a rectangle ");
}
}
public class shapes {
    public static void main(String[] args) {
        shape s = new shape();
        shape c = new circle();
        shape re = new rectangle ();
        s. draw();
        c.draw();
        re.draw();
        
 }
}