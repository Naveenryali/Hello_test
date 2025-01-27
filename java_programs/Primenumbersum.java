package java_programs;

import java.util.Scanner;

public class Primenumbersum {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int sum =0;
		for(int i=1;i<=r;i++)
		{
		int	count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) {
				count++;
				}
			}
				if (count==2) 
				{
					System.out.print(i);
					sum =sum+i;
				}
		}
		System.out.println();
		System.out.println(sum);
			
		sc.close();
		
	}

}
