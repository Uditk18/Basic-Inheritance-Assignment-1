//Program to define base class and derive sub class
//having parameterized constructor of type
//default, one parameter, two parameter

class Base1 {
	int i;

	Base1(int i) {
		this.i = i;
		System.out.println("Value of i is : " + i);
	}
}

class Sub1 extends Base1 {
	int i, j;

	Sub1() {
		super(15);

		System.out.println("Default Constructor");
	}

	Sub1(int i) {
		super(15);
		this.i = i;
		System.out.println("One Parameter & value = " + i);
	}

	Sub1(int i, int j) {
		super(15);
		this.i = i;
		this.j = j;
		System.out.println("Two Parameter & value = " + i + " & " + j);

	}
}

public class Question6 {
	public static void main(String[] args) {
		Sub1 sub = new Sub1();
		Sub1 sub1 = new Sub1(10);
		Sub1 sub2 = new Sub1(10, 11);

	}
}