package practice_programs;

public class Constructor_2 {

	int x=11;
	
	String b="jhgv";
	Constructor_2(){}
	
	Constructor_2(int a,String b){
		
	this.x=a;
	this.b=b;
		
		System.out.println(this.x+" "+this.b);
	}
	public static void main(String[] args) {
		
		
	//	Constructor_2 cn=new Constructor_2(12,"DDL");
		Constructor_2 c=new Constructor_2();
		System.out.println(c.x+" "+c.b);
		
	}
	
}
