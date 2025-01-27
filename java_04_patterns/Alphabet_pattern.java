package java_04_patterns;

public class Alphabet_pattern {

	public static void main(String[] args) {
		
		int n= 5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1,p='A';j<=i;j++,p++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}
}
