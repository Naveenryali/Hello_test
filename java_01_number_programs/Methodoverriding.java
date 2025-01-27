package java_01_number_programs;
class A
{
	void dis()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	void dis()
	
	{
		System.out.println("World");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		A a=new A();
		A b=new B();
		a.dis();
		b.dis();
			
	}

}
