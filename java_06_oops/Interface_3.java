package java_06_oops;

 interface Laptop
 {
	 public void copy();
	 public void paste();
	 public void security();
	 
 }
 class Apple implements Laptop
 {
	public void copy() {
		
		System.out.println("Copy code");
	}

	public void paste() {
		System.out.println("Paste code");
	}

	public void security() {
		
		System.out.println("Security code");
	}
	 
 }
public class Interface_3 {
public static void main(String[] args) {
	
	Apple a=new Apple();
	
	a.copy();
	
}

}
