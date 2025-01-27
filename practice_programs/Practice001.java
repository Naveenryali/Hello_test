package practice_programs;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class Practice001 {

	
	
//	private static final String String = null;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter the number");
//		
//		int n=sc.nextInt();
//		if(n==0||n==1)
//		{
//			System.out.println(n+"not a prime number");
//		}
//		int count=0;
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//		{
//			System.out.println(n+" is a prime number");
//		}
//		else 
//		{
//			System.out.println(n+" is not a prime number");
//		}
//		System.out.println("m value from which the values to be printed");
//		int m=sc.nextInt();
//		System.out.println("n value to print ");
//		int n=sc.nextInt();
//		int sum=0;
//		
//		for(int i=m;i<=n;i++)
//		{
//			int count=0;
//			for(int j=1;j<=i;j++)
//			{
//				if(i%j==0)
//				{
//					count++;
//					
//				}
//			}
//			if(count==2)
//			{
//				System.out.println(i);
//				sum=sum+i;
//			}
//		}
//		System.out.println(sum);
//		
//		int sum=0;
//		for(int i=1;i<n;i++)
//		{
//			
//			if(n%i==0)
//			{
//				System.out.println(i);
//				sum=sum+i;
//			}
//		}
//		if(sum==n)
//		{
//			System.out.println(n+" it is a perfect number");
//		}
//		else
//		{
//			System.out.println(n+" is not a perfect number");
//		}
//		
//		int sum1=0;
//		for(int i=m;i<=n;i++)
//		{
//			
//			int count=0;
//			
//			for(int j=1;j<i;j++)
//			{
//				if(i%j==0)
//				{
//					
//				count=count+i;
//				
//				}
//			}
//			if(count==i)
//			{
//				System.out.println(i);
//				
//				sum1=sum1+i;
//				
//			}
//		}
//		System.out.println(sum1);
		
//		System.out.println("Enter a year");
//		int year=sc.nextInt();
//		
//		if(year%4==0||year%400==0 && year%100!=0)
//		{
//			System.out.println("Leap year");
//		}
//		else
//		{
//			System.out.println("Not a leap year ");
//		}
		
//		System.out.println("Enter a number");
//		
//		int n=sc.nextInt();
//		
//		if(n%3==0&&n%5==0)
//		{
//			System.out.println(n+" is divisible by both 3 and 5");
//		}
//		else
//		{
//			System.out.println(n+" not divisible by 3 and 5");
//		}
		
		
//		System.out.println("Enter the marks obtained");
//		
//		int n=sc.nextInt();
//		
//		switch(n)
//		{
//		case 1:
//			if(n>40||n<=50)
//				{
//				System.out.println("Pass");
//				}
//		break;
//		default:System.out.println("Enter valid marks");
//		}
//		
//		System.out.println("Enter a character");
//		char ch=sc.next().charAt(0);
//		
//		System.out.println(ch);
//		
//		if(ch>='A' && ch<='B')
//		{
//			System.out.println("Upper case");
//		}
//		else if(ch>='a'&&ch<='z')
//		{
//			System.out.println("Lower case");
//		}
//		else if(ch>='0' && ch<='9')
//		{
//			System.out.println("number");
//		}
//		else {
//			System.out.println("Special character");
//		}
		
//		for(int i='0';i<='9';i++)
//		{
//			System.out.println((char)i);
//		}
//		
		
//		int a=10;
//		int b=4;
//		int c=3;
//		int smallest=c<(a<b?a:b)?c:(a<b?a:b);
//		int largest=c>(a>b?a:b)?c:(a>b?a:b);
//		System.out.println(largest);
//		System.out.println(smallest);
//		
		
//		for(int i=1;i<=20;i++)
//		{
//			System.out.println(i*i);
//		}
//		
//		int n=10;
//		int sum=0;
//		for(int i=0;i<=n;i+=2)
//		{
//			sum=sum+i;
//			System.out.println(i);
//		}
//		System.out.println(sum);
//		
//		int i=0;
//		int n1=10;
//		int sum1=0;
//		while(i<=n1)
//		{
//			sum1=sum1+i;
//			System.out.println(i);
//			i+=2;
//		}
//		System.out.println(sum1);
//		int i=0;
//		int sum=0;
//		int n=10;
//		do
//		{
//			System.out.println(i);
//			i+=2;
//			sum=sum+i;
//			
//			
//		}while(i<n);
//		
//		System.out.println(sum);
//		
		
//		int f=1;
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			f=f*i;
//		}
//		System.out.println(f);
//		
		
//		int n=10;
//		int n1=0;
//		int n2=1;
//		int sum=0;
//		System.out.print(n1+" "+n2+" ");
//		
//		for(int i=1;i<=n;i++)
//		{
//			
//			sum=n1+n2;
//			System.out.print(sum+" ");
//			n1=n2;
//			n2=sum;
//		}
		
//		System.out.println("Enter a number");
//		
//		int n=sc.nextInt();
//		
//		int max=n%10;
//		
//		while(n!=0)
//		{
//			if(n%10>max)
//			{
//				max=n%10;
//			}
//			n=n/10;
//		}
//		System.out.println(max);
//		
		
//System.out.println("Enter a number");
//		
//		int n=sc.nextInt();
//		
//		int min=n%10;
//		
//		while(n!=0)
//		{
//			if(n%10<min)
//			{
//				min=n%10;
//			}
//			n=n/10;
//		}
//		System.out.println(min);
//		
		
//		int rev=0;
//		
//		int n=1234456;
//		
//		while(n>0)
//		{
//			rev=rev*10+n%10;
//			
//			n=n/10;
//		}
//		System.out.println(rev);
		
		
//		int n=121;
//		int temp=n;
//		int rev=0;
//		
//		while(n>0)
//		{
//			rev=rev*10+n%10;
//			n=n/10;
//		}
//		System.out.println(rev);
//		if(rev==temp) {
//		System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not a palindrome");
//		}
		
//		int n=123456;
//		int i=0;
//		int sum =0;
//		while(n!=0)
//		{
//			if(i%2==0)
//			{
//				sum=sum+n%10;
//				System.out.println(n%10);
//			}
//			n=n/10;
//			i++;
//		}
//		
//		System.out.println(sum);
//		
		
//		int n=1646984651;
//		int count=0;
//		while(n!=0)
//		{
//			
//			if(n%10==6)
//			{
//				count++;
//			}
//			n=n/10;
//		}
//		System.out.println(count);
		
		
		
//		int n=11111;
//		int l=n%10;
//		int f=0;
//		while(n!=0)
//		{
//			f=n%10;
//			
//			n=n/10;
//		}
//		if(l==f)
//		{
//			System.out.println("all digits are equal");
//		}
//		else
//		{
//			System.out.println("All digits are not equal"); 
//			
//		}
//		System.out.println(f+l);
//		System.out.println("First digit = "+f);
//		System.out.println("Last digit = "+l);
		
//		int n=1234567;
//		int sum=0;
//		int sum1=0;
//		while(n!=0)
//		{
//			if(n%10%2==0)
//			{
//				System.out.println(n%10);
//				sum=sum+n%10;
//			}
//			else {
//				System.out.println(n%10);
//				sum1=sum1+n%10;
//			}
//			n=n/10;
//		}
//		System.out.println("Sum of even numbers in the given number = "+sum);
//		System.out.println("Sum of odd numbers in the given number = "+sum1);
//		
		
		
//		System.out.println("Enter the size of the array");
//		
//		int size=sc.nextInt();
//		
//		
//		int[] array=new int[size];
//		
//		System.out.println("Enter "+ size+ " Integers");
//		
//		for(int i=0;i<size;i++)
//		{
//			array[i]=sc.nextInt();
//		}
//		System.out.println("Array elements are");
//		
//		for(int num:array)
//		{
//			
//			System.out.println(num+ " ");
//			
//			
//		}
		
		
//		
//		int []a=new int[5];
//		
//		a[0]= 10;
//		a[1]= 20;
//		a[2]= 30;
//		a[3]= 40;
//		a[4]= 50;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		int []a= {1,2,5,3,4,6,1,2,3,4,1,3,4,6,1,3};
//		
//		int fr[]=new int[a.length];
//		
//		int visited =-1;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			int count =1;
//			
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					count++;
//					
//					fr[j]=visited;
//				}
//			}
//			if(fr[i]!=visited)
//			{
//				fr[i]=count;
//			}
//		}
//		
//		for(int i=0;i<fr.length;i++)
//		{
//			if(fr[i]!=visited)
//			{
//				System.out.println(a[i]+" "+fr[i]);
//			}
//		}
//		
//		int n=10;
//		
//		for(int i=1;i<=n;i++)
//			
//		{
//			int count=0;
//			
//			for(int j=1;j<i;j++)
//			{
//				if(i%j==0)
//				{
//					count=count+j;
//				}
//			}
//			if(count==i)
//			{
//				System.out.println(i);
//			}
//		}
		
		
//		int n,n1,n2,sum;
//		n=0;
//		n1=1;
//		sum=0;
//		System.out.print(n+" "+n1);
//		n2=10;
//		for(int i=1;i<=n2;i++)
//		{
//			sum=n+n1;
//			System.out.print(" "+sum);
//			n=n1;
//			n1=sum;
//		}
		
//		int rev=0;
		
//		int n=51515;
//		int temp=n;
//		
//		while(n!=0)
//		{
//			
//			rev=rev*10+n%10;
//			
//			n=n/10;
//			
//			
//		}
//		System.out.println(rev);
//		if(rev==temp)
//		{
//			System.out.println("Palindrome");
//		}
//		else {
//		System.out.println("Not a palindrome");
//		}
		
//		int n=5;
//		int f=1;
//		
//		for(int i=1; i<=n;i++)
//		{
//			
//			f=f*i;
//			
//		}
//		System.out.println(f);
//		
		
//		int n=16544;
//		int f=n%10;
//		
//		int last=n%10;
//		while(n!=0)
//		{
//			f=n%10;
//			n=n/10;
//			
//		}
//		System.out.println(last+" "+f);
//		
		
		
//		int n=1654656;
//		int max=n%10;
//		int min=n%10;
//		
//		
//		while(n!=0)
//		{
//			if(n%10>max)
//			{
//				max=n%10;
//			}
//			else if(n%10<min)
//			{
//				min=n%10;
//			}
//			
//			n=n/10;
//			
//		}
//		System.out.println(max+" "+min);
//		
		
		
//		int a=10;
//		int b=183;
//		int c=3;
//		
//		int largest=c<(a<b?a:b)?c:(a<b?a:b);
//		System.out.println(largest);
		
//		
//		int a[]=new int[]{1,25,1,32,5,12,5,1};
//		
//		int b[]=new int[a.length];
//		System.out.println(a[0]);
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//
//			b[i]=a[i];
//			
//		}
//		
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		}
		
