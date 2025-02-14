import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        float a;
        System.out.println("enter the number");
        a=obj.nextFloat();
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        obj.close();
    }
}
