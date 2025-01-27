package java_04_patterns;

public class Pattern9 {
public static void main(String[] args) {
	
//		  5 
//      5 4 
//    5 4 3 
//  5 4 3 2 
//5 4 3 2 1
	int n=5;
	for(int i=1;i<=n;i++)
	{
		
		for(int j=i;j<n;j++)
		{
			System.out.print('*'+" ");
		}
		int p=n;
		for(int j=i;j>=1;j--)
		{
			System.out.print(p--+" ");
		}
		
		System.out.println();
	}
}
}