//		int a[]= {1,5,4,1,2,5,4,5,1,3,4,5,2,4,6,1,3,4,5,5,7,8,9};
//		
//		int fr[]=new int[a.length];
//		int visited =-1;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			
//			int count=1;
//			
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					count++;
//					
//					fr[j]=visited;
//				}
//			}
//			if(fr[i]!=visited)
//			{
//				fr[i]=count;
//			}
//		}
//		
//		for(int i=0;i<fr.length;i++)
//		{
//			if(fr[i]!=visited)
//			{
//				System.out.println("Occurance of "+a[i]+" is "+fr[i]);
//				if(fr[i]>=2)
//				{
//					System.out.println(a[i]);
//				}
//			}
//		}
		
		
//		int a[]= {1,2,1,2,1,5,4,1,2};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					System.out.println(a[i]);
//				}
//			}
//		}
		
//		int n=5;
//		
//		for(int i=1;i<=n;i++)
//		{
//			
//			for(int j=i,p=5;j<=n;j++,p--)
//			{
//				
//				System.out.print(p+" ");
//			}
//			System.out.println();
//		}
		
		
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		
//		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//			
//		}
		
		
//		int a[]= {1,5,4,2,1,3,5,7,8,9,4};
//		
//		int max=a[0];
//		int min=a[0];
//		
//		for(int i=0;i<a.length;i++)
//		{
//			
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//			else if(a[i]<min)
//			{
//				min=a[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
//		
	
		
		    
		        
//		       System.out.println("Enter a character");
//		       char ch=sc.next().charAt(0);
//		       
//		       if(ch>='A' && ch<='Z')
//		       {
//		    	   System.out.println(ch +" Upper case");
//		       }
//		       else if(ch>='a' && ch<='z')
//		       {
//		    	   System.out.println(ch+" Lower case");
//		       }
//		       else if(ch>='0' && ch<='9')
//		       {
//		    	   System.out.println(ch +" Digit");
//		       }
//		       else
//		       {
//		    	   System.out.println("Special character");
//		       }
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		s=s.toLowerCase();
//		int vc,cc,dc,spc=0;
//		vc=0;cc=0;dc=0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(Character.isLetter(s.charAt(i))) {
//			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
//			{
//				
//				vc++;
//			}
//			else {
//				cc++;
//			}}
//			else if(Character.isDigit(s.charAt(i)))
//			{
//				dc++;
//			}
//			else {
//				spc++;
//			}
//		
//		}
//		
//		System.out.println(vc+" ");
//		System.out.println(cc+" ");
//
//		System.out.println(dc+" ");
//
//		System.out.println(spc+" ");


