package package_javabasics;

public class Reverse_String_using_for_Loop {

	public static void main(String[] args)
	{
		String input="Automation";
		for(int i=input.length()-1;i>=0;i--)
		{
		char c1=input.charAt(i);// charAt is used to reverse the string and 
		//print just 1 character if for loop is not used.
		//This is not the way in which we should print the answer as 
		//we are generating answer in char format. We should generate answer in string format.
		System.out.println(c1);
		}
	}

}
