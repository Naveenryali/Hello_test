package java_01_number_programs;

public class String_Reverse {

	public static void main(String[] args) {
		String str ="Hello world";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed string :"+ " "+reversed);

	}

}
