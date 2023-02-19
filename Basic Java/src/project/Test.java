package project;

public class Test {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c ;
		
		System.out.print(a + " " + b);
		
		for(int d = 2; d <= 12; d++) {
			c = a+b;
			System.out.print(" " +c);
			
			a = b;
			b = c;
			
		}
	}

}
