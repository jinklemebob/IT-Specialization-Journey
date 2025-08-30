package package1;
import java.util.Scanner;
public class RunAmountDue {
public static void main(String[] args) {
	while (true) {
	Scanner scanner = new Scanner (System.in);
	AmountDue ad = new AmountDue();
	String menu = "\n --- OPTIONS --- \n"
			+ "[1] Price\n"
			+ "[2] Price and Quantity \n"
			+ "[3] Price, Quantity, and Discount Amount\n"
			+ "Enter your choice:";
	System.out.println(menu);
			
	int x = scanner.nextInt();
	
	switch(x) {
	case 1:
		System.out.println("Enter price: ");
		ad.computeAmountDue(scanner.nextDouble());
		break;
	case 2:
		System.out.println("Enter price and quantity: ");
		ad.computeAmountDue(scanner.nextDouble(), scanner.nextInt());
		break;
	case 3:
		System.out.println("Enter price, quantity, and discount amount: ");
		ad.computeAmountDue(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble());
	}
}
}
}
