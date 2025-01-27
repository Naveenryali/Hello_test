package java_02_arrays;


import java.util.Scanner;

public class Array_of_strings {

	
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		
		System.out.println("Enter "+s+" strings");
		
		String[] strarr= new String[s];
		for(int i=0;i<strarr.length;i++)
		{
			strarr[i]=sc.nextLine();
		
		for(int k=0;k<strarr.length;k++)
		{
			for(int j=k+1;j<strarr.length;j++)
			{
				if(strarr[k]==strarr[j])
				{
					System.out.println(strarr[j]);
				}
				else
				{
					System.out.println(strarr[k]);
				}
			}
		}
			
		
				}
		sc.close();

		
		
	
	}
}
