public class prime {
    public static void main(String[]args){
        int num=20;
        boolean flag=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
              flag=false;
              break;
            }

        }
        if(flag){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime");
        }
        
    }
}
