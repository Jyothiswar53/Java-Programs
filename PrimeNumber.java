import java.util.*;
public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        int Number;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number to find Wheather it is Prime or Not");
        Number =obj.nextInt();
        if(isPrime(Number))
        {
            System.out.println(Number+" is a Prime Number");
        }
        else
        {
            System.out.println(Number+" is not a Prime Number");
        }
        obj.close();
    }
    public static boolean isPrime(int Num)
    {
        for(int i=2;i<=Num;i++)
        {
            if(Num%2==0)
            {
                return false;
            }

        }  return true;
    }
    
}
