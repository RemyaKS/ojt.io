public class palindrom {
    public static void main(String[] args) {
        String word="apple";
        String rev=new StringBuffer(word).reverse().toString();
        if(word.equals(rev)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("Not a palindrom");
        }
    
        
    }
}
