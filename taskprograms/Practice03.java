package taskprograms;

import java.util.Scanner;

public class Practice03 {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			int sum=0;
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
