package handling_Exceptions;

public class Exception_Handling_3_try_and_catch {

	public static void main(String[] args) //ArrayIndexOutOfBoundsException
	{
		try
		{
			int rollno[]=new int[2];
			rollno[0]=34;
			rollno[1]=45;
			rollno[2]=23;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Logic 1");
		}
		catch(NullPointerException a2)
		{
			System.out.println("Logic 2");
		}

	}

}
