	package practice_programs;
	
	import java.util.Scanner;
	
	public class Occurances_of_each_number {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		while((n>0))
		
		{
		int	n1=n%10;
		 if(n1==0)
		{
			c0++;
		}
		else if(n1==1)
		{
			 c1++;
		}
		else if(n1==2)
		{
			c2++;
		}
		else if(n1==3)
		{
			c3++;
		}
		else if(n1==4)
		{
			c4++;
		}
		else if(n1==5) {
			c5++;
		}
		else if(n1==6)
		{
			c6++;
		}
		else if(n1==7)
		{
			c7++;
		}
		else if(n1==8)
		{
			c8++;
		}
		else if(n1==9)
		{
			c9++;
		}
		n=n/10;
		}
		
		if(c0>0)
		{
			System.out.println("occurances of '0' in given number = "+c0);
		}
		
		if(c1>0)
		{
			System.out.println("occurances of '1' in given number = "+c1);
		}
		
		if(c2>0)
		{
			System.out.println("occurances of '2' in given number = "+c2);
		}
		
		if(c3>0)
		{
			System.out.println("occurances of '3' in given number = "+c3);
		}
		
		if(c4>0)
		{
			System.out.println("occurances of '4' in given number = "+c4);
		}
		
		if(c5>0)
		{
			System.out.println("occurances of '5' in given number = "+c5);
		}
		
		if(c6>0)
		{
			System.out.println("occurances of '6' in given number = "+c6);
		}
		
		if(c7>0)
		{
			System.out.println("occurances of '7' in given number = "+c7);
		}
		
		if(c8>0)
		{
			System.out.println("occurances of '8' in given number = "+c8);
		}
		if(c9>0)
		{
			System.out.println("occurances of '9' in given number = "+c9);
		}
		
		
			sc.close();
	}
				
	}
	
