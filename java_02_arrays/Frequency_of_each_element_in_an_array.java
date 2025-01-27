package java_02_arrays;

public class Frequency_of_each_element_in_an_array {

	public static void main(String[] args) {
		
		int [] arr=new int [] {1,2,9,9,3,4,3,4,2,5,6,6,7,};
		int [] fr=new int [arr.length];
		System.out.println(arr.length);
		int visited=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
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
				System.out.println(arr[i]+" "+fr[i]);
			}
		}
	}
}
