package taskprograms;

import java.util.Scanner;

public class Fibnoacciseries {

	public static void main(String[] args) {
		System.out.println("Enter n value");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,n2=1;
		int sum=0;
		System.out.print(n1+" "+n2);
		for(int i=1;i<=n;i++)
			
		{
			 sum=n1+n2;
			 System.out.print(" "+sum);
			 n1=n2;
			 n2=sum;
			 
		}
		sc.close();
		
		
		
	}

}
