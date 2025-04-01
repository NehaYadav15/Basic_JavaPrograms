package package_javabasics;

public class MethodOverloading 
{
	void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println("2");
	}
	void add(int a, int b)
	{
		System.out.println("3");
	}
	static void add(int a,int b,int c)
	{
		System.out.println("4");
	}
	static void add(double a,int b)
	{
		System.out.println("5");
	}
	static void add(int b,double a)
	{
		System.out.println("6");
	}

	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(67,78);
		add(87);
		add(98.765987644, 56);
		add(45,65.87699345);
		add(90, 66, 22);

	}

}
