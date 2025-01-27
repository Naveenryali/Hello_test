package java_programs;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		for (int i=1;i<n;i++)
		{
			if (n%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		if (sum==n)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
sc.close();


     for(int i = 1; i<=50; i++)
{
	if(i%5==0 || i%3==0)		
	{
	System.out.println(i);
	
	}
}

}
	}


