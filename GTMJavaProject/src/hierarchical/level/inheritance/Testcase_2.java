package hierarchical.level.inheritance;

public class Testcase_2 extends Launch_Browser
{
	void testcase2()
    {
    	System.out.println("Testcase 2 is executing");
    }
	
	public static void main(String[] args) 
	{
		Testcase_2 t2=new Testcase_2();
		t2.testcase2();
		t2.chrome();
		t2.edge();
		t2.mozilla();
		t2.safari();
		chrome_brower();
		mozilla_brower();
		safari_brower();
		edge_brower();

	}

}
