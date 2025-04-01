package abstractClasses.methods;
abstract class Amazon_API
{
	abstract void login();
	abstract void registeration();
}
public class Amazon_Logic extends Amazon_API
{

	public static void main(String[] args) 
	{
		Amazon_Logic a1=new Amazon_Logic();
		a1.login();
        a1.registeration();
	}

	
	void login() 
	{
		System.out.println("Logic for login");
		
	}

	void registeration() 
	{
		System.out.println("Logic for registeration");
		
	}

}
