package hierarchical.level.inheritance;

public class Testcase_1 extends Launch_Browser
{
	void testcase1()
    {
    	System.out.println("Testcase 1 is executing");
    }

	public static void main(String[] args) 
	{
		Testcase_1 t3=new Testcase_1();
		t3.testcase1();
		t3.chrome();
		t3.edge();
		t3.mozilla();
		t3.safari();
		chrome_brower();
		mozilla_brower();
		safari_brower();
		edge_brower();

	}

}
