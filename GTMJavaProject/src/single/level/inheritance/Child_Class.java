package single.level.inheritance;
class Parent_Class
{
	static void login()
	{
		System.out.println("Login");
	}
	void logout()
	{
		System.out.println("Logout");
	}
	void sensitiveInfo()
	{
		System.out.println("Sensitive Information present");
	}
}
public class Child_Class extends Parent_Class
{
	void testcase_1()
	{
	   System.out.println("Testcase 1");	
	}
	void testcase_2()
	{
		System.out.println("Testcase 2");
	}

	public static void main(String[] args) 
	{
         Child_Class c1=new Child_Class();
         login();
         c1.testcase_1();
         c1.sensitiveInfo();
         c1.logout();
         
         login();
         c1.testcase_2();
         c1.sensitiveInfo();
         c1.logout();


	}

}
