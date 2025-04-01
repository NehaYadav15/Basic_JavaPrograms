package multiple.Level.Inheritance;
interface Android
{
	void chromeBrowser();
}
interface IOS
{
	void chromeBrowser();
}
public class Google_Application implements Android,IOS
{

	public static void main(String[] args) 
	{
		Google_Application g1=new Google_Application();
		g1.chromeBrowser();

	}
	public void chromeBrowser() 
	{
		System.out.println("Chrome browser is working perfectly in both the browsers");
		
	}

}
