package java_01_number_programs;

class Pet{
	void eat(){
		System.out.println("eating");
		
	}}
	class Do extends Pet{
		void bark() {
			System.out.println("barking");
		}}
		class Babydog extends Do{
			void weep() {
				System.out.println("weeping");
			}
			
		}



public class Multilevel_inheritance {

	public static void main(String[] args) {
		Babydog b=new Babydog();
		b.weep();
		
		b.bark();
		
		b.eat();
	}

}
