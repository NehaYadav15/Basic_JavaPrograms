package package_javabasics;

public class Reverse_String_using_for_Loop_with_Third_Variable_Palindrome {

	public static void main(String[] args)
	{
		String input="RadaR";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
		char c1=input.charAt(i);
	    output=output+c1;
		}
		System.out.println(input);
		System.out.println(output);
		if(input.equals(output))// Equals checks exact string which is 
			//present or not and gives answer as true or false.
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
