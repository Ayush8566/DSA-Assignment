import java.util.*;
import Q10.*;

public class Score {

	public static void main(String[] args) {
		Test t= new Test();
		t.input();
		t.output();
		double grandtotal=t.mark1+ t.mark2+Sports.score1+Sports.score2;
		System.out.println("grandtotal="+grandtotal);
	}

}
