package java_07exceptions;

public class Arithmetic_exception {
public static void main(String[] args) {
	int a=10;
	int b=10;
	try {
	int c=a/b;
	
	System.out.println(c);
	}
	catch(ArithmeticException e) {System.out.println(e);};
	System.out.println("Hi");
}
}
