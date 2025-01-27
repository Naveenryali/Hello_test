package java_01_number_programs;

public class String_Split {

	public static void main(String[] args) {
	/*	String s ="Hello,world,java";
		String[] parts =s.split(",");
		for (String part : parts)
		{
			System.out.println(part);
		}
	*/
		String s = "Hello,world,java";
		String[] parts = s.split(",");
		for(int i =0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
	}

}
