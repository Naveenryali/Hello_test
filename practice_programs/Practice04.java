package practice_programs;

import java.util.Scanner;

public class Practice04 {
	
	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Enter n value");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2) {
		System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" Not a prime number");
		}
		
		System.out.println("Enter m value");
		int m=sc.nextInt();
		
		int sum=0;
		for(int i=n;i<=m;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		
		
		sc.close();
		
		
	
	}
	
}

