package java_01_number_programs;

public class String_occuranceof_character {

	public static void main(String[] args) {
		String str = "Hello World";
		char ch ='o';
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			 if (str.charAt(i)==ch)
				 
			 {
				 count++;
			 }
		}
			 System.out.println("number of occurances of a character:"+" "+count);
			 
		
		

	}

}