//		System.out.println("Enyter n value");
//		int n=sc.nextInt();
//		double sum=0;
//		for(int i=1;i<=n;i++)
//		{
//			sum=sum+(double)1/i;
//			
//		}
//		System.out.println(sum);

//		System.out.println("Enyter n value");
//		int n=sc.nextInt();
//		double sum=0;
//		int j=0;
//		for(int i=1;i<=n;i++)
//		{
//			sum=sum+(double)1/Math.pow(2, j);
//			j++;
//			
//		}
//		System.out.println(sum);
		
	
		        // Prompt the user to enter the value of N
//		        System.out.print("Enter the value of N: ");
//		        int N = sc.nextInt();
//
//		        // Initialize the sum variable
//		        double sum = 0.0;
//		        double factorial=1;
//		        // Calculate the sum of the series
//		        for (int i = 1; i <= N; i++) {
//		        	
//		        	factorial=factorial*i;
//		        	
//		            sum += 1.0 / factorial; // Add 1/i! to the sum
//		        }
//
//		        // Display the result
//		        System.out.printf("The sum of the series is: %.6f%n", sum);
//
//		        // Close the scanner
//		        sc.close();
//		    }
//
//		    // Method to calculate factorial of a number
//		    public static long factorial(int num) {
//		        long fact = 1;
//		        for (int i = 1; i <= num; i++) {
//		            fact *= i;
//		        }
//		        return fact;
//		    
		
