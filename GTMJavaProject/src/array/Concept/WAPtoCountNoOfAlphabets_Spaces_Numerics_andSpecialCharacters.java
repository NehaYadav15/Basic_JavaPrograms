package array.Concept;

public class WAPtoCountNoOfAlphabets_Spaces_Numerics_andSpecialCharacters 
{
         static int countOfAlpha=0;
         static int countOfSpace=0;
         static int countOfNumeric=0;
	public static void main(String[] args) 
	{
		String a="Neha 123*";
		char []a1=a.toCharArray();
		
		for(int i=0;i<a1.length;i++)
		{
			boolean b1=Character.isAlphabetic(a1[i]);
			if(b1==true)
			{
				countOfAlpha++;
			}
			boolean b2=Character.isWhitespace(a1[i]);
			if(b2==true)
			{
				countOfSpace++;
			}
			if(Character.isDigit(a1[i])==true)
			{
				countOfNumeric++;
			}
		}
		System.out.println("The total count of alphabets-> "+countOfAlpha);
		System.out.println("The total count of spaces-> "+countOfSpace);
		System.out.println("The total count of numeric-> "+countOfNumeric);
     int countOfSpecialCharacters=a1.length-(countOfAlpha+countOfSpace+countOfNumeric);
     System.out.println("The total count of special characters-> "+countOfSpecialCharacters);
     
	}

}
