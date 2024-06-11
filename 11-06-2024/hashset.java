import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> s1=new HashSet<>();
        s1.add("IBM");
        s1.add("Microsoft");
        s1.add("Google");
        s1.add("Amazon");
        s1.add("IBM");

        Iterator<String> itr=s1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); 
        }
        
        }
        
    }

