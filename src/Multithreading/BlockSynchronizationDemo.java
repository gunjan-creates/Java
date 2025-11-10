package Multithreading;

class MultiplicationTable {

    void displayTable(int n) {
        System.out.println("Starting Table for " + n);

        // BLOCK SYNCHRONIZATION
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                }
            }
        }
    }
}

class TableThreadOne extends Thread {
    MultiplicationTable table;

    TableThreadOne(MultiplicationTable table) {
        this.table = table;
    }

    public void run() {
        table.displayTable(5);
    }
}

class TableThreadTwo extends Thread {
    MultiplicationTable table;

    TableThreadTwo(MultiplicationTable table) {
        this.table = table;
    }

    public void run() {
        table.displayTable(100);
    }
}

public class BlockSynchronizationDemo {
    public static void main(String[] args) {
        MultiplicationTable tableObj = new MultiplicationTable();

        new TableThreadOne(tableObj).start();
        new TableThreadTwo(tableObj).start();
    }
}