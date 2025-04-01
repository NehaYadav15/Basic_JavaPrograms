package handling_Exceptions;

public class Exception_Handling {

	public static void main(String[] args) 
	{
		int a=1;
		int b=0;

		try
		{
			int c=a/b;
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled the exception");
		}
		finally
		{
			System.out.println("Program executing successfully");
		}

	}

}
