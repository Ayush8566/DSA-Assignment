import java.util.*;

class Node {
	int info;
	Node next;
	public Node(int info) {
		this.info = info;
		next = null;
	}
	
}

public class QueueDemo2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Node front=null, rear=null;
		
		while(true)
		{
			System.out.println("***MENU***");
			System.out.println("0 : Exit");
			System.out.println("1 : Insert");
			System.out.println("2 : Delete");
			System.out.println("3 : Display");
			System.out.println("Enter your Choice ");
			int sw=sc.nextInt();
			switch(sw)
			{
				case 0:
					System.out.println("Exitting Program ");
					System.exit(0);
					break;
				case 1:
					rear=insert(rear, front);
					if(front == null)
						front = rear;
					break;
				case 2:
					front=delete(rear, front);
					if(front == null)
						rear = front;
					break;
				case 3:
					display(rear, front);
					break;
				default:
					System.out.println("Wrong Option Please Try Again");
			}
		}
	}
	public static Node insert(Node rear, Node front)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value to insert in Queue : ");
		Node n = new Node(sc.nextInt());
		if(rear==null)
			rear = n;
		else
		{
			rear.next=n;
			rear=n;
		}
		return rear;
	}
	public static Node delete(Node rear, Node front)
	{
		if(front==null)
		{
			System.out.println("Error : Queue UnderFlow");
		}
		else
		{
			System.out.println("The deleted element : " + front.info);
			front=front.next;
		}
		return front;
	}
	public static void display(Node rear, Node front)
	{
		Node n = front;
		if(n==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Elements of Queue are : ");
			while(n!=null)
			{
				System.out.println(n.info);
				n=n.next;
			}
		}
	}

}