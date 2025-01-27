package taskprograms;

import java.util.Scanner;

public class Numberofoccurances {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int count=0;
		String n=sc.nextLine();
		System.out.println("enter a number to find occurances");
		char ch=sc.next().charAt(0);
		
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
		

	}

}
