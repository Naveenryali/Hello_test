package taskprograms;

import java.util.Scanner;

public class Primenumbersmton {

	public static void main(String[] args) {
		System.out.println("Enter m value ");
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int count =0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		sc.close();
		
	}

}
