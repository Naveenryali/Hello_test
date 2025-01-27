package java_02_arrays;

import java.util.Arrays;

public class Copy_of_one_element_of_array_into_other {

	
	public static void main(String[] args) {
		
		int [] arr1 =new int[] {1,2,3,4,5};
		
		int [] arr2 =new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
			System.out.print(arr1[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]);
		}
		
	

	}
}
