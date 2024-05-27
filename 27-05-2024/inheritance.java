
class fruits{
    public void intro(){
        System.out.println("Iam a fruit");
    }
}

class apple extends fruits{
    public String name="Orange";
    public void colour(){
        System.out.println(" I am in orange colour.");

    }

}
public class inheritance {
    public static void main(String[] args) {
        apple myapple = new apple();
        System.out.println(" My name is "+myapple .name );
       
        myapple .intro();
        myapple .colour();
        
    }
    
}
