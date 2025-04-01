package assignments;
class Chocolate_Class
{
	void whiteChocolate()
	{
		System.out.println("White Chocolate");
	}
	static void darkChocolate()
	{
		System.out.println("Dark Chocolate");
	}
}
class Cake_Class extends Chocolate_Class
{
	void tressLeches()
	{
		System.out.println("Tress Leches");
	}
}
public class Assignment_47 extends Cake_Class
{

	public static void main(String[] args) 
	{
		Assignment_47 a1=new Assignment_47();
		a1.whiteChocolate();
		darkChocolate();
		a1.tressLeches();

	}

}
