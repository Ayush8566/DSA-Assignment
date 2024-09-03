package SingleLinkedList;

import java.util.Scanner;

public class S_LinkedList_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		S_LinkedList sl=new S_LinkedList();
		sl.create();
		while(true)
		{
			System.out.println("***********Menu**********");
			System.out.println("0: Exit");
			System.out.println("1: Display");
			System.out.println("2: Count nodes");
			System.out.println("3: Count primes");
			System.out.println("4: Find max");
			System.out.println("5: Search");
			System.out.println("6: insBeg");
			System.out.println("7: insEnd");
			System.out.println("8: insAft");
			System.out.println("9: insAny");
			System.out.println("************************");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 0: return;
				case 1: sl.display();
						break;
				case 2: int c=sl.count();
						System.out.println("Number of nodes = "+c);
						break;
				case 3: int c1=sl.countPrimes();
						System.out.println("Number of primes = "+c1);
						break;
				case 4: int m=sl.findMax();
						System.out.println("Largest element is = "+m);
						break;
				case 5: System.out.println("Enter ele to search");
						int ele=sc.nextInt();
						Node x=sl.search(ele);
						if(x==null)
							System.out.println("Not found");
						else
							System.out.println("Found at reference "+x);
						break;
				case 6: sl.insBeg();
						break;
				case 7: sl.insEnd();
						break;
				case 8: sl.insAft();
						break;
				case 9: sl.insAny();
						break;
					
			}
		}
	}
}

