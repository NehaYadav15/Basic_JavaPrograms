package assignments;
abstract class Google
{
	abstract void coding_round();
	static void interview_round_1()
	{
		System.out.println("Selected in interview round 1");
	}
	abstract void interview_round_2();
	abstract void hr_round();
	
}
public class Assignment_55 extends Google
{
    void job()
    {
    	System.out.println("Selected in Google");
    }
	public static void main(String[] args) 
	{
		Assignment_55 a1=new Assignment_55();
		a1.coding_round();
		interview_round_1();
		a1.interview_round_2();
		a1.hr_round();
		a1.job();
		
	}
	void coding_round() 
	{
		System.out.println("Selected in coding round");
		
	}
	void interview_round_2() 
	{
		
		System.out.println("Selected in interview round 2");
	}
	void hr_round() 
	{
		System.out.println("Selected in HR round");
		
	}
	
}
