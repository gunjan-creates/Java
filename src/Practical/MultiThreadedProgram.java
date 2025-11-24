package Practical;
// Write a multithreaded program in Java. 
class MyThread extends Thread{
    public void start(){
        System.out.println("Thread Is Running !");
    }
}
public class MultiThreadedProgram {
    public static void main(String[]args){
        new MyThread().start();
    }
}
