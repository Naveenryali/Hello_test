package java_04_patterns;

public class Pattern8 {
	public static void main(String[] args) {
	
	
	int n =4;
	for(int i=1;i<n;i++)
	{
		
		for(int j=1;j<i;j++)
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
		
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		
		for(int j=i;j<=n;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}