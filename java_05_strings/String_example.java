package java_05_strings;

import java.util.Scanner;

public class String_example {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s3=sc.nextLine();
		s3=s3.toLowerCase();
		
		 char [] s4=s3.toCharArray();
		 
		 int min=1;
		 int max=1;
		 char maxc=' ';
		 char minc=' ';
		
		int visited[]=new int[s4.length];
		 for(int i=0;i<s4.length;i++)
		 {
			 if(!Character.isWhitespace(s4[i]))
			 {
				 
			 
			 if(visited[i]==1)
			 {
				 continue;
				  
			 }
			 int count=1;
			 for(int j=i+1;j<s4.length;j++)
			 {
				 
				 if(s4[i]==s4[j])
				 {
					 count++;
					 visited[j]=1;
				 }
				 
			 }
			System.out.println(s4[i]+" "+count);
			if(count>max)
			{
				max=count;
				maxc=s4[i];
				
			}
			
			if(count==1)
			{
				minc=s4[i];
			}
			 }
		
		 }
		 System.out.println("Maximum count of character "+maxc+" : "+max+" times" );
		 System.out.println("Minimum count of character "+minc+" : "+min+" times" );

		 
		 sc.close();
	}
}
