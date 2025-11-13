package ExceptionHandelling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EH08_TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/no/such/file.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
