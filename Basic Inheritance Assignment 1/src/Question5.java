
//Program to implement abstract class shape, deriving Triangle
//, Polygon and circle and executing their draw() function
import java.util.*;

abstract class Shape {

	public void draw() {

		System.out.println("Drawing Shape...");
	}
}

class Triangle extends Shape {

	public void draw() {

		System.out.println("Drawing Triangle...");
	}
}

class Polygon extends Shape {

	public void draw() {

		System.out.println("Drawing Polygon...");
	}
}

class Circle extends Shape {

	public void draw() {

		System.out.println("Drawing Circle...");
	}
}

public class Question5 {
	public static void main(String[] args) {
		Shape[] sh = new Shape[3];

		Triangle b1 = new Triangle();
		Polygon b2 = new Polygon();
		Circle b3 = new Circle();
		b1.draw();
		b2.draw();
		b3.draw();

	}
}