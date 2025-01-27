package taskprograms;

public class Staticandnonstatic {
	
	public void car(int mini) {
		System.out.println("Brand value of mini"+ " "+mini);
	}
	public static void bus(int tata) {
		System.out.println("Brand value of tata"+" "+tata);
	}

	public static void main(String[] args) {
		Staticandnonstatic	 c=new Staticandnonstatic();
		
		c.car(100);
		bus(2);
	}

}
