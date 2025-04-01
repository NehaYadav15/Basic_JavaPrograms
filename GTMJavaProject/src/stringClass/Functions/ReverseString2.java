package stringClass.Functions;

public class ReverseString2 
{

	public static void main(String[] args) 
	{
		String input="auto";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		System.out.print(output); 	

	}

}
