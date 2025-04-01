package hierarchical.level.inheritance;

public class Testcase_3 extends Launch_Browser
{
    void testcase3()
    {
    	System.out.println("Testcase 3 is executing");
    }
	public static void main(String[] args) 
	{
		Testcase_3 t1=new Testcase_3();
		t1.testcase3();
		t1.chrome();
		t1.edge();
		t1.mozilla();
		t1.safari();
		chrome_brower();
		mozilla_brower();
		safari_brower();
		edge_brower();

	}

}
