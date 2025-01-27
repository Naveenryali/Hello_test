package taskprograms;

import java.util.Scanner;

public class Smallestnumber {

	public static void main(String[] args) {
		
		System.out.println("Enter n1 value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter n2 value");
		int b=sc.nextInt();
		System.out.println("Enter n3 value");
		int c=sc.nextInt();
		int smallest =c<(a<b?a:b)?c:(a<b?a:b);
		System.out.println(smallest + " "+"is smallest number");
		sc.close();
	}

}
