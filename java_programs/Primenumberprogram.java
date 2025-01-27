package java_programs;

import java.util.Scanner;

public class Primenumberprogram {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int	count=0;
		for(int i=1;i<=n;i++)
		
		{
			if (n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("It is a prime number");
			}
		
			
		else {
				System.out.println("Not a prime number");
			}
		
		sc.close();
		
	}

}
