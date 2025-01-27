package java_05_strings;

import java.util.Scanner;

public class String11 {
public static void main(String[] args) {
	 System.out.println("set the range");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String s4[]=new String[n];
	String[] s3= {"naveen","nag","sai","shyam"};
//	String[] s4= {"s"};
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter a string");
		s4[i]=sc.next();
	}
	
	
	
	//String regex="[,\\s1]";
	//    String[] sar=s.split(" ");
	    for(String s5:s4)
	    {
	    	System.out.println(s5);
	    
	    
	    for(String s1:s3) {
	    	if(s1.startsWith(s5))
	    	{
	    System.out.println(s1);
	    	}
	    }
	    
	    }
	    
		
		String []sa= {"Sai","Naveen","sai","sai"};
		System.out.println("Enter a letter to search");
		String ch=sc.nextLine();
		
		boolean found=false;
		
		for(String name:sa)
		{
			if(name.startsWith(ch)) 
			{
			System.out.println(name);
			
			found=true;
			
			}
		}
		
		if(!found)
		{
			System.out.println("Names not found with entered letter");
		}
		sc.close();
}
}
