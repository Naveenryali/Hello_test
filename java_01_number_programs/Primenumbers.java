	package java_01_number_programs;
	
	import java.util.Scanner;
	
	public class Primenumbers {
		
	public static void main(String[] args)
	
	{
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
		int	count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
			if((count==2)&&(i<=100))
			{
				System.out.println("The Prime numbers are :"+i);
				sum=sum+i;
			}
		
		}
		System.out.println(sum);
		
		
		
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		sc.close();
		int count=0;
		
		for(int i =1;i<=num;i++) 
		{
			
		
		
		 if(num%i==0)
		{
			count++;
			
		}
		}
		if (count==2)
		{
			System.out.println(num+" "+"is a prime");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
		
		
		
		
		}
		
	}
