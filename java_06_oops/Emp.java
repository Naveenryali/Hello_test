package java_06_oops;
  class Address{
	
	String city,state,country;
	
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
		
	}
 }
	public class Emp {
		
		int id;
		String name;
		Address address;
		public Emp(int id,String name,Address ad)
		{
			this.id=id;
			this.name=name;
			this.address=ad;
			
			
		}
		void display()
		{
			System.out.println(id+" "+name);
			System.out.println(address.city+" "+address.state+" "+address.country);
		}
		
		public static void main(String[] args) {
			
			Address ad1=new Address("vizag","AP","India");
			Address ad2=new Address("Vizanagaram","AP","India");
		
			Emp e1=new Emp(1,"sai",ad1);
			Emp e2=new Emp(2,"Vanket",ad2);
			
			e1.display();
			e2.display();
		
	
}
	}
