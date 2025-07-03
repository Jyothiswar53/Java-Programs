import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        int[] count = new int[256]; 

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }

        System.out.println("Duplicate Characters:");
        boolean hasDuplicates = false;
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + ": " + count[i]);
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }
    }
}