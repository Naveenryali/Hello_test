package taskprograms;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		int r =15;
		double Area;
		Area =3.141*Math.pow(r, 2);
		System.out.println(" Area of circle="+ " "+Area);
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double cube=Math.pow(n,3);
		System.out.println(cube);
		System.out.println("Enter n1 value");
		int n1=sc.nextInt();
		int c =n1*n1*n1;
		System.out.println(c);
		
sc.close();

	}

}
