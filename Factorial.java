import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int fact=1,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorail of the given number is "+fact);
    }
}
