package package_javabasics;

public class StaticMethod 
{
	static void addition()
	{
		int a=50;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void substraction()
	{
		int a=50;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
	}
	
	static void multiplication()
	{
		int a=50;
		int b=20;
		int mul=a*b;
		System.out.println(mul);
	}
	
	static void division()
	{
		int a=50;
		int b=20;
		int div=a/b;
		System.out.println(div);
	}
	
	static void modulus()
	{
		int a=50;
		int b=20;
		int mod=a%b;
		System.out.println(mod);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		addition();
		substraction();
		multiplication();
		division();
		modulus();
	}

}
