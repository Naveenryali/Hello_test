package practice_programs;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		//the number which is divisible by 2 is known as even number else odd number
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the range");
		int n=sc.nextInt();
		
		int sum =0;
		int sum1=0;
		
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is a even number");
				sum=sum+i;
			}
			else {
				System.out.println(i+" is a odd number");
				sum1=sum1+i;
			}
		}
		System.out.println("Sum of even numbers = "+sum);
		System.out.println("Sum of odd numbers = "+sum1);
		
		for(int i=1;i<=n;i+=2)
		{
			
			System.out.println(i+" is a odd number");
		}
		for(int i=0;i<=n;i+=2)
		{
			
			System.out.println(i+" is even number");
		}
		System.out.println("Enter n1 value");
		int n1=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println(i+" even");
			}
			else
			{
				System.out.println(i+" odd");
			}
			i++;
		}
		
		do{
			if(i%2==0)
			{
				System.out.println(i+" even number");
			}
			else
			{
				System.out.println(i+ " odd number");
			}
			i++;
		}
		while(i<=n1);
			
		sc.close();
		
	}
}
