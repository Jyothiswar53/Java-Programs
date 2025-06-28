import java.util.*;

class Factorial {
    int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = n * fact(n - 1);
        return result;
    }
}

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number to find the Factorial");

        int a = s.nextInt();
        Factorial f = new Factorial();
        System.out.println("The Factorial of the Number is :" + f.fact(a));

        s.close();
    }
}


