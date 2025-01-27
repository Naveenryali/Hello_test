	package taskprograms;

import java.util.Scanner;

public class Nperfectnumbers {
public static void main(String[] args) {
	System.out.println("Enter n value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum;
	for(int i=1;i<=n;i++)
	{
		sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
			}
		}	
		
		if(sum==i)
		{
			System.out.println(i);
		}
	}
	sc.close();
	
}
}
