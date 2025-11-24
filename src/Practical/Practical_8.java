package Practical;
import java.io.*;

class FileEmptyException extends Exception {
    FileEmptyException(String msg){ super(msg); }
}

public class Practical_8 {
    public static void main(String[] args) {
        try {
            File f = new File("a.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));

            String data = br.readLine();
            if(data == null) throw new FileEmptyException("File is empty!");

            System.out.println("Data: " + data);
            br.close();
        }
        catch(FileEmptyException e){ System.out.println(e.getMessage()); }
        catch(Exception e){ System.out.println("Error: " + e +"  error catched"); }
    }
}
