package project;

import java.util.Scanner;

public class Scanners {
	public static void main(String[] args) {
		int a = 0,b = 0,c,sum = 1;
		System.out.println("enter any value");
		Scanner s = new Scanner(System.in);
		c = s.nextInt();
		System.out.println("Fibonacci series");
		for(int i = 0; i<= c ; i++) {
		a = b ;
		b = sum ;
		sum = a + b;
		System.out.println(+a);	
		}
	}

}
