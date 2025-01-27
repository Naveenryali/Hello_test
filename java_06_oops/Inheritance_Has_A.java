package java_06_oops;
class Address1
{
	int pin;
	String city;
	String area;
	Address1(int pin,String city,String area)
	{
		this.pin=pin;
		this.city=city;
		this.area=area;
	}
}
	class Employee{
		
		int id;
		String name;
		Address1 address;
		Employee(int id,String name,Address1 address)
		{
			this.id=id;
			this.name=name;
			this.address=address;
		}
		void display()
		{
			System.out.println(id+" "+ name);
			System.out.println((address.pin+" "+address.city+ " "+address.area));
		}
	}
	

public class Inheritance_Has_A {

	public static void main(String[] args) {
		
		Address1 add=new Address1(1,"up","twin tower");
		
			Employee e=new Employee(12,"Naveen",add);
		
		e.display();
	}
}
