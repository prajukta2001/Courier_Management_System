package final_project_2;

import java.util.Scanner;

public class PaymentMethod extends ImBilRep{
	Scanner input = new Scanner(System.in);
	int payment;
	double installment;
	
	final void PM() {
		System.out.println("\n-------------------------------------------");
		System.out.println("Dear customer, How do you like to pay your bills?\n   -------Please select your payment way : ");
		System.out.println("\n1. Paypal");
		System.out.println("2. Visa Card");
		System.out.println("3. Credit Card");
		
		System.out.println("\n\n****Please enter your choice: (1/2/3)****");
		int n = input.nextInt();
		if(n==1) {
			System.out.println("\n\nYou have selected PayPal.");
		}
		if(n==2) {
			System.out.println("\n\nYou have selected Visa Card.");
		}
		if(n==3) {
			System.out.println("\n\nYou have selected Credit Card.");
		}
		
		
		System.out.println("\n\nPlease enter your amount : ");
		int payment = input.nextInt();
		if (payment == super.T()) {
			System.out.println("\n**********Full Payment Completed!!!**********");
		}
		else {
			installment = super.T() - payment;
			System.out.println("\n\nYou have paid " + payment + "TK" + " Your remaining payment " + installment + "TK");
		}
	
	}
	}
