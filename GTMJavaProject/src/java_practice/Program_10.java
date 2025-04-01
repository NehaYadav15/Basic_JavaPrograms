package java_practice;

public class Program_10 {

	public static void main(String[] args) 
	{
		String input="manual";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		System.out.println("Reverse String: "+output);
		

	}

}
