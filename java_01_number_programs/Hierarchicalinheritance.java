package java_01_number_programs;

class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class fox extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class Cat extends Animal {
	void meow(){
		System.out.println("meowing");
		
	}
	
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Cat c=new Cat();
		fox f=new fox();
		c.eat();
		c.meow();
		f.bark();
		

	}

}
