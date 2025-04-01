package package_javabasics;

public class ConstructorOverloading 
{
	public ConstructorOverloading() 
	{
		System.out.println("Constructor 1");
	}
	public ConstructorOverloading(String name)
	{
		System.out.println("Constructor 2");
		System.out.println(name);
	}
	public ConstructorOverloading(String name,char gender)
	{
		System.out.println("Constructor 2");
		System.out.println(name+" "+gender);
	}

	public static void main(String[] args) 
	{
		ConstructorOverloading c1=new ConstructorOverloading();
		ConstructorOverloading c2=new ConstructorOverloading("Neha");
		ConstructorOverloading c3=new ConstructorOverloading("Neha",'F');

	}

}
