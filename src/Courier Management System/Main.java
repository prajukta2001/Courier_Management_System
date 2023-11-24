package final_project_2;

public class Main {
	public static void main (String [] args) {
		
		System.out.println("                   -----------------------------------------                     ");
    	System.out.println("*******************WELCOME TO DHL WORLD WIDE COURIER SERVICE*******************");
    	System.out.println("                   -----------------------------------------                     ");
    	System.out.println("DHL is the global leader in the logistic industries. Specially in international shipping, courier service and transport\n\n");
    	
    	
		RegOfCus a = new RegOfCus();
		OrderAndDispatch m = new OrderAndDispatch();
		CourierDetails b = new CourierDetails();
		PaymentMethod d = new PaymentMethod();
		
		BillReport c ;
	    c = new ImBilRep();
	    		
		a.SignUp();
		b.details1();
		c.sendBill();
		m.details2();
		a.showCusDetails();
		d.PM();
		
		DeliveryExecutive p = new DeliveryExecutive();
		p.FB();
	    p = new Feedback();
		p.FB();
		
	}

}
