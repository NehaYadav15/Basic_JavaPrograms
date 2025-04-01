package stringClass.Functions;

import java.util.Arrays;

public class String_Function_5 {

	public static void main(String[] args) 
	{
		//1.Lets remove all capital letters from a given string
		String input="Manish Kumar Tiwari";
		String m=input.replaceAll("[A-Z]", "");
		System.out.println(m);
		
		//2.Lets remove all small letters from a given string
		String s="Neha Yadav";
		String s1=s.replaceAll("[a-z]", "");
		System.out.println(s1);
		
		//3.Lets remove all numeric value from a given string
		String b="D P S 01";
		System.out.println(b.replaceAll("[0-9]", ""));
		
		//Split Function---> this method is use to convert given string into array of string--->String[].
		String c="Manish Kumar Tiwari ";
		//It will split the input wherever there is space.
		String [] c1=c.split(" ");
		System.out.println(Arrays.toString(c1));
		
		//Split with 2 parameters
		String d="Manish Kumar Tiwari";
		String [] d1=d.split(" ", 1);
		System.out.println(Arrays.toString(d1));
		String [] d2=d.split(" ", 2);
		System.out.println(Arrays.toString(d2));
		//With the help of split we can convert any string where there is space present into String array.
		
		
		

	}

}
