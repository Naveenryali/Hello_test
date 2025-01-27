package test;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n=3;
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1,p='a';j<=i;j++,p++)
			{
				
				System.out.print((char)p);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i,k='x';j<=n;j++,k++)
			{
				
				System.out.print((char)k);
			}
			System.out.println();
		}
	}
}
