package java_06_oops;
abstract class Phone
{
	abstract void model(); 
}
class Telephone extends Phone
{
	 void model()
	{
		System.out.println("Phone models = Vivo,IQOO,Samsung,realme");
	}
}
public class Abstraction01 {
	public static void main(String[] args) {
		Telephone t=new Telephone();
		t.model();
	}

}
