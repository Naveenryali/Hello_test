package java_programs;

import java.util.Scanner;

public class Paliindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sum =0;
		int temp=n;
		while(n!=0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		if(temp==sum) {
		System.out.println("it is a palindrome");

	}
	else
	{
		System.out.println("not a palindrome");
	}
sc.close();
}}
