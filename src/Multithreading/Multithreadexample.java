package Multithreading;
class MyThread extends Thread{
    public void run(){
        for(int i =1; i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"is running");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){

            }
        }
    }
}
public class Multithreadexample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