//		char ch[]= {'s','s','s'};
//		
//		String s=new String(ch);
//		
//		String s1="sss";
//		System.out.println(s);
//		System.out.println(s1);
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		
//		String s2=" ";
//		for(int i=0;i<s.length();i++)
//		{
//			
//			
//			s2=s.charAt(i)+s2;
//		}
//		System.out.println(s2);
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			count++;
//			
//			
//		}
//		System.out.println(s.length());
//		System.out.println(count);
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		s=s.toLowerCase();
//		
//		char chmax='0';
//		char chmin='0';
//		
//		int maxcount=Integer.MIN_VALUE;
//		int mincount=Integer.MAX_VALUE;
//		
//		Map<Character,Integer> chfr=new HashMap<>();
//		
//		
//		for(char ch :s.toCharArray())
//		{
//			
//			chfr.put(ch, chfr.getOrDefault(ch,0)+1);
//		}
//		
//		for(Map.Entry<Character, Integer> entry :chfr.entrySet())
//		{
//			
//			char currentchar=entry.getKey();
//			int count=entry.getValue();
//			
//			if(count>maxcount)
//			{
//				maxcount=count;
//				chmax=currentchar;
//			}
//			if(count<mincount)
//			{
//				mincount=count;
//				chmin=currentchar;
//			}
//			
//		}
//		
//		
//		System.out.println(chmax+"  "+maxcount);
//		System.out.println(chmin+"  "+mincount);
//		
		
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		s=s.toLowerCase();
//		System.out.println("Enter a character to remove from the string");
//		
//		char ch=sc.next().charAt(0);
//		
//		for(int i=0;i<s.length();i++)
//		{
//			
//			if(s.charAt(i)!=ch)
//			{
//				System.out.print(s.charAt(i));
//			}
//		}
		
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		
//		String sa[]=s.split(" ");
//		int wo=0,vowel=0,con=0,dig=0,spchar=0;
//		for(String w:sa)
//		{
//			wo++;
//		}
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//		
//			if(Character.isAlphabetic(ch))
//			{
//				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//				{
//					vowel++;
//				}
//				else {
//					con++;
//				}
//			}
//			else if(Character.isDigit(ch))
//			{
//				dig++;
//			}
//			else if(!Character.isAlphabetic(ch)&&!Character.isDigit(ch)&&ch!=' ')
//			{
//				spchar++;
//			}
		
