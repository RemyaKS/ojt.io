//Write a java program to create
//and start two threads by implementing the runnable interface.Each thread should print the numbers from 1 to 5
class MyThread implements Runnable{
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
public class program2 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();
    }
}
