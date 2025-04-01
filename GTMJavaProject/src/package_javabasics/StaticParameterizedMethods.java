package package_javabasics;

public class StaticParameterizedMethods 
{
	static void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println("Addition");
	}
	static void subtract(int a,int b)
	{
		System.out.println(a-b);
		System.out.println("Subtraction");
	}
	static void add(String a,char b)
	{
		System.out.println("1");
	}
	static void name(boolean a)
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
		add(76,89);
		subtract(56,45);
		add("NY", 'N');
		name(false);

	}

}
