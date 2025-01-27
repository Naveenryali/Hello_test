package java_05_strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String13 {
	public static void getOccurances(String s)
	{
		Map<Character,Integer> chmap=new HashMap<>();
		
		char sa[]=s.toCharArray();
		
		for(char ch:sa)
		{
			if(!String.valueOf(ch).isBlank())
			{
			if(chmap.containsKey(ch))
			{
				chmap.put(ch, chmap.get(ch)+1);
			}
			else
			{
				chmap.put(ch, 1);
			}
			}
			
		}
		System.out.println(s+"     "+chmap);
		
	}
public static void main(String[] args) {
	//Program to print the occurrences of each character in a given string.
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	s=s.toLowerCase();
	char[] ch=s.toCharArray();
	Arrays.sort(ch);
//	System.out.println(ch);
	
//	int visited =-1;
//	for(int i=0;i<s.length();i++)
//	{
//		int count =1;
//		
//		for(int j=i+1;j<s.length();j++)
//		{
//			
//			if(s.charAt(i)==s.charAt(j))
//			{
//				
//				count++;
//				
//				
//			}
//			
//		}
//		
//		System.out.println(count+ " "+s.charAt(i));
//	}
	
//	  String input = "hello world";
//      countCharacterOccurrences(input);
//  }

//  public static void countCharacterOccurrences(String str) {
//      // Create a map to store character frequencies
//      Map<Character, Integer> charCountMap = new HashMap<>();
//
//      // Iterate through the string and count characters
//      for (char ch : str.toCharArray()) {
//          if (charCountMap.containsKey(ch)) {
//              charCountMap.put(ch, charCountMap.get(ch) + 1);
//          } else {
//              charCountMap.put(ch, 1);
//          }
//      }
//
//      // Print the character counts
//      for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//          System.out.println(entry.getKey() + " : " + entry.getValue());
//      }
//	
	
	
	String13.getOccurances(s);
	
	
		
	
	
	
	
}
}
