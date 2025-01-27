package java_02_arrays;

//import java.util.Scanner;

public class Duplicate_elements_in_a_array {

	public static void main(String[] args) {
		
	//	System.out.println("Enter a string");
	//	Scanner sc=new Scanner(System.in);
	//	String []arr=sc.nextLine();
		String arr []= {"java","sai","java","sai","sai","java","java","sai"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println(arr.getClass().getName());
int a[]= {1,5,4,1,2,5,4,5,1,3,4,5,2,4,6,1,3,4,5,5,7,8,9};
		
		int fr[]=new int[a.length];
		int visited =-1;
		
		for(int i=0;i<a.length;i++)
		{
			
			int count=1;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
			{
				fr[i]=count;
			}
		}
		
		for(int i=0;i<fr.length;i++)
		{
			if(fr[i]!=visited)
			{
				//System.out.println("Occurance of "+a[i]+" is "+fr[i]);
				if(fr[i]>=2)
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}
}
