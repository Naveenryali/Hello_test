package java_02_arrays;

import java.util.Scanner;

public class Dyanamic_Array {

	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s=sc.nextInt();
		
		int[] a=new int[s];
		
		int b[]=new int[a.length];
		System.out.println("Enter "+s+" digits");
		
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];	
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		for(int n:a)
		{
			System.out.println(n);
		}
		sc.close();
		
		
	}
}
