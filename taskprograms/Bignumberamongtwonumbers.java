package taskprograms;

import java.util.Scanner;

public class Bignumberamongtwonumbers {

	public static void main(String[] args) {
		System.out.println("Enter n1 value");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter n2 value");
		int n2=sc.nextInt();
		if(n1>n2)
		{
			System.out.println(n1+" "+"is greater than "+" "+n2);
		}
		else if(n2>n1){
			System.out.println(n2+ " "+"is greater than"+" "+n1);
		}
		else {
			System.out.println(n1+" "+"is equal to"+" "+n2);
		}
		sc.close();
		
	}

}
