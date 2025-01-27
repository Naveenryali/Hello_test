package java_02_arrays;

public class Array_to_method {

	static void min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		
			if(min>arr[i])
			
				min=arr[i];
			
		
			System.out.println(min);
		
	}
	public static void main(String[] args) {
		
		int a[]= {66,2,3,4,5,67,7,};
		min(a);
		
		
		
	}
}
