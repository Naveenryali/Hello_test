package java_06_oops;
class Bank
{
	private long acc_no;
	private String  name,email;
	private float amt;
	public long getAccountNumber()
	{
		return acc_no;
	}
	public void setAccountNumnber(long acc_no)
	{
		this.acc_no=acc_no;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public float getAmount()
	{
		return amt;
	}
	public void setAmount(float amt)
	{
		this.amt=amt;
	}
}
public class Encapsulation2 {
public static void main(String[] args) {
	Bank b=new Bank();
	b.setAccountNumnber(919441361);
	b.setName("Naveen");
	b.setEmail("naveenryalinr@gmail.com");
	b.setAmount(100000f);
	System.out.println(b.getAccountNumber()+" "+b.getName()+" "+b.getEmail()+" "+b.getAmount());
}
}
