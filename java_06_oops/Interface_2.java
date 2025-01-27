package java_06_oops;
interface Blue{
	void print();
}
interface Red extends Blue{
	void print();
}

public class Interface_2 implements Red {
	public void print() {System.out.println("Hi");}
//	public void show() {System.out.println("Hello");}
	public static void main(String[] args) {
		Interface_2 i=new Interface_2();
		i.print();
//		i.show();
	}
		
	

}
