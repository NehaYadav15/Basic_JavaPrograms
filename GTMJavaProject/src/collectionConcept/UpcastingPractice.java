package collectionConcept;

public class UpcastingPractice 
{
	void add()
	{
		System.out.println("Add Method");
	}
	void sub()
	{
		System.out.println("Sub Method");
	}
	static void multiply()
	{
		System.out.println("Multiply Method");
	}

	public static void main(String[] args) 
	{
		Object o1=new UpcastingPractice();
        //After upcasting we will get only properties of parent class.
		
		UpcastingPractice u1=new UpcastingPractice();
		//Here we are creating object of same class, so we will get properties of parent 
		//as well as child
	}

}
