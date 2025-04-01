package package_javabasics;

public class Assignment_5 
{
	// Call static method in main method and perform -,+,/,*,%
	
	static void mod()
	{
		int a=60; int b=20;
		int mod=a%b;
		System.out.println(mod);
	}

	public static void main(String[] args) 
	{
	 System.out.println("This is a main method");
	 add();
	 substract();
	 div();
	 multiply();
	 mod();
		
	}
	static void add()
	{
		int a=60; int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	static void substract()
	{
		int a=60; int b=20;
		int sub=a-b;
		System.out.println(sub);
	}
	static void multiply()
	{
		int a=60; int b=20;
		int mul=a*b;
		System.out.println(mul);
	}
	static void div()
	{
		int a=60; int b=20;
		int div=a/b;
		System.out.println(div);
	}

}
