package practice_programs;

import java.util.Scanner;

public class Prime_number {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	int count=0;
	int sum =0;
	
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}

		if (count==2)
		{
			System.out.println(n+" "+"it is a prime number");
		}
		else {
			System.out.println("not a prime number");
		}
		System.err.println();
		
		for(int i=1;i<=n;i++)
		{
			
			int c =0;
		
			for(int j=1;j<=n;j++)
			{
				
			if (i%j==0)
			{
				c++;
			}
			}
			if( (c==2) && (i<=n))
			{
				System.out.println("Prime numbers upto "+n+" "+"="+i);
				sum=sum+i;
			}
		}
		
		System.out.println("sum of prime numbers upto "+n+" "+"="+" "+sum);
		
	
}
}
