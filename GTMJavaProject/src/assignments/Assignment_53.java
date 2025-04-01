package assignments;
abstract class Property
{
	abstract void land_1();
	static void land_2()
	{
		System.out.println("Land 2 area");
	}
}
public class Assignment_53 extends Property
{
    void invest()
    {
    	System.out.println("Investing on lands");
    }
	public static void main(String[] args) 
	{
		Assignment_53 a1=new Assignment_53();
		a1.land_1();
		a1.invest();
		
        land_2();
        a1.invest();
	}
	void land_1() 
	{
		System.out.println("Land 1 area");
		
	}

}
