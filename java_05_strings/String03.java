package java_05_strings;

import java.util.Scanner;

public class String03 {
public static void main(String[] args) {
	//maximum and minimum occuring of a charater in a string
	System.out.println("Enter a string");
	
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.toLowerCase();

	int fr[]=new int[256];
	
	for(char ch:s.toCharArray())
	{
		fr[ch]++;
	}
	
	char minchar='0',maxchar='0';
	int mincount=Integer.MAX_VALUE,maxcount=Integer.MIN_VALUE;
	
	
	for(int i=0;i<fr.length;i++)
	{
		
		if(fr[i]>maxcount)
		{
			maxcount=fr[i];
			maxchar=(char)i;
			
		}
		if(fr[i]<mincount)
		{
			mincount=fr[i];
			
			minchar=(char)i;
		}
		
		
	}
	
	System.out.println(maxchar+" "+maxcount);
	System.out.println((minchar+" "+mincount));
	
	
	sc.close();
	
}
}
