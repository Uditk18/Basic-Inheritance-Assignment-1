
//Program in which Top1 is deriving Bottom1,Bottom2 and Bottom3
import java.util.*;

class Top1 {

	public void disp1() {

		System.out.println("This is Top1...");
	}
}

class Bottom1 extends Top1 {

	public void disp1() {

		System.out.println("This is Bottom1...");
	}
}

class Bottom2 extends Top1 {

	public void disp1() {

		System.out.println("This is Bottom2...");
	}
}

class Bottom3 extends Top1 {

	public void disp1() {

		System.out.println("This is Bottom3...");
	}
}

public class Question4 {
	public static void main(String[] args) {
		Bottom1 b1 = new Bottom1();
		Bottom2 b2 = new Bottom2();
		Bottom3 b3 = new Bottom3();
		b1.disp1();
		b2.disp1();
		b3.disp1();

	}
}