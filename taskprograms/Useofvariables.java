package taskprograms;

import java.util.Scanner;

public class Useofvariables {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Enter n1 value");
		
		int n1=sc.nextInt();
		sc.close();
		sum=n+n1;
		System.out.println(sum);
	}

}
