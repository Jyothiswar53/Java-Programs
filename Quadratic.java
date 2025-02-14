import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = s.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = s.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = s.nextDouble();

        System.out.println("Quadratic Equation " + a + "X^2+" + b + "X+" + c + "=0");

        if (a == 0) {
            System.out.println("This is not Quadratic Equation ");
        }
        double D = b * b - 4 * a * c;
        System.out.println("Discriminant (D)=" + D);

        if (D > 0) {
            System.out.println("The Equation has 2 distinct roots ");
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        }
        
        else if (D == 0) {
            System.out.println("The Equation has one real root");
            double root = -b / (2 * a);
            System.out.println("Root = " + root);
        } 
        
        else {
            System.out.println("The Equation has two Complex roots");
            double realpart = -b / (2 * a);
            double imaginarypart = Math.sqrt(-D) / (2 * a);
            System.out.println("Root 1 = " + realpart + "+" + imaginarypart + "i");
            System.out.println("Root 2 = " + realpart + "+" + imaginarypart + "i");
        }
    }
}