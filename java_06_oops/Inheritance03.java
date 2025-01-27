package java_06_oops;

class Animal1{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Cat extends Animal1
{
	void meow()
	{
		System.out.println("Meow");
	}
}
public class Inheritance03 {

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.meow();
		c.eat();
	}
}
