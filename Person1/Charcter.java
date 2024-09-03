package Person1;

public class Charcter {

	public static void main(String[] args) {
		Person p = new Person("ayushkumar");
		p.count();
		p.display();

	}

}

interface Detaillnfo {
	void display();

	int count();
}

class Person implements Detaillnfo {
	String name;
	static int maxcount;

	Person(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(" name : " + name);
		System.out.println(" the number of charcter in name: " + count());

	}

	public int count() {
		int c = 0;
		for (int i = 0; i < name.length(); i++)
			c++;
		return c;
	}
}
