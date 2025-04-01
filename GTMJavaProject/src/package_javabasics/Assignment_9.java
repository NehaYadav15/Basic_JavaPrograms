package package_javabasics;

public class Assignment_9 
{
	// 3 non-static methods accessing with 3 different objects:-
	
	void cars()
	{
		System.out.println("Use less personal vehicle for transportation");
	}
	void bike()
	{
		System.out.println("Can use bike");
	}
	void bus()
	{
		System.out.println("Good option as it will avoid traffic and pollution to some extent");
	}

	public static void main(String[] args) 
	{
		System.out.println("This is Main Method");
		
		Assignment_9 a1=new Assignment_9();
		a1.cars();
		
		Assignment_9 a2=new Assignment_9();
		a2.bike();
		
		Assignment_9 a3=new Assignment_9();
		a3.bus();

	}

}
