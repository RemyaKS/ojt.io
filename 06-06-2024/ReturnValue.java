//java functions with Return values.
public class ReturnValue{
    public static void main(String[] args) {
        ReturnValue obj=new ReturnValue();
        int x=30;
        int y=20;
        int get_result=obj.add(x,y);
        System.out.println(get_result);
    }
    public int add(int num1,int num2){
        int result=num1+num2;
        return result;
    }
}