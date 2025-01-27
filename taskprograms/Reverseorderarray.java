package taskprograms;

public class Reverseorderarray {
public static void main(String[] args) {
	int a[]= {1,45,65,54,465,34};
	System.out.print("Elements to reverse:");
	for(int i=0;i<a.length;i++)
	{
		
	
	System.out.print(a[i]+" ");
	
	}
	System.out.println();
	System.out.print("reversered elements are");
	for(int j=a.length-1;j>=0;j--)
	{
		System.out.print(a[j]+" ");
	}
	
}
}
