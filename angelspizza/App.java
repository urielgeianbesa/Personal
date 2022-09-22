
// import the Scanner class
import java.util.Scanner;

public class App {

	// Scanner Object
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		orderPizza();
	}

	static void orderPizza() {

		System.out.println("Welcome to Angels Pizza!");

		System.out.println("Enter letter A if you want a Creamy Spinach Dip pizza!");
		System.out.println("Enter letter B if you want a Garlic Shrimp pizza!");

		System.out.print("Enter your choice: ");
		char choice = scan.next().charAt(0);

		// Initial value
		String pizza = "";

		switch (choice) {
			case 'A':
				pizza = "Creamy Spinach Dip Pizza";
				break;

			case 'B':
				pizza = "Garlic Shrimp Pizza";
				break;
			default:
				System.out.println("Please enter A or B!");
				return; // EXIT PROGRAM
		}
        System.out.println("Enter the size for " + pizza );
        System.out.println("Enter letter A if you want a Medium 9 size of pizza!");
		System.out.println("Enter letter B if you want a Family 12!");
        System.out.println("Enter letter C if you want a Big Family 14!");

		System.out.print("Enter your choice: ");
		char choiceofsize = scan.next().charAt(0);
        
        String Size = "";
        double price = 0;
       

        switch (choiceofsize) {
			case 'A':
				Size = "Medium 9"; 
                price = 370.00;               
				break;

			case 'B':
				Size = "Family 12";
                price = 515.00;
				break;
            case 'C':
				Size = "Big Family 14";
                price = 655.00;
				break;
			default:
				System.out.println("Please enter A , B or C!");
				return; // EXIT PROGRAM
        }


        System.out.println("Type of crust Toasted or not? (true or false)");
        System.out.print("Please enter true or false: ");
        boolean toasted = scan.nextBoolean();

        if (toasted == true) {
            System.out.println("You will get a Toasted pizza!");
         } else {
                System.out.println("You will get a not Toasted pizza");

                
        }
        System.out.println("Please enter the Quantity of the " + pizza);
        System.out.println("Please enter here: ");

        int quantity = scan.nextInt();

		System.out.println("Your order is: " + pizza);
		System.out.println("Your total order amount is: " + price * quantity);
  
        
    



		System.out.println("Enter COD if you want cash on delivery!");
		System.out.println("Enter CREDIT if you want to use credit card!");

		System.out.print("Enter your choice: ");
		String paymentMethod = scan.next();

		switch (paymentMethod) {
			case "COD":
				System.out.println("Please prepare exact amount upon delivery");
				break;
			case "CREDIT":
				System.out.print("Enter CREDIT card number:");
				int cardNumber = scan.nextInt();
				break;
			default:
				System.out.println("Please dont make fun of me!");
				return;
		}
       



		System.out.println("Do you have an angels pizza card? (true or false)");
		System.out.print("Please enter true or false: ");
		boolean hasAngelsPizzaCard = scan.nextBoolean();

		if (hasAngelsPizzaCard == true) {
			System.out.println("You get a free pizza!");
		} else {
			System.out.println("The free pizzal is for the members of PizzaCard only");
		}

		System.out.println("Choose delivery method!");
		System.out.println("Enter PICKUP");
		System.out.println("Enter DELIVER");
		System.out.print("Enter delivery method: ");
		String deliveryMethod = scan.next();

		switch (deliveryMethod) {
			case "PICKUP":
				System.out.println("Please wait on the counter");
				break;
			case "DELIVER":
				System.out.print("The pizza is now delivering");
				break;
			default:
				System.out.println("Is their anything you want");
				return;
		}

		scan.close();
	}
}


        