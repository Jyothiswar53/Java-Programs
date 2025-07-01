import java.util.*;
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        int Rev=0,Num,a;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any Number :");
        Num=obj.nextInt();

        while(Num>0)
        {
            a=Num%10;
            Rev=Rev*10+a;
            Num=Num/10;
        }
        
        System.out.println("After Reversing the Number is : "+Rev);
    }
}
