package project;

public class Primeno_from_array {
	public static void main(String[] args) {
		int a [] = {7,8,9,11,13,15};
		int b = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 2; j < a[i]-1; j++)
			{
				if(a[i]%2==0)
				{ 
					b=b+1;
				}
			}
			if(b==0)
			{
				System.out.println(a+ "no is prime");
			}
			else
			{
				System.out.println(a+ "no is not prime");
			}
		}
	}

}
