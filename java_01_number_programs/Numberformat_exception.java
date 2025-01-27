package java_01_number_programs;

public class Numberformat_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try 
{
	int n=Integer.parseInt("Welcome");
	System.out.println(n);
	
}
catch( NumberFormatException nfe) {
	System.out.println((nfe));
}
	}

}
