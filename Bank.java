public class Bank {
    static int currentBalance=1000;
    public static void greetCustomer()
    {
        System.out.println("Hello Welcome to the Banking Application");
    }
    public void deposit(int amount)
    {
        currentBalance= currentBalance + amount;
        System.out.println("Amount deposited successfully");
    }
    public static void withdrawl(int amount) 
    {
        currentBalance= currentBalance - amount;
        System.err.println("Amount withdrawn succesfully");
    }
    public int getCurrentBlance()
    {
        return currentBalance;
    }
    public static void main(String[] args) 
    {
        Bank bank= new Bank();
        greetCustomer();
        System.out.println("The current balance is "+bank.getCurrentBlance());
        bank.deposit(1000);
        System.out.println("The current balance is "+bank.getCurrentBlance());
        withdrawl(500);
        System.out.println("The current balance is "+bank.getCurrentBlance());
    }
}
