import java.util.Scanner;

class MarksOutOfBoundException extends Exception{
    	MarksOutOfBoundException(String s){
    		super(s);
    	}
    }
 class Student{
	 String name;
	 int marks;
	  Student(){
		  Scanner sc= new Scanner (System.in);
		  System.out.println("Enter your name");
		  name= sc.nextLine();
		  System.out.println("Enter your marks-");
		  marks= sc.nextInt();
	  }
	 void display() {
		 System.out.println(name+" "+ marks);
	 }
 }



public class Q3 {

	public static void main(String[] args) {
		Student s1= new Student(); 
		 try {
			 if( s1.marks>100)
				 throw new  MarksOutOfBoundException( " Marks can't be greater than 100");
				 else
					 System.out.println(s1.marks);
			 
		 }
		 catch( Exception e) {
			 System.out.println(e);
		 }
		  finally {
			  System.out.println(s1.marks);
		  }
}
	}