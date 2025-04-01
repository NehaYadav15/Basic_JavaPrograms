package assignments;
interface Google_Chrome 
{
	void chrome();
}
abstract class Microsoft_Edge implements Google_Chrome
{
   	abstract void edge();
}
public class Assignment_61 extends Microsoft_Edge
{
    
	void windows()
	{
		System.out.println("Windows Operating System");
	}
	public static void main(String[] args) 
	{
		 Assignment_61 a1=new Assignment_61();
		 a1.chrome();
		 a1.edge();
         a1.windows();
	}
	public void chrome()
	{
		System.out.println("Chrome browser");	
	}
	void edge() 
	{
	    System.out.println("Edge Browser");	
	}

}
