package practice_programs;
class Name
{
	 int id;
	 String name;
	 static void data(int id,String name)
	{
//		name=name;
//		id=id;
		System.out.println(name+" "+id);
//		return 0;
		
	}
}
public class Static2 {
	public static void main(String[] args) {
		Name.data(1,"Naveen");
	//	Name n=new Name();
//		n.data(1, "Naveen");
	}

}
