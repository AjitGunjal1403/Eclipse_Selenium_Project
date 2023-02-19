package project;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		
		//System.out.print(a + " " + b);
		System.out.println(a);
		System.out.println(b);
		for(int d = 2; d <= 7; d++)
		{
			c = a+b;
			//System.out.print(" " + c);
			System.out.println(c);
		   a = b;
		   b = c;
		   // 0,1,1,2,3,5,8,13
		}
	}

}
