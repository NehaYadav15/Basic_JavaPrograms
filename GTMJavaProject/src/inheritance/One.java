package inheritance;

public class One extends Two
{
    void a()
    {
    	System.out.println("This is method a");
    	int a=987;
    	System.out.println("Value of a is: "+a);
    }
    static void b()
    {
    	System.out.println("This is method b");
    	int a=93;
    	int b=65;
    	System.out.println("Value of a is: "+a);
    	System.out.println("Value of a is: "+b);
    }
	public static void main(String[] args) 
	{
		b();
		d();
		One n1=new One();
		n1.a();
		n1.c();

	}

}
