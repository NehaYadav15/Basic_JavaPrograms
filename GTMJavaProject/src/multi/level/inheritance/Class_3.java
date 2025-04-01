package multi.level.inheritance;
import inheritance.One;
public class Class_3 extends Class_2
{
	void mod()
	{
		System.out.println("This is mod method");
	}

	public static void main(String[] args) 
	{
		Class_3 c1=new Class_3();
		c1.add();
		sub();
		c1.mul();
		c1.mod();
		div();
		//c1.a();
		//b();

	}

}
