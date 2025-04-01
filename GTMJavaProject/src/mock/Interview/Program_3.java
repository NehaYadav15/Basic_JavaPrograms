package mock.Interview;

import java.util.Arrays;

public class Program_3 {

	public static void main(String[] args) 
	{
		String a="spot";
		String b="stop";
		if(a.length()!=b.length())
		{
			System.out.println("It is not an anagram");
		}
		else
		{
			char []a1=a.toCharArray();
			char []b1=b.toCharArray();
			System.out.println("Before Soting");
			System.out.println(Arrays.toString(a1));
			System.out.println(Arrays.toString(b1));
			
			Arrays.sort(a1);
			Arrays.sort(b1);
			System.out.println("After sorting");
			System.out.println(Arrays.toString(a1));
			System.out.println(Arrays.toString(b1));
			
			if(Arrays.equals(a1, b1))
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