//		System.out.println(wo);
//		System.out.println(vowel);
//		System.out.println(con);
//		System.out.println(dig);
//		System.out.println(spchar);
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		s=s.toLowerCase();
//		String sa[]=s.split(" ");
//		String s1=" ",s2=" ";
//		String sent=" ";
//		
//		for(String w:sa)
//		{
//			s1=w.substring(0,1).toUpperCase();
//			s2=w.substring(1);
//			//sent=" "+s1+s2+sent;
//			sent=sent+s1+s2+" ";
//			
//			
//		
//		}
//		System.out.println(sent);
//		
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		
//		s=s.toLowerCase();
//		String s1=" ";
//		char[]ch=s.toCharArray();
//		
//		Arrays.sort(ch);
//		System.out.println(ch);
//		for(char c:ch)
//		{
//			s1=c+s1;
//		}
//		System.out.println(s1);
		
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		String s1=" ";
//		
//		for(int i=0;i<s.length();i++)
//		{
//			
//			if(s.charAt(i)>='A'&&s.charAt(i)<='Z' || s.charAt(i)>='a'&& s.charAt(i)<='z'||s.charAt(i)==' ')
//			{
//				s1=s1+s.charAt(i);
//				
//			}
//		}
//		System.out.println(s1);
//		
//		String []sa= {"Sai","NAveen","sai","sai"};
//		System.out.println("Enter a letter to search");
//		String ch=sc.nextLine();
//		
//		boolean found=false;
//		
//		for(String name:sa)
//		{
//			if(name.startsWith(ch)) 
//			{
//			System.out.println(name);
//			
//			found=true;
//			
//			}
//		}
//		
//		if(!found)
//		{
//			System.out.println("Names not found with entered letter");
//		}
		
		
		
//		System.out.println("Enetr a String");
//		String s=sc.nextLine();
//		
//		
//		int vowels=0,consonants=0;
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(Character.isAlphabetic(ch))
//			{
//				
//			
//			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
//			{
//				vowels++;
//			}
//			else
//			{
//				consonants++;
//			}
//			}
//			
//			
//		}
//		System.out.println(vowels);
//		System.out.println(consonants);
//		
		
//		
//		System.out.println("Enter a string");
//		String s=sc.nextLine();
//		String s1=s.substring(5);
//		System.out.println(s1);
//		System.out.println("Enter a string");
//		String s2=sc.nextLine();
//		
//		s=s.replace(s1, s2);
//		System.out.println(s);
		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		System.out.println("Enter a word to search");
