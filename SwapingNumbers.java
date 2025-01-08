import java.util.*;

public class SwapingNumbers {
    public static void main(String[] args) {
        int Num1, Num2;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter Num1: ");
        Num1 = obj.nextInt();
        
        System.out.print("Enter Num2: ");
        Num2 = obj.nextInt();
        
        System.out.println("Before Swapping: Num1 = " + Num1 + ", Num2 = " + Num2);
        
        Num1 = Num1 + Num2;
        Num2 = Num1 - Num2;
        Num1 = Num1 - Num2;
        
        System.out.println("After Swapping: Num1 = " + Num1 + ", Num2 = " + Num2);
    }
}