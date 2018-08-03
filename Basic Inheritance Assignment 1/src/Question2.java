//Program to create a vehicle class and define a method start() and derive a class FourWheeler and 
//override a start() method

class Vehicle {

	public void start() {

		System.out.println("Starting...");
	}

}

class FourWheeler extends Vehicle {

	public void start() {
		super.start();
		System.out.println("4-wheeler Starting...");
	}

}

class Question2 {

	public static void main(String args[]) {

		FourWheeler four = new FourWheeler(); // Creating object of FourWheeler
		four.start();
	}

}