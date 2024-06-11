import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(1, "Apple");
        m1.put(2, "Banana");
        m1.put(3, "Cherry");
        System.out.println("Value at key 1:"+m1.get(2));
        for(Integer key:m1.keySet()){
            System.out.println("Key : "+key+",Value : "+m1.get(key));
        }
        
    }
}
