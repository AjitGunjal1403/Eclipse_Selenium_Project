package project;

public class Prime_no {
	public static void main(String[] args) {
		int a = 7;
		int b = 0;
		for(int j = 2; j < a - 1; j++) {
			if(a%j==0)
			{
				b = b +1;
			}
		}
		if(b==0)
		{
			System.out.println(a + " No is prime");
		}
		else
		{
			System.out.println(a + " No is not prime");
		}
	}

}
