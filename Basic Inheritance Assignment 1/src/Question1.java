//Program to execute multi-level inheritance,instantiating the child class and observing constructor invocation.

class Apple {
	int i;

	public Apple(int i) {

		this.i = i;
		System.out.println(i);
	}

}

class Banana extends Apple {
	int j;

	public Banana(int j) {

		super(100); // now control goes to A
		this.j = j;
		System.out.println(j);
	}

}

class Cherry extends Banana {
	int k;

	public Cherry(int k) {
		super(200); // now control goes to B
		this.k = k;
		System.out.println(k);
	}

}

class Question1 {

	public static void main(String args[]) {

		Cherry cherry = new Cherry(300); // Creating object of Cherry and passing default value

	}

}