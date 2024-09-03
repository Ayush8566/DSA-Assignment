package Q10;

import java.util.Scanner;

public class Test extends Student {

	public int mark1;
	 public int mark2;
	 public void input() {
		 super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mark1,mark2");
		mark1= sc.nextInt();
		 mark2= sc.nextInt();
	}
	public void output() {
		super.output();
		System.out.println(mark1+"\t"+mark2);
	}
}
