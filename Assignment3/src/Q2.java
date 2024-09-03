import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 color: ");
		String[] s = new String[4];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		try {
			Integer.parseInt(s[0]);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println("Enter 1 more color: ");
			s[5] = sc.next();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i] + " ");
			}
		}
	}

}