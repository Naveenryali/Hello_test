package taskprograms;

import java.util.Scanner;

public class Largestofthreenumbers {
	public static void main(String[] args) {
	
		System.out.println("Enter n1 value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter n2 value");
		int b=sc.nextInt();
		System.out.println("Enter n3 value");
		int c=sc.nextInt();
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest + "is largest number");	
		sc.close();
		
	/*	int a=12,b=21,c=9;
		String result=(a<b&&a<c)?"a is smallest number":
			           (b<a&&b<c)?"b is smallest number":
			        	   "c is smallest number";
		System.out.println(result);
		*/
	}

}
