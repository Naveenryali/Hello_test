package taskprograms;

import java.util.Scanner;

public class Lastandfirstdigit {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		int lastdigit=n%10;
		int firstdigit=0;
		while(n>0)
		{
			firstdigit=n;
			n=n/10;
		//	System.out.println(firstdigit);
		}
		System.out.println(firstdigit+lastdigit);

	}

}
