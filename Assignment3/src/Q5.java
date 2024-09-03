import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
		System.out.println("the reverse number is");
		reverseNumber(n);
	}
	public static void reverseNumber(int n) {
		if( n<10) {
			System.out.println(n);
		return;
		}
		else {
			System.out.print(n%10);
			reverseNumber(n/10);
		}
	}
}
