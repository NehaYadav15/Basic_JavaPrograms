package assignments;
abstract class HP_Laptops
{
	void pavilion()
	{
		System.out.println("HP Pavilion Laptops");
	}
	static void spectre()
	{
		System.out.println("HP Spectre Laptops");
	}
	void victus()
	{
		System.out.println("HP Victus Laptops");
	}
	static void envy()
	{
		System.out.println("HP Envy Laptops");
	}
}
public class Assignment_56 extends HP_Laptops
{

	public static void main(String[] args) 
	{
		Assignment_56 a1=new Assignment_56();
		spectre();
		a1.pavilion();
		a1.victus();
		a1.envy();

	}

}
