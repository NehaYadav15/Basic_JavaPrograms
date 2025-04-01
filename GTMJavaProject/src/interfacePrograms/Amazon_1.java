package interfacePrograms;
interface Google_auth
{
	void add();
	void subtract();
}
abstract class Amazon_one implements Google_auth
{
	abstract void cart();
	static void wishlist()
	{
		System.out.println("Exposing some logic");
	}
}
public class Amazon_1 extends Amazon_one
{

	public static void main(String[] args) 
	{
		Amazon_1 a1=new Amazon_1();
		a1.add();
		a1.subtract();
		a1.cart();
		wishlist();
	}

	public void add() 
	{
		System.out.println("Logic of add method");
	}

	public void subtract() 
	{
	    System.out.println("Logic of subtract method");	
	}

	void cart() 
	{
		System.out.println("Logic of cart method");
	}

}
