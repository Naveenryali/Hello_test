package java_04_patterns;

public class Pattern_symbol1 {

	public static void main(String[] args) {
		
		int n=9;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==j&&i<5)||(i+j==n+1&&i<5)||j==5)
				{
				System.out.print("* ");
				}
				else if(i==1&&j==5)
					System.out.print("^ ");
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}
}
