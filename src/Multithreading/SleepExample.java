package Multithreading;

public class SleepExample {
    public static void main(String[]args){
        for(int i = 0;i<=60 ;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
