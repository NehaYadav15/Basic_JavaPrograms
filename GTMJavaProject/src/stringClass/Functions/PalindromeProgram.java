package stringClass.Functions;

public class PalindromeProgram 
{

	public static void main(String[] args) 
	{
		String input="mom";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		System.out.println("Input is: "+input);
		System.out.println("Output is: "+output);
		
		if(input.equals(output))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}

	}

}
