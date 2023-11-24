package final_project_2;

import java.util.Scanner;

public class OrderAndDispatch extends CourierDetails {
	Scanner input = new Scanner(System.in);
	
	void details2() {
		if(b<1000) {
			System.out.println("Your Product will be reach to the destination after 7 days");
		}
		else {
			System.out.println("Your Product will be reach to the destination after 3 days");
		}
	}
	
	

}
