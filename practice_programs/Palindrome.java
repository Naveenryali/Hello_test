package practice_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int rev=0;
		int m=n;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		if(m==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}
}
