package stringClass.Functions;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String input="auto";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			System.out.print(c);
		}
			

	}

}
