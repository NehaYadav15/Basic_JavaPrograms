package java_practice;

public class Program_8 
{
    static int countOfAlpha=0;
    static int countOfNumeric=0;
    static int countOfSpace=0;
	
	public static void main(String[] args) 
	{
		String a="DPS Korba 12*";
		char []a1=a.toCharArray();
		
		for(int i=0;i<a.length();i++)
		{
			if(Character.isAlphabetic(a1[i])==true)
			{
				countOfAlpha++;
			}
			if(Character.isDigit(a1[i])==true)
			{
				countOfNumeric++;
			}
			if(Character.isWhitespace(a1[i])==true)
			{
				countOfSpace++;
			}
		}
		System.out.println("The count of alphabets are: "+countOfAlpha);
		System.out.println("The count of numerics are: "+countOfNumeric);
		System.out.println("The count of spaces are: "+countOfSpace);
		
		int countOfSpecialCharacters=a1.length-(countOfAlpha+countOfNumeric+countOfSpace);
		System.out.println("Count of Special Characters are: "+countOfSpecialCharacters);

	}

}
