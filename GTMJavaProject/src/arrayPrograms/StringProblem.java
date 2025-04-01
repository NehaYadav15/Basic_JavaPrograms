package arrayPrograms;
public class StringProblem 
{
	static int countofalpha=0;
	static int countofspace=0;
	static int countofnumeric=0;

public static void main(String[] args)
{
 String input="kv no 213 &^%";
 char [] c1=	input.toCharArray();
 
 for(int i=0;i<c1.length;i++)
 {
 	boolean b1=	Character.isAlphabetic(c1[i]); 
	if(b1==true)
	{
		countofalpha++;
	}
	boolean b2=			Character.isWhitespace(c1[i]);
			if(b2==true)
			{
				countofspace++;
			}
			boolean b3=	Character.isDigit(c1[i]); 
			if(b3==true)
			{
				countofnumeric++;
			}
 }
 System.out.println("The total count of alphabets-> "+countofalpha);
 System.out.println("The total count of space -> "+countofspace);
 System.out.println("The total count of numeric -> "+countofnumeric);
 
 int countofspecial=input.length()-(countofnumeric+countofspace+countofalpha);
 System.out.println("The count of special characters-> "+countofspecial);
}
}
