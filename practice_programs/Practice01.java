package practice_programs;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of tables do you want to print");
		int m=sc.nextInt();
		System.out.println("Enter the range of each table to print");
		int n=sc.nextInt();
		sc.close();

	for(int j=1;j<=m;j++)
	{
		System.out.println("printing "+j+" table");
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			System.out.println(j +" * "+i+" = "+j*i);
		}
		System.out.println();
		
		
	}	
	
	}

}
