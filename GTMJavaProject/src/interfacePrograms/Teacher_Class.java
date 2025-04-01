package interfacePrograms;
interface Student_1
{
	void studyingJava();
	
}
interface Student_2
{
	void studyingSelenium();
	
}
public class Teacher_Class implements Student_1,Student_2
{
    public void studyingJava()
    {
    	System.out.println("Studying Java");
    }
    public void studyingSelenium()
    {
    	System.out.println("Studying Selenium");
    }
    static void teach()
    {
    	System.out.println("Teaching Java and Selenium");
    }
	
	public static void main(String[] args) 
	{
		Teacher_Class t1=new Teacher_Class();
		teach();
		t1.studyingJava();
		
		teach();
		t1.studyingSelenium();

	}

}
