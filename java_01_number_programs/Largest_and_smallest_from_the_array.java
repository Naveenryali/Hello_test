package java_01_number_programs;

public class Largest_and_smallest_from_the_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers[] = new int[] {1,2,3,4,5,6,8,9,10};
int smallest = numbers[0];
int largetst = numbers[0];

for(int i=1;i < numbers.length; i++) {
	if(numbers[i] > largetst)
		largetst = numbers[i];
	else if (numbers[i] < smallest)
		smallest = numbers[i];
		
	
}
System.out.println("largest number is : " + largetst);
System.out.println("smallest number is : " + smallest);
	}

}
