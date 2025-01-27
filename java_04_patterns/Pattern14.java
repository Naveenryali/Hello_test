package java_04_patterns;

public class Pattern14 {

	public static void main(String[] args) {
		
		int n=7;
		
		for(int i=1;i<=n;i++)
		{
			int p='A';
			
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)p+++" ");
				
			}
			System.out.println();
		}
	}
}
