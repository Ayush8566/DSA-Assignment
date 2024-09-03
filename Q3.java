import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) {
		s[i] = new Student();
			System.out.println("enter student  " + (i + 1) + " details ");
			s[i].getdata();
			s[i].showdata();
		}
		float max = s[0].DSA_Mark;
		int maxindex = 0;
		for (int i = 1; i < s.length; i++) {
			if (s[i].DSA_Mark > max) {
				max = s[i].DSA_Mark;
				maxindex = i;
			}
		}
		System.out.println("Highest mark student details ");
		s[maxindex].showdata();

	}

}

class Student {
	int roll;
	String name;
	float DSA_Mark;

	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the roll,name and dsa mark");
		roll = sc.nextInt();
		sc.nextLine();
		name = sc.nextLine();
		DSA_Mark = sc.nextFloat();
	}

	void showdata() {
		System.out.println("name= " + name + " roll number=" + roll + " dsa mark=" + DSA_Mark);

	}

}