package java_04_patterns;

public class Hollow_square {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n||i==1||i==n)
				{
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n/2+1 || j==n/2+1)
				{
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j|| i+j==n+1)
				{
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==n||j==1||i==j)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(i==1||j==n||i==j)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				if(i==n||j==1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				for(int j=1;j<=i;j++)
				{
					if(i==n||j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
					
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
		
		
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				if(j==1)
				
				System.out.print("* ");
				
				else
				 
					System.out.print("  ");
				
			}
				for(int j=1;j<=i;j++)
				{
					if(j==i) 
					System.out.print("* ");
				
				else 
					System.out.print("  ");
				
					
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				if(j==i)
				
				System.out.print("* ");
				
				else
				
					System.out.print("  ");
				
			}
				for(int j=i;j<=n;j++)
				{
					if(j==n) 
					System.out.print("* ");
				
				else 
					System.out.print("  ");
				
					
			}
			System.out.println();
		}
		
	}
}
