package taskprograms;

import java.util.Scanner;


public class Sumofdigitsusing_Recurssion {
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int result = sumofdigits(n);
		System.out.println(result);
		
	}
	public static int sumofdigits(int n) {
		if (n==0) {
			return 0;
		}
		else {
			return n%10 +sumofdigits(n/10);
		}
	}



	

}
