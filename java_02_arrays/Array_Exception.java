package java_02_arrays;

public class Array_Exception {
	
	static int[] print()
	{
		return new int[]{1,5,2,45,6,54,};
	}
	public static void main(String[] args) {
	
		int [] a=print();
		
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	
	
	}
}
