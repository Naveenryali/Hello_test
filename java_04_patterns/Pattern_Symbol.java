package java_04_patterns;

public class Pattern_Symbol {

	public static void main(String[] args) {
		
		int n=9;
		int mid=(n/2)+1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n/2+1 || j==n/2+1||(i==1&&j>mid)||(i==n&&j<mid)||(j==1&&i<mid)||(j==n&&i>mid))
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
		
	}
}
