package java_05_strings;

import java.util.Scanner;

class Comparasion{
	
	public static int compare(String s, String s1)
	{
		int l1=s.length();
		int l2=s1.length();
		int minlength=Math.min(l1, l2);
		for(int i=0;i<minlength;i++)
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				return s.charAt(i)-s1.charAt(i);
			}
		}
		return l1-l2;
		
	}
}
public class String07 {
public static void main(String[] args) {
	//Program to implement user-defined function to compare two strings.
	System.out.println("Enter a string ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.toLowerCase();
	System.out.println("Enter a string");
	String s2=sc.nextLine();
	s2=s2.toLowerCase();
	sc.close();
	
//    if(s.length()==s2.length())
//    {
//    	s=s.concat(s2);
//    	for(int i=0;i<=s2.length();i++)
//    	{
//    		if(s.charAt(i)==s2.charAt(i))
//    		{
//    			System.out.println("characters are same");
//    		}
//    		else
//    		{
//    			System.out.println("Strings not same");
//    		}
//    	}
//    }
//    else
//    {
//    	System.out.println("Strigs are not same");
//    }
	
	if(s.length()==s2.length())
	{
		int result=Comparasion.compare(s, s2);
		
		if(result==0)
		{
			System.out.println("The strings are equal");
		}
		else if(result<0)
		{
			System.out.println(s+" is less than "+s2);
		}
		else
		{
			System.out.println(s+" is greater then "+s2);
		}
		
	}
	else 
	{
		System.out.println("String are not equal");
	}
    
    
}
}
