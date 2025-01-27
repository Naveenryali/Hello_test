package taskprograms;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		while(n!=0) {
			int r=n%10;
			n=n/10;
		
		System.out.print(r);
		}
	}

}
