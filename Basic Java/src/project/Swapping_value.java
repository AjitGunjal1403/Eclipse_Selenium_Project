package project;

public class Swapping_value {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Swap value of a is " + a);
		System.out.println("Swap value of b is " + b);
	}

}
