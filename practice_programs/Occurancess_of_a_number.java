package practice_programs;

import java.util.Scanner;

public class Occurancess_of_a_number {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int count=0;
			System.out.println("Enter a number to check occurances ");
			int n1=sc.nextInt();
			sc.close();
			while(n!=0)
			{
				if(n%10==n1)
				{
					count++;
				}
				n=n/10;
			}
			System.out.println(count);
}
}
