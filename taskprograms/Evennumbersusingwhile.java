package taskprograms;

import java.util.Scanner;

public class Evennumbersusingwhile {

	public static void main(String[] args) {
		System.out.println("Enter n value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<=n)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		System.out.println("Enter n1 value");
		int n1=sc.nextInt();
		int j=1;
		do {
			if(j%2==0) {
			System.out.println(j);
			}
			j++;
		}while(j<=n1);
		sc.close();
		

	}

}