//		String s1=sc.nextLine();
//		
//		String []sa=s.split(" ");
//		
//		boolean found=false;
//		for(String word:sa)
//		{
//			if(word.contains(s1))
//			{
//					System.out.println(" word found :"+word);
//					found=true;
//			}
//		}
//		
//		if(!found)
//		{
//			System.out.println("Word not found");
//		}

		
//		System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		
//		String s1[]=s.split(" ");
//		
//		String s2=" ";
//		
//		for( String word:s1)
//		{
//			String revword=" ";
//			
//			for(int i=0;i<word.length();i++)
//			{
//				revword=word.charAt(i)+revword;
//			}
//			s2=s2+revword+" ";
//			
//		}
//		System.out.println(s2);
		
		
//System.out.println("Enter a string");
//		
//		String s=sc.nextLine();
//		
//		String s1[]=s.split(" ");
//		
//		String s2="";
//		String s3="";
//		String s4="";
//		
//		for( String word:s1)
//		{
//			 s2=word.substring(1);
//			 s3=s2.substring(0,1);
//			 s4=s4+s3+s2+" ";
//			 
//			
//		}
//		
//		System.out.println(s4);
//		
		
	
//		        String input = "Hello, World! 123";
//
//		        // Initialize counters
//		        int uppercase = 0, lowercase = 0, vowels = 0, consonants = 0, digits = 0, specialCharacters = 0;
//
//		        // Total length of the string
//		        int totalLength = input.length();
//
//		        // Iterate through each character
//		        for (char ch : input.toCharArray()) {
//		            if (Character.isUpperCase(ch)) {
//		                uppercase++;
//		                if (isVowel(ch)) vowels++;
//		                else consonants++;
//		            } else if (Character.isLowerCase(ch)) {
//		                lowercase++;
//		                if (isVowel(ch)) vowels++;
//		                else consonants++;
//		            } else if (Character.isDigit(ch)) {
//		                digits++;
//		            } else if (!Character.isWhitespace(ch)) {
//		                specialCharacters++;
//		            }
//		        }
//
//		        // Calculate percentages
//		        double upperPercent = (uppercase * 100.0) / totalLength;
//		        double lowerPercent = (lowercase * 100.0) / totalLength;
//		        double vowelPercent = (vowels * 100.0) / totalLength;
//		        double consonantPercent = (consonants * 100.0) / totalLength;
//		        double digitPercent = (digits * 100.0) / totalLength;
//		        double specialCharPercent = (specialCharacters * 100.0) / totalLength;
//
//		        // Print results
//		        System.out.printf("Uppercase Letters: %.2f%%\n", upperPercent);
//		        System.out.printf("Lowercase Letters: %.2f%%\n", lowerPercent);
//		        System.out.printf("Vowels: %.2f%%\n", vowelPercent);
//		        System.out.printf("Consonants: %.2f%%\n", consonantPercent);
//		        System.out.printf("Digits: %.2f%%\n", digitPercent);
//		        System.out.printf("Special Characters: %.2f%%\n", specialCharPercent);
//		    }
//
//		    // Helper method to check if a character is a vowel
//		    public static boolean isVowel(char ch) {
//		        ch = Character.toLowerCase(ch); // Convert to lowercase for comparison
//		        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//		    
//		
//		System.out.println("Enter a string");
//		String s=sc.nextLine();
//		String s1="",s2="",s3="";
//		
//		String sa[]=s.split(" ");
//		
//		for(String w:sa)
//		{
//			s1=w.substring(1);
//			s2=s1.substring(0,1);
//			s3=s3+s2+s1+" ";
//		}
//		System.out.println(s3);
		
//		System.out.println("Enter Enetr the size of the array");
//		
//		int size=sc.nextInt();
//		
//		String []sa=new String[size];
//		String [] ba=new String[sa.length];
//		System.out.println("Enter "+size+" strings");
//		
//		for(int i=0;i<sa.length;i++)
//		{
//			sa[i]=sc.nextLine();
//			ba[i]=sa[i];
//		}
		
		
//		for(int i=0;i<ba.length;i++)
//		{
//			System.out.println(ba[i]);
//			
//		}
//		String s1="";
//		for(String w:ba)	
//		{
//		
//			//System.out.println(w);
//			s1=s1+w.toLowerCase();
//			
//			
//		}
//		System.out.println(s1);
//		for(int i=0;i<s1.length();i++)
//		{
//			String sum="";
//			for(int j=i+1;j<s1.length();j++)
//			{
//			if(s1.charAt(i)==s1.charAt(j))
//			{
//				//System.out.println(s1.charAt(i));
//				sum=sum+s1.charAt(i);
//			}
//			else if(s1.charAt(i)!=s1.charAt(j))
//			{
//				//System.out.println(s1.charAt(i));
//				sum=sum+s1.charAt(i);
//			}
//			
//				
//			}
//			
//			
//		}
		
		
		
		

		
		
			
		
		

		
		
		
		
		sc.close();
	}
}
