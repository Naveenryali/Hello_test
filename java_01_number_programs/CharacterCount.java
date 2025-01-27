package java_01_number_programs;

import java.util.Scanner;

public class CharacterCount {
public static void main(String[] args) {
	String s="vasunaidu121653eiou@#!$#%";
	int vowels=0,consonants=0,specialcharacters=0,digits=0;
    for(int i=0;i<s.length();i++)
    {
    	char ch=s.charAt(i);
    	if(Character.isLetter(ch))
    	if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
{
	vowels++;
}
    	else
    	{
    		consonants++;
    	}
    	if(Character.isDigit(ch))
    	{
    		digits++;
    	}
    
    	else
    	{
    		specialcharacters++;
    	}
    }
    System.out.println("vowels " +vowels);
    System.out.println("Consonants " +consonants);
    System.out.println("Digits " +digits);
    System.out.println("special characters " +specialcharacters);
    
    System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	s1=s1.toLowerCase();
	int vc,cc,dc,spc=0;
	vc=0;cc=0;dc=0;
	
	for(int i=0;i<s1.length();i++)
	{
		
		if(Character.isLetter(s.charAt(i))) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			
			vc++;
		}
		else {
			cc++;
		}}
		else if(Character.isDigit(s.charAt(i)))
		{
			dc++;
		}
		else {
			spc++;
		}
	
	}
	
	System.out.println(vc+" ");
	System.out.println(cc+" ");

	System.out.println(dc+" ");

	System.out.println(spc+" ");
	
	sc.close();
    
}
}
