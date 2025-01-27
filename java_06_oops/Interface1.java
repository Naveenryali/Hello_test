package java_06_oops;
interface Drawable{
	void draw();
}
class Rectangle implements Drawable
{
	public void draw() {
		System.out.println("Rectangle is drawn");
	}
}
	class Circle implements Drawable{
		public void draw()
		{
			System.out.println("Circle is drawn");
		}
		
		
	}

public class Interface1 {

	public static void main(String[] args) {
		Drawable i=new Circle();
		i.draw();
	}
}
