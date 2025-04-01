package stringClass.Functions;

public class TakeInput_MyNameIsNehaAndREmoveAllSpaces 
{

	public static void main(String[] args) 
	{
		String a="My name is Neha";
		String a1=a.replaceAll("\\s", "");
		System.out.println(a1);

	}

}
