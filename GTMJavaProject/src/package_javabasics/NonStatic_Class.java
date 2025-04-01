package package_javabasics;

public class NonStatic_Class 
{
	void add()
	{
		System.out.println("Addition....");
	}
	void sub()
	{
		System.out.println("Subtraction....");
	}

	public static void main(String[] args) 
	{
		NonStatic_Class n1=new NonStatic_Class();
		// This is the syntax to create an object.
		n1.add();
		n1.sub();
		new NonStatic_Class().add();
		new NonStatic_Class().sub();

	}

}
