package array.Concept;

import java.util.Arrays;

public class Anagram_Program 
{

	public static void main(String[] args) 
	{
		String a="eat";
		String b="tea";
		if(a.length()!=b.length())
		{
			System.out.println("It is not a anagram");
		}
		else
		{
			char []a3=a.toCharArray();
			char []b3=b.toCharArray();
			System.out.println(Arrays.toString(a3));
			System.out.println(Arrays.toString(b3));
			
			Arrays.sort(a3);
			Arrays.sort(b3);
			System.out.println("After Sorting--->");
			System.out.println(Arrays.toString(a3));
			System.out.println(Arrays.toString(b3));
			
			if(Arrays.equals(a3, b3)==true)
			{
				System.out.println("They are anagram");
			}
			else
			{
				System.out.println("They are not anagram");
			}
		}
		

	}

}
