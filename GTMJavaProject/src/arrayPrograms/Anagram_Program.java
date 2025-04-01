package arrayPrograms;

import java.util.Arrays;

public class Anagram_Program 
{

	public static void main(String[] args) 
	{
		String s1="spot";
		String s2="stop";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("They are not anagram");
		}
		else
		{
			char []c1=s1.toCharArray();
			char []c2=s2.toCharArray();
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			//boolean answer=Arrays.equals(c1, c2);
			//System.out.println(answer);
			
			if(Arrays.equals(c1, c2)==true)
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
