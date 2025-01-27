package java_06_oops;
class Drawing
{
	void draw()
	{
		System.out.println("drawing");
	}
}
class Rectangle1 extends Drawing
{
	void drawing() {
		System.out.println("Drawing rectangle");
	}
}
class Circle1 extends Rectangle1
{
	void draw()
	{
		System.out.println("circle is drawing");
	}
}
public class Inheritance02 {
	
	

	public static void main(String[] args) {
		
	Circle1 d=new Circle1();
	
	
	d.draw();
	d.draw();
	d.drawing();
	


		
		
	}
}
