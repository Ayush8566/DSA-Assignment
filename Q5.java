
public class Q5 {

	public static void main(String[] args) {
		System.out.println("Principal\tTime\trate\tTotal_amt");
		Deposit d1 = new Deposit();
		d1.display();
		Deposit d2 = new Deposit(1000, 2, 5.0);
		d2.calc_amt();
		d2.display();
		Deposit d3 = new Deposit(7850, 3);
		d3.calc_amt();
		d3.display();
		Deposit d4 = new Deposit(48010, 5.2);
		d4.calc_amt();
		d4.display();

	}

}

class Deposit {
	long Principal;
	int Time;
	double rate, Total_amt;

	Deposit() {

	}

	Deposit(long p, int t, double r) {
		this.Principal = p;
		this.Time = t;
		this.rate = r;
	}

	Deposit(long p, int t) {
		this.Principal = p;
		this.Time = t;
	}

	Deposit(long p, double r) {
		this.Principal = p;
		this.rate = r;
	}

	void display() {
		System.out.println(Principal + "\t\t" + Time + "\t" + rate + "\t" + Total_amt);
	}

	void calc_amt() {

		Total_amt = Principal + ((Principal * rate * Time) / 100);
	}
}