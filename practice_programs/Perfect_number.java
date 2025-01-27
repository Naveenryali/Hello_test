package practice_programs;

import java.util.Scanner;

public class Perfect_number {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if (n%i==0)
		{
			sum=sum+i;
			System.out.println(i);
			
		}
		
	}
	if(sum==n)
	{
		System.out.println(n+" "+"Perfect number");
	}
	else
	{
		System.out.println("not a perfect number");
	}
	System.out.println();
	System.out.println("Printing perfect numbers from 0 to "+n);
	int temp =0;
	int sum2 =0;
	for(int i=1;i<=n;i++)
	{
		int sum1=0;
		
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
			{
				sum1=sum1+j;
				temp++;
			}
		}
		if(sum1==i)
		{
			temp++;
			System.out.println(i);
			
		}
		if(temp<=10&&sum1==i)
		{
			sum2=sum2+i;
		}
		
		
	}
	System.out.println();
	System.out.println(sum2);
	sc.close();
	
}
}
