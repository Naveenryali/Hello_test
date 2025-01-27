package practice_programs;

class Account
{
	int acc_no;
	String name;
	float amount;
	
	void insert(int acc,String n,float amt)
	{
		acc_no=acc;
		name=n;
		amount=amt;
	}
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println("deposited = "+amt);
	}
	void withdrawl(float amt)
	{
		if(amount<amt)
		{
			System.out.println("Insufficient funds");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+" withdrawl");
		}
	}
	void checkBalance()
	{
		System.out.println("Account balance  = "+amount);
	}
}
public class Account_withdrawl_example {
	public static void main(String[] args) {
		
		Account a=new Account();
		
		a.insert(12345678, "naveen", 20000);
		a.deposit(2000);
		a.withdrawl(7500);
		a.checkBalance();
		
		
		
	}

}
