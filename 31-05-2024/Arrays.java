import java.util.ArrayList;
class Arrays{
    public static void main(String[] args){
       ArrayList<String> myarr = new ArrayList<String>();
       myarr.add("apple");
       myarr.add("banana");
       myarr.add("Cherry");
       myarr.set(2,"Lemon");
       myarr.remove("banana");
       myarr.get(0);
       myarr.size();
       System.out.println(myarr.size());
       System.out.println(myarr);

      
    }
}