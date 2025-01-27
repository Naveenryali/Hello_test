package taskprograms;

import java.util.Scanner;

public class Evenoddnumbersadding {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum = 0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			if(rem%2==0)
			{
				System.out.println("Even number"+" "+rem);
			}
			else
			{
				System.out.println("Odd number"+" "+rem);
			}
			
			sc.close();
			
		}
		System.out.println(sum);

	}

}
