package package_javabasics;

public class Assignment_8 
{
	// 3 Static Methods and 2 non-static methods:-
	
	static void oreo()
	{
		System.out.println("Oreo Biscuit");
	}
	void cadbury()
	{
		System.out.println("Cadbury Chocolate");
	}

	public static void main(String[] args) 
	{
		System.out.println("This is Main Method");
		oreo();
		dairymilk();
		muffins();
		
		Assignment_8 a=new Assignment_8();
		a.cadbury();
		a.kitkat();
	}
	static void dairymilk()
	{
		System.out.println("DairyMilk Chocolate");
	}
	static void muffins()
	{
		System.out.println("Muffins");
	}
	void kitkat()
	{
		System.out.println("Kikat chocolate");
	}

}
