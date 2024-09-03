import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sales");
		double sales = sc.nextDouble();
		Commission c1 = new Commission(sales);
		if (c1.getCommission() > 0) {
			System.out.println("the commission is Rs " + c1.getCommission());
		}
	}

}

class Commission {
	double sales;

	Commission(double sales) {
		this.sales = sales;

	}

      double getCommission() {
		if (sales < 0) {
			System.out.println("Invalid input ");
			return 0;
		} else if (sales < 100 ) 
			return 0.02 * sales;
		else if (sales < 500) 
			return 0.03 * sales;
		else if (sales < 5000) 
			return 0.05 * sales;
		else
			return 0.08 * sales;
		

	}
}
