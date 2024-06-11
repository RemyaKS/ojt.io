public class multitread {
    public static void main(String[] args) {
        Thread th1=new Thread(new MyRunnable("ADIT"));
        Thread th2=new Thread(new MyRunnable("NSTI"));
        th1.start();
        th2.start();
    }
    
}

class MyRunnable implements Runnable{
    private String threadname;
    
    public MyRunnable(String name){
        this.threadname=name;
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(threadname+"running "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

