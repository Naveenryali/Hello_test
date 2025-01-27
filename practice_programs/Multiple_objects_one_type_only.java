package practice_programs;
class Rectangle
{
	int length;
	int width;
	void insertvalue(int l,int w)
	{
		length=l;
		width=w;
		
	}
	void display()
	{
		System.out.println(length*width);
	}
}
public class Multiple_objects_one_type_only {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle(),r2= new Rectangle();
		r1.insertvalue(10, 100);
		r2.insertvalue(20, 200);
		
		r1.display();
		r2.display();
	}
}
