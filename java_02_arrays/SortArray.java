package java_02_arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	
	public static void main(String[] args) {
		
		Integer a[]= {1,2,4,6,8,3,5,9,7};
		
		System.out.println(Arrays.toString(a));
		
		//  Arrays.sort(a, Collections.reverseOrder());
		  
		 //to perform collections datatype shpuld be in wraper class
		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(a));
		
//		        Integer[] array = {5, 2, 8, 7, 1, 3};
//
//		        System.out.println("Original Array: " + Arrays.toString(array));
//
//		        // Sorting in descending order
//		        Arrays.sort(array, Collections.reverseOrder());
//
//		        System.out.println("Array in Descending Order: " + Arrays.toString(array));
//		    
		
		

	}
}
