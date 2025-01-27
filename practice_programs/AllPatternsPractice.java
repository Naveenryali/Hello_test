package practice_programs;

import java.util.Scanner;

public class AllPatternsPractice {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number rows");
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=n; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=n; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i; j<=n; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i; j<=n; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+" ");
			}
		
			for(int j=i;j<=n;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+" ");
			}
		
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+" ");
			}
		
			for(int j=i;j<n;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+" ");
			}
		
			for(int j=i;j<n;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i; j<=n; j++)
			{
				System.out.print(" "+" ");
			}
		
			for(int j=i;j>1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i; j<=n; j++)
			{
				System.out.print(" "+" ");
			}
		
			for(int j=1;j<i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			int p=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(p--+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}

			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}

			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}

			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print(j+"");
				}
				else
				{
					System.out.print("*");
				}
			}
				for(int j=2;j<=i;j++)
				{
					System.out.print("*");
				}
			
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==i)
				{
					System.out.print(j);
				}
				else
				{
				System.out.print(j+"*");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			int p='A';
			
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)p+++" ");
				
			}
			System.out.println();
		}
		sc.close();
	}
}
