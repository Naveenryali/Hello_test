package java_04_patterns;

public class Pattern13 {

	
	public static void main(String[] args) {
		
		
		int n=5;
		int q=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1,p=5,c='A';j<=i;j++,p--,q++,c++)
			{
				System.out.print((char)c+" ");
				System.out.print(p+" ");
				System.out.print(q+" ");
			}
			System.out.println();
		}
		
	}
}
