package java_01_number_programs;

public class String_reverse_withoutreversmethod {
	public static void main(String[] args) {
		String str ="Hello World";
		char[] charArray = str.toCharArray();
		String reversedstr= "";
		for(int i=charArray.length-1;i>=0;i--)
		{
			reversedstr += charArray[i];
		}
		System.out.println("Reversed string :"+" "+reversedstr);
	}

}
