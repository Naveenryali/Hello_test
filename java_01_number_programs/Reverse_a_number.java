package java_01_number_programs;

import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
		//reverse a number
		System.out.println("Enter a number to reverse");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		int rev =0;
		
		
		while(n!=0)
		{
			
			rev=rev*10+n%10;
			n=n/10;
			
			
		}
		System.out.println(rev);
		sc.close();
		
	}

}
