 //access modifires -public private protected.
 //non access modifires - static final abstract.
 class sample{
    int x=5;
    int y=4;
   
     void show(){

       System.out.println("x="+x);
       System.out.println("y="+y);
     }
    
}
public  class accessm{
    public static void main(String[] args) {
        sample obj=new sample();
        obj.show();
    }
}