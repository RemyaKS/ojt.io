interface Moperation{
    int operate(int a,int b);
}
public class lambdaex {
    public static void main(String[] args) {
     Moperation add=(a,b)->a+b; 
     Moperation sub=(a,b)->a-b;
     int res1=add.operate(8, 4);
     int res2=sub.operate(6,2);
     System.out.println("Add Result ="+res1);
     System.out.println("Sub Result ="+res2);
     }  
    }
    

