package supercalling.statement;
class Super_Calling_Statement1
{
	Super_Calling_Statement1()
	{
		System.out.println("Calling constructor 2");
	}
}
public class Super_Calling_Statement extends Super_Calling_Statement1
{
	Super_Calling_Statement()
	{
		System.out.println("Calling constructor 1");
	}
	
	public static void main(String[] args) 
	{
		Super_Calling_Statement n1=new Super_Calling_Statement();

	}

}
