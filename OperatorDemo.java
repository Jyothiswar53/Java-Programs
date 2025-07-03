public class OperatorDemo {
    public static void main(String[] args) {
    int a = 10;
    int b = 5;
    // Arithmetic operators
    System.out.println("a + b =" + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b =" + (a * b));
    System.out.println("a / b =" + (a / b));
    System.out.println("a % b =" + (a % b));

    // Comparison operators
    System.out.println("a == b =" + (a == b));
    System.out.println("a != b =    " + (a != b));
    System.out.println("a > b =    " + (a > b));
    System.out.println("a < b =    " + (a < b));
    
    // Logical operators
    System.out.println("a > b && a == 10 =" + (a > b && a == 10));
    System.out.println("a > b || a == 5 =    " + (a > b || a == 5));
    System.out.println("! (a > b) =    " + ! (a > b));
    
    // Assignment operators
    a += b;
    System.out.println("a += b "+a);
    a -= b;
    System.out.println("a -= b ="+a);
   
    // Bitwise operators
    System.out.println("a & b =" + (a & b));
    System.out.println("a | b =    " + (a | b));
    System.out.println("a ^ b =    " + (a ^ b));
    
    // Increment/Decrement operators
    a++;
    System.out.println("a++ =" + a);
    
    a--;
    System.out.println("a-- =" + a);
    
    }
}
