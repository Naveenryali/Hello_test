package java_01_number_programs;

public class Patterns_program {

	public static void main(String[] args) {
		//square pattern program
		
	/*	int n = 5;
		
		
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
			System.out.print("* ");
			}
		
		System.out.println();
		}
		*/
		
		//increasing triangle program
		/*
		int n =5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		//decreasing triangle program
		/*
		
		int n = 5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
		*/
		
		//Right triangle
		
		
		int n = 5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
			System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++ )
				System.out.print("* ");
			
			System.out.println();
		}
		
		
		
	}
}
