package assertion;

public class AssertKeyword {

	public static void main(String[] args) 
	{
		int age=14;
		assert age>=15;
		assert age>=18:"Age should be greater than 18";
		System.out.println("Go and Vote");
		

	}

}
