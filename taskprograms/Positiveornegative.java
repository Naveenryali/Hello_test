package taskprograms;

import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.println(n+" "+"It is a positive number");
		}
		else if(n<0) {
			System.out.println(n+" "+"It is a negative number");
		}
		else {
			System.out.println("enter number is 0");
		}
		sc.close();
		
	}

}
