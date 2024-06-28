class A extends Thread { 
    public void run(){
        for(int i=0;i<5;i++){
            try{
                System.out.println("NSTI");
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread a was interrupted");
            }
}
}
}
class B{
    public static void main(String[] args) {
        A a=new A();
        a.start();
        for(int i=0;i<5;i++){
            System.out.println("Trivandrum");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread b was interrupted");
                
            }
            
    }
}
}