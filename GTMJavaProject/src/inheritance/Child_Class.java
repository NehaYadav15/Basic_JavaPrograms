package inheritance;

class Parent_Class
{
	static void login()
	{
		System.out.println("This is login code");
	}
	 void logout()
	{
		System.out.println("This is logout code");
	}
	 void sensitive_Info()
	{
		System.out.println("This is sensitive information code");
	}
}
public class Child_Class extends Parent_Class
{

	 void testcase_1()
	{
		System.out.println("This is testcase 1 code");
	}
	static void testcase_2()
	{
		System.out.println("This is testcase 2 code");
	}
	public static void main(String[] args) 
	{
	   Child_Class c1=new Child_Class();
	   login();
       c1.testcase_1();
       c1.sensitive_Info();
       c1.logout();
       
       c1.login();
       c1.testcase_2();
       c1.sensitive_Info();
       c1.logout();
	}

}
