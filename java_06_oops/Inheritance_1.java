package java_06_oops;
class Animal
{
	static void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal{
		static void bark()
		{
			System.out.println("Barking");
		}
}
public class Inheritance_1 {
	public static void main(String[] args) {
		
		Dog d=new Dog();
		System.out.println(d);
		Dog.eat();
		Dog.bark();
		
		
		
	}

}
