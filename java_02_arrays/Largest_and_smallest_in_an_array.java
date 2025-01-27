package java_02_arrays;

public class Largest_and_smallest_in_an_array {

	
	public static void main(String[] args) {
		
		int arr[]= {1,25,3,4,5,6,75,8,7,};
		
		int largest =arr[0];
		int smallest =arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest)
			{	
				arr[i]=smallest;
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		
		
		
		
	}
	 
}
