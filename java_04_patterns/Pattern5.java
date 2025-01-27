package java_04_patterns;

public class Pattern5 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		int p=n;
		for(int j=1;j<=i;j++,p--)
		{
			System.out.print(p+" ");
		}
		System.out.println();
	}
}
}
