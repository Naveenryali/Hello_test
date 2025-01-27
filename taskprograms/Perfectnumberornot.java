package taskprograms;

import java.util.Scanner;

public class Perfectnumberornot {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
			  sum=sum+i;
			
			System.out.println(i);
			}
		}
		if(n==sum)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
		sc.close();
	}

}
