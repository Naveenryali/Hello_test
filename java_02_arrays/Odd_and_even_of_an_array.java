package java_02_arrays;

public class Odd_and_even_of_an_array {

	public static void main(String[] args) {
		
		
		int a[]={1,2,3,4,5,6,7,8,9};
		System.out.println("Even numbers ");

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
//			else
//			{
//				System.out.println(a[i]+"odd");
//			}
			
		}
		System.out.println("Odd numbers ");

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
			
		}
	}
}
