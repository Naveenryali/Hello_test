package taskprograms;

import java.util.Scanner;

public class Mtonperfectnumbers {

	public static void main(String[] args) {
		
		
			System.out.println("Enter m value");
			Scanner sc=new Scanner(System.in);
			int m=sc.nextInt();
			System.out.println("Enter n value");
			int n=sc.nextInt();
			int sum=0;
			for(int i=m;i<=n;i++)
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


	


