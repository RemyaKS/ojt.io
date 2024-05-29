public class breaks{
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
            System.out.println(i);
            if(i%5==0){
                break;
            }
            i++;
        }
        System.out.println("Over");
    }
    
}
