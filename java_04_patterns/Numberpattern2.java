package java_04_patterns;

public class Numberpattern2 {
public static void main(String[] args) {
	int n=4;
	int count=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++,count++)
		{
			System.out.print(count+" ");
		}
		System.out.println();
	}
}
}
