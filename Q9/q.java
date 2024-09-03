package Q9;

import java.util.Scanner;

public class q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam s1[]= new Exam[2];
		for( int i=0;i<s1.length;i++) {
			s1[i]=  new Exam();
		System.out.println("Enter the details of student "+(i+1)+":");
		s1[i].input_student();
		s1[i].input_Marks();
		
		
		}
		
		System.out.println("Roll"+"\t"+"Name"+"\t"+"course"+"\t"+" mark1"+"\t"+"mark2"+"\t"+"mark3");
		for( int i=0;i<s1.length;i++) {

			s1[i].display_student();
			s1[i].display_Mark();
	}
}
}
class student{
	  int roll_number;
	  String name,course;
	   void input_student() {
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter roll number,name,course of students");
		   roll_number= sc.nextInt();
		   name= sc.next();
		  course= sc.next();
	   } 
	   void display_student() {
		   System.out.print(roll_number+"\t"+name+"\t"+course+"\t"); 
	   }

}
 class Exam extends student{
	 double mark1,mark2,mark3;
	 
	  void input_Marks() {
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter marks mark1,mark2,mark3");
		   mark1= sc.nextDouble();
		   mark2= sc.nextDouble();
		   mark3= sc.nextDouble();
		   
	  }
	  void display_Mark() {
		System.out.println(mark1+"\t"+mark2+"\t"+mark3);
		  
	  }
 }