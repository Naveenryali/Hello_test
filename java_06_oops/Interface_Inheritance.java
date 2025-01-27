package java_06_oops;

interface Printable112{
	void print();
}
interface Showable{
	void show();
}
public class Interface_Inheritance implements Printable112,Showable{
	public void print() {System.out.println("Printing ");}
	public void show() {System.out.println("Show");}
	public static void main(String[] args) {
	Interface_Inheritance i=new Interface_Inheritance();
	i.print();
	i.show();
	}
}
