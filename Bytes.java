import java.util.Scanner;

public class Bytes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a String :");
        String name = s.nextLine();

        int ByteValue = 122;

        System.out.println("String Entered :" + name);
        
        System.out.println("Byte MIN_VALUE :" + Byte.MIN_VALUE);
        System.out.println("Byte MAX_VALUE :" + Byte.MAX_VALUE);
    }
}