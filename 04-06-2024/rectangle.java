public class rectangle{
    int length,breadth,area;
    rectangle(){
        System.out.println("calculating the area of rectangle");
    }
    void calarea(int length,int breadth){
        area=length*breadth;
        System.out.println("the area of rectangle is"+area);
    }
    public class constructor{
        public static void main(String[] args) {
            rectangle r=new rectangle();
            r.calarea(5, 3);

        }

    }
}