import java.util.*;
public class Fibonacci
{
    public static void main(String[] args) {
        int first=0,second=1,next,n;

        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter a number to print");
        n=obj.nextInt();

        System.out.println(first);
        System.out.println(second);

        for(int i=0;i<n;i++)
        {
            next=first+second;
            
            System.out.println(next);

            first=second;
            second=next;
            
        }
    }
}
