package thisCalling.statement;
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
public class ThisCallingStatement extends Inheriting_ThisCalling
{
	ThisCallingStatement()
	{   
		super();
		System.out.println("1");
	}
	ThisCallingStatement(int a)
	{
		this("AT",'a');
		System.out.println("2");
	}
	ThisCallingStatement(String a,char b)
	{
		this(true, 127);
		System.out.println("3");
	}
	ThisCallingStatement(boolean a,int b)
	{
		this();
		System.out.println("4");
	}

	public static void main(String[] args) 
	{
		//new ThisCallingStatement();
		new ThisCallingStatement(768);
		

	}

}
