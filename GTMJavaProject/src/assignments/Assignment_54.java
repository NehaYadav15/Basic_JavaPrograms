package assignments;
abstract class Mansion
{
	abstract void bungalow();
	static void modern_house()
	{
		System.out.println("Modern house");
	}
	abstract void antique_Interior();
	void wood_finish()
	{
		System.out.println("Wood Finish");
	}
}
public class Assignment_54 extends Mansion
{
    void invest()
    {
    	System.out.println("Investing on homes");
    }
	public static void main(String[] args) 
	{
		Assignment_54 a1=new Assignment_54();
		a1.invest();
		a1.bungalow();
		modern_house();
		a1.wood_finish();
		a1.antique_Interior();
	}
	void bungalow() 
	{
		System.out.println("Bungalow");
		
	}
	void antique_Interior() 
	{
		System.out.println("Antique Interior");
		
	}
	

}
