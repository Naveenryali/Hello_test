package java_programs;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int r;
		while(n!=0)
		{
			r=n%10;
		n=n/10;
		
		System.out.print(r);
		}
		sc.close();
		
	}

}
