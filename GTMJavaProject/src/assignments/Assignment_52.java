package assignments;
abstract class Volkswagen_Automobile
{
	abstract void virtus();
	abstract void taigun();
}
public class Assignment_52 extends Volkswagen_Automobile
{
	static void cars_dealers()
	{
		System.out.println("Cars dealership to India");
	}
    public static void main(String[] args) 
    {
		Assignment_52 a1=new Assignment_52();
		cars_dealers();
		a1.virtus();
		
		cars_dealers();
		a1.taigun();
		
	}
	void virtus() 
	{
		System.out.println("Virstus cars");
		
	}
	void taigun() 
	{
		System.out.println("Taigun cars");
		
	}
}
