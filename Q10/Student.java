package Q10;
 import java.util.Scanner;
public class Student {
 String name;
 int roll;
  public void input() {
	  Scanner sc= new Scanner (System.in);
	  System.out.println("Enter name or roll number");
	  name= sc.next();
	  roll= sc.nextInt();
  }
  public void  output() {
	  System.out.println(name+"\t"+roll+"\t");
  }
	
}

