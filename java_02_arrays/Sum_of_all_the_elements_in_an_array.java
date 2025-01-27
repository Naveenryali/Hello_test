package java_02_arrays;

public class Sum_of_all_the_elements_in_an_array {

	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8};
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i]+sum;
		}
		System.out.println(sum);
		
	}
}
