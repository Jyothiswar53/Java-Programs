class CommandLineAddition {
    public static void main(String[] args) {

        if (args.length < 10) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[7]);

        int sum = num1 + num2 + num3;

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}