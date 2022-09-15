import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        int Multi = Multiplication();
        System.out.println("The Answer is: " + Multi);

         // Method call
         int Divide = Division();
        System.out.println("The Answer is: " + Divide);

        // Method call
      String crushName = revealMyCrush();
      System.out.println(crushName);
        // Method call
        myOrder();

       
    }

      static int Multiplication() {
        System.out.println("Please enter two numbers to Multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;
    }
    static int Division() {
        System.out.println("Please enter two numbers to Divide");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;
    }

    static String revealMyCrush() {
    
        System.out.println("This will reveal the name of your crush");


        String myName = scan.nextLine();

        System.out.print("Enter the name of your first crush: ");
        String nameOfMyCrush = scan.nextLine();

        System.out.print("Enter the name of your second crush: ");
        String nameOfMy2Crush = scan.nextLine();


        return myName + "Your'e first crush = " + nameOfMyCrush + "\nYour'e second crush = " + nameOfMy2Crush;

    }
      static void myOrder() {
        System.out.println("Enter your first order");
        String firstOrder = scan.next();
        System.out.println("Enter the price of first order");
        Double priceOf1stOrder = scan.nextDouble();

        System.out.println("Enter your second order");
        String secondOrder = scan.next();
        System.out.println("Enter the price of second order");
        Double priceOf2stOrder = scan.nextDouble();

        System.out.println("Enter your Third order");
        String ThirdOrder = scan.next();
        System.out.println("Enter the price of Third order");
        Double priceOf3stOrder = scan.nextDouble();

        System.out.println("Your order = " + firstOrder +" "+ secondOrder +" "+ ThirdOrder);

        Double totalAmount = priceOf1stOrder + priceOf2stOrder + priceOf3stOrder;

        System.out.println("Price all of the orders are: " + priceOf1stOrder + ", " + priceOf2stOrder + " " + priceOf3stOrder);
        System.out.println("The Total amount of your order: " + totalAmount);





      }

     }


        



