import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Phone p1=new Phone(); 
		Phone p2= new Phone();
		p1.area_code=212;
		p1.exchange=767;
		p1.number=8900;
		System.out.println("My number is ");
		p1.display();
		p2.input();
		System.out.println("Your number is ");
		p2.display();
	}

}
class Phone{
	int area_code,exchange,number;
	
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter areacode,exchange,number");
		area_code=sc.nextInt();
		exchange=sc.nextInt();
		number=sc.nextInt();
	}
	void display() {
		System.out.println("("+area_code+") "+exchange+"-"+number);
	}
}
