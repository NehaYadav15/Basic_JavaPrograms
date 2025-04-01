package supercalling.statement;
class Student1
{
	Student1()
	{
		System.out.println("3");
	}
}
class Student2 extends Student1
{
	Student2()
	{
		System.out.println("2");
	}
}
public class Student3 extends Student2
{
    Student3()
    {
    	System.out.println("1");
    }
	public static void main(String[] args) 
	{
		Student3 n1=new Student3();
		

	}

}
