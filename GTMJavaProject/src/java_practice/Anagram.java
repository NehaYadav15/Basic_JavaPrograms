package java_practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String a="eat";
		String b="tea";
		if(a.length()!=b.length())
		{
			System.out.println("It is not an anagram");
		}
		else
		{
			char []a1=a.toCharArray();
			char []b1=b.toCharArray();
			System.out.println("Befoe Sorting");
			System.out.println(Arrays.toString(a1));
			System.out.println(Arrays.toString(a1));
			
			Arrays.sort(a1);
			Arrays.sort(b1);
			System.out.println("After Sorting");
			System.out.println(Arrays.toString(a1));
			System.out.println(Arrays.toString(b1));
			if(Arrays.equals(a1, b1)==true)
			{
				System.out.println("It is an anagram");
			}
			else
			{
				System.out.println("It is not an anagram");
			}
		}

	}

}
