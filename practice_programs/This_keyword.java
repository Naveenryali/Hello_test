package practice_programs;
//to invoke current class constructor

class A {
	A(){
		System.out.println("Hi");
	}
	A(int x)
	{
		this();
		System.out.println(x);
	}
	
}
public class This_keyword {

	public static void main(String[] args) {
		
		A a=new A(10);
		System.out.println(a);
		
		
	}
}
