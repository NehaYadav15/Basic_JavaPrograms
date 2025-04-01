package package_javabasics;

public class Matches_String_Function 
{

	public static void main(String[] args) 
	{
		String name="Neha Yadav";
		boolean b1=name.matches("..........");
		System.out.println(b1);
		boolean b2=name.matches("Ne(.*)");
        System.out.println(b2);
        boolean b3=name.matches("(.*)ha");
        System.out.println(name.matches("(.*)Yadav(.*)"));
	}

}
