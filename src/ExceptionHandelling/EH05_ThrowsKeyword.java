package ExceptionHandelling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EH05_ThrowsKeyword {
    static void openFile(String path) throws IOException {
        try (FileInputStream fis = new FileInputStream(path)) {
            System.out.println("Opened: " + fis);
        }
    }

    public static void main(String[] args) {
        System.out.println("[ExceptionHandelling] EH05_ThrowsKeyword: start");
        try {
            openFile("/no/such/file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught: " + e);
        } catch (IOException e) {
            System.out.println("Caught on close(): " + e);
        }
        System.out.println("[ExceptionHandelling] EH05_ThrowsKeyword: end");
    }
}
