package practice_programs;

import java.util.Scanner;

public class Smallest_and_largest_among_three_numbers {
public static void main(String[] args) {
	System.out.println("Enter a number n1");
	Scanner sc=new Scanner(System.in);
	int n1 =sc.nextInt();
	System.out.println("Enter n2 value");
	int n2=sc.nextInt();
	System.out.println("Enter a number n3");
	int n3 =sc.nextInt();
	sc.close();
	int largestnumber =n3>(n1>n2?n1:n2)?n3:(n1>n2?n1:n2);
	System.out.println("largest number ="+largestnumber);
	int smallestnumber =n3<(n1<n2?n1:n2)?n3:(n1<n2?n1:n2);
	System.out.println("smallest number ="+smallestnumber);
}
}
