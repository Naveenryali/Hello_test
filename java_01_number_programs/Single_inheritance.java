package java_01_number_programs;

	class animals{
		void eat()
		{
			System.out.println("eating");
		}
	}
	class Dog extends animals
	{
	 void bark()
	 {
		 System.out.println("barking");
	 }
	}

public class Single_inheritance {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();

	}

}
