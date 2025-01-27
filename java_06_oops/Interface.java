package java_06_oops;
interface Printable{

	void print();
}
public class Interface implements Printable{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Interface i=new Interface();
		i.print();
	}

}
