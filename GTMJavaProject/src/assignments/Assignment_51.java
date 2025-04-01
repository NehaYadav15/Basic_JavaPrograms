package assignments;
class Super_Calling_Statement1
{
	Super_Calling_Statement1()
	{
		System.out.println("Calling constructor 1");
	}
}
class Super_Calling_Statement2 extends Super_Calling_Statement1
{
	Super_Calling_Statement2()
	{
		System.out.println("Calling constructor 2");
	}
}
public class Assignment_51 extends Super_Calling_Statement2
{

	Assignment_51()
	{
		System.out.println("Constructor of Assignment_51");
	}
	public static void main(String[] args) 
	{
		 Assignment_51 a1=new Assignment_51();

	}

}
