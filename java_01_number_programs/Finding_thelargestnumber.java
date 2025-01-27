package java_01_number_programs;

import java.util.Scanner;

public class Finding_thelargestnumber {

	public static void main(String[] args) {
		//Develop a Java program that finds and prints the maximum of three given integers.

System.out.println("Enter first number n1");
Scanner sc =new Scanner(System.in);
int n1 = sc.nextInt();
System.out.println("Enter second number n2 ");
int n2 =sc.nextInt();
System.out.println("Enter third number n3 ");
int n3 = sc.nextInt();

if((n1>=n2)&&(n1>=n3))
{
	System.out.println(n1+" "+"is greater than"+ " " + n2 +"and"+" "+n3);
	
	
}
else if ((n2>n1) && (n2>n3))
{
	System.out.println(n2+" "+"is greater than"+ " " + n1 +"and"+" "+n3);
}
else if ((n3>n1)&&(n3>n2))
{
	System.out.println(n3+" "+"is greater than"+ " " + n1 +"and"+" "+n2);

	}

sc.close();

}
}
