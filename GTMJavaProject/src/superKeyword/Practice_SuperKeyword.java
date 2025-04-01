package superKeyword;
class Parent_Class
{
	void add()
	{
		System.out.println("Do addition of 2 numbers");
	}
}
class Parent_Class_1 extends Parent_Class
{
	void add()
	{ 
		//super.add();
		System.out.println("Do addition of 1 numbers");
	}
}
public class Practice_SuperKeyword extends Parent_Class_1
{
    void add()
    {
    	super.add();
    	System.out.println("Do addition of 3 numbers");
    	//super.add();
    }

	public static void main(String[] args) 
	{
		Practice_SuperKeyword p1=new Practice_SuperKeyword();
		p1.add();

	}

}
