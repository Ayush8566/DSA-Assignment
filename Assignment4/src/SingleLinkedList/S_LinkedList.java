package SingleLinkedList;

import java.util.Scanner;

public class S_LinkedList {
	Node start;
	Scanner sc = new Scanner(System.in);

	void create() {
		Node p = new Node();
		System.out.println("Input node value");
		p.info = sc.nextInt();
		p.link = null;
		start = p;
		System.out.println("Do you want more nodes (1/0)");
		int op = sc.nextInt();
		while (op == 1) {
			Node q = new Node();
			System.out.println("Input node value");
			q.info = sc.nextInt();
			q.link = null;
			p.link = q;
			p = q;
			System.out.println("Do you want more nodes (1/0)");
			op = sc.nextInt();
		}
	}

	void display() {
		System.out.println("The Linked List is: ");
		System.out.println("Start=" + start);
		Node p = start;
		while (p != null) {
			System.out.print(p.info + "--->");
			p = p.link;
		}
	}

	int count() {
		int c = 0;
		Node p = start;
		while (p != null) {
			c++;
			p = p.link;
		}
		return c;
	}

	int countPrimes() {
		int c = 0;
		Node p = start;
		while (p != null) {
			if (isPrime(p.info))
				c++;
			p = p.link;
		}
		return c;
	}

	boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	int findMax() {
		int max = start.info;
		Node p = start.link;
		while (p != null) {
			if (p.info > max)
				max = p.info;
			p = p.link;
		}
		return max;
	}

	Node search(int ele) {
		Node p = start;
		while (p != null) {
			if (p.info == ele)
				return p;
			p = p.link;
		}
		return null;
	}

	void insBeg() {
		Node p = new Node();
		System.out.println("Input new node value");
		p.info = sc.nextInt();
		p.link = null;

		p.link = start;
		start = p;
	}

	void insEnd() {
		Node p = new Node();
		System.out.println("Input new node value");
		p.info = sc.nextInt();
		p.link = null;

		if (start == null) {
			start = p;
			return;
		}

		Node q = start;
		while (q.link != null)
			q = q.link;

		q.link = p;
	}

	void insAft() {
		System.out.println("Enter node value after which you want to insert");
		int ele = sc.nextInt();

		Node q = search(ele);
		if (q == null) {
			System.out.println("Element not found");
			return;
		}

		Node p = new Node();
		System.out.println("Input new node value");
		p.info = sc.nextInt();
		p.link = null;

		p.link = q.link;
		q.link = p;
	}

	void insAny() {
		int N = count();
		System.out.println("Enter node number where you want to insert");
		int pos = sc.nextInt();
		if (pos >= 1 && pos <= N + 1) {
			if (pos == 1)
				insBeg();
			else if (pos == N + 1)
				insEnd();
			else {
				int c = 1;
				Node q = start;
				while (c < pos - 1) {
					q = q.link;
					c++;
				}
				Node p = new Node();
				System.out.println("Input new node value");
				p.info = sc.nextInt();
				p.link = null;

				p.link = q.link;
				q.link = p;
			}
		} else
			System.out.println("Invalid Node Number");
	}

}
