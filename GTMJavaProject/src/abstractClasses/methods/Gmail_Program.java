package abstractClasses.methods;
abstract class Gmail_1
{
	abstract void login();// needs to be overridden.
	abstract void logout();// needs to be overridden.
}
abstract class Gmail_2 extends Gmail_1
{
	abstract void twowayauth();// needs to be overridden.
	abstract void otp();// needs to be overridden.
	void allInboxes()// can be overridden.
	{
		System.out.println("this is inbox methods");
	}
	static void drafts()// cann't be overridden.
	{
		System.out.println("This is drafts method");
	}
}
public class Gmail_Program extends Gmail_2
{
    
	public static void main(String[] args) 
	{
		Gmail_Program g1=new Gmail_Program();
		g1.allInboxes();
		g1.otp();
		g1.login();
		g1.logout();
		g1.twowayauth();
		drafts();

	}

	void twowayauth() 
	{
		System.out.println("Provide authentication");	
	}

	void otp() 
	{
		System.out.println("This is your OTP");
	}

	void login() 
	{
		System.out.println("You have successfully logged in");
	}

	void logout() 
	{
		System.out.println("You have successfully logged out");
	}

}
