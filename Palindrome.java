import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int reversedNumber = 0;
        int temp = originalNumber;

        while (temp != 0) {
            int digit = temp % 10;            
            reversedNumber = reversedNumber * 10 + digit;  
            temp = temp / 10;                        
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();
    }
}