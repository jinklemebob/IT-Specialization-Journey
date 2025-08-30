package package1;

class AmountDue {
public double computeAmountDue (double price) {
	double sum = price * 0.12;
	double taxed = price + sum;
	System.out.println("Your total amount: " + taxed);
	return taxed;
	
}
public double computeAmountDue (double price, int quantity) {
	double mult = price * quantity;
	double taxmult = price * 0.12;
	double finaltax = taxmult + mult;
	System.out.println("Your total amount: " + finaltax);
	return finaltax;
	
	

	}

public double computeAmountDue (double price, int quantity, double discount) {
	double multfinal = price * quantity;
	double disc = multfinal - discount;
	double taxedisc = price * 0.12;
	double totdue = taxedisc + disc;
	System.out.println("Your total amount: " + totdue);
	return totdue;
}
}
