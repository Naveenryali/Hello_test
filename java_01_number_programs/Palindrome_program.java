package java_01_number_programs;

import java.util.Scanner;

public class Palindrome_program {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum =0;
		int temp;
		temp = n;
	
		while(n!=0)
		{
		
			sum =sum *10+n%10;
			n=n/10;
			
		}
		if (temp==sum)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		sc.close();
		
	}

}
