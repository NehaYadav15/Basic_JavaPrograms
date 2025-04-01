package handling_Exceptions;

public class throw_and_throws_keywords {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NullPointerException
	{
		if(1==1)
		{
			throw new ArrayIndexOutOfBoundsException("Size is less");
		}
		else
		{
			throw new NullPointerException("Cell is Empty");
		}

	}

}
