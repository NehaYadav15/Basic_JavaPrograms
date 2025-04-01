package assignments;
class Factory_Class
{
	static void chocolate()
	{
		System.out.println("Cadbury Dairy Milk");
	}
	void biscuit()
	{
		System.out.println("Oreo Biscuit");
	}
}
public class Assignment_46 extends Factory_Class
{

	void sales()
	{
		System.out.println("Sales value");
	}
	public static void main(String[] args) 
	{
		Assignment_46 a1=new Assignment_46();
		chocolate();
		a1.sales();
		
		a1.biscuit();
		a1.sales();

	}

}
