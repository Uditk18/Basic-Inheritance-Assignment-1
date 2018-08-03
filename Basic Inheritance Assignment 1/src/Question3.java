
//Program to execute Hierarchical Inheritance
import java.util.*;

class Vehicle1 {
	int v;

	Vehicle1(int v) {
		this.v = v;
		System.out.println("This is Vehicle class & v=" + v);
	}
}

class Honda extends Vehicle1 {
	int h;

	Honda(int h) {
		super(300);
		this.h = h;
		System.out.println("This is Honda class and h=" + h);
	}
}

class Maruti extends Vehicle1 {
	int m;

	Maruti(int m) {
		super(400);
		this.m = m;
		System.out.println("This is Maruti class & m=" + m);
	}
}

public class Question3 {
	public static void main(String[] args) {
		Vehicle1 maruti = new Maruti(20);
		Vehicle1 honda = new Honda(12);

	}
}