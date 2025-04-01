package assignments;
class Inheriting_ThisCalling
{
	Inheriting_ThisCalling()
	{
		this("MKT",'A');
		System.out.println("5");
	}
	Inheriting_ThisCalling(String a, char b)
	{
		System.out.println("6");
	}
}
public class Assignment_49 extends Inheriting_ThisCalling
{

	Assignment_49()
	{   
		super();
		System.out.println("1");
	}
	Assignment_49(int a)
	{
		this("AT",'a');
		System.out.println("2");
	}
	Assignment_49(String a,char b)
	{
		this(true, 127);
		System.out.println("3");
	}
	Assignment_49(boolean a,int b)
	{
		this();
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
		Assignment_49 a1=new Assignment_49(768);

	}

}
