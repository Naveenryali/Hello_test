package taskprograms;

import java.util.Scanner;

public class Bigdigitinanumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=n%10;
		while(n>0)
		{
			if(n%10>max)
			{
				max=n%10;
			}
			n=n/10;
			
		}
		System.out.println(max);
		sc.close();

	}

}
