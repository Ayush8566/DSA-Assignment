import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter your lucky number: ");
try {
	int n=sc.nextInt();
	if(n<0) 
		throw new NumberFormatException("Negative number");
	else 
		System.out.println("Your lucky number is "+n);
	
}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
