package java_04_patterns;

public class Pattern12 {

	public static void main(String[] args) {
		
		
		int n=7;
		 
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
		
	}
}
