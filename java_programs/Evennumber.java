package java_programs;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i+=2) {
			
		
			System.out.println("printing even numbers :"+ " "+i);
			
		
		sum =sum+i;
		}
		System.out.println();
System.out.println(sum);
sc.close();
	}

}
