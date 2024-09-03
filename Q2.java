import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex();
		System.out.println("Enter first complex number ");
		c1.setData();
		c1.display();
		Complex c2 = new Complex();
		System.out.println("Enter second  complex number ");
		c2.setData();
		c2.display();
		Complex c3 = new Complex();
		c3 = c3.add(c1, c2);
		c3.display();
	}
}

class Complex {
	int real, imag;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a real and imaginary part");
		real = sc.nextInt();
		imag = sc.nextInt();
	}

	void display() {
		System.out.println(real + "+i" + imag);
	}

	public Complex add(Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = c1.real + c2.real;
		c.imag = c1.imag + c2.imag;
		return c;

	}

}
