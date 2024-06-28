class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("NSTI");
    }
}
}
class B {
    public static void main(String args[]){
        A a1 = new A();
        a1.start();
        for(int i=0;i<5;i++){
            System.out.println("Trivandrum NSTI");
        }
        }
    }
