package package_javabasics;

public class Contains_String_Functions 
{

	public static void main(String[] args) 
	{
		String input="Neha Yadav";
		boolean b1=input.contains("Yadav");
//Contains String Function take the partial string value from the input and gives the answer in 
//boolean whether the string which we are comparing is exactly present in actual input or not.
		System.out.println(b1);
        System.out.println(input.equals("NEHA YADAV"));
        System.out.println(input.equalsIgnoreCase("NEHA YADAV"));
	}

}
