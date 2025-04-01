package abstractClasses.methods;
abstract class Amazon_1
{
	abstract void login();// needs to be overridden.
	abstract void logout();// needs to be overridden.
}
abstract class Amazon_2 extends Amazon_1
{
	abstract void twowayauth();// needs to be overridden.
	abstract void otp();// needs to be overridden.
	void cart()// can be overridden.
	{
		System.out.println("Added to cart");
	}
	static void addToWishlist()// cann't be overridden.
	{
		System.out.println("Added to wishlist");
	}
}
public class Amazon_Program extends Amazon_2
{
    
	public static void main(String[] args) 
	{
		Amazon_Program g1=new Amazon_Program();
		g1.cart();
		g1.otp();
		g1.login();
		g1.logout();
		g1.twowayauth();
		addToWishlist();

	}

	void twowayauth() 
	{
		System.out.println("Two Step Authentication");	
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
