package StringExceptionHandling;

public class StringManupulationExample {
    public static void main(String[] args) {
        String str = "gunjan ghangare";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println("original string : "+ str);
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.substring(0, 8));
        System.out.println(str.replace("gunjan", "Dhanshree"));
    }
}