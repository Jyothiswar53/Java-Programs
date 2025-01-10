import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest = num1;

        int caseSelector = (num2 > largest ? 2 : 0) + (num3 > largest ? 4 : 0);

        switch (caseSelector) {
            case 2:
                largest = num2; 
                break;
            case 4:
                largest = num3; 
                break;
            case 6:
                largest = (num3 > num2) ? num3 : num2;
                break;
            default:
        }

        System.out.println("The largest number is: " + largest);
    }
}

