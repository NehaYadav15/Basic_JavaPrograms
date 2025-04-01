package interfacePrograms;
interface API
{
   void apikey();	
}
public class Amazon implements API
{
	public void apikey() 
	{
		System.out.println("Logic of API key");
		
	}
	public static void main(String[] args) 
	{
		Amazon a1=new Amazon();
		a1.apikey();

	}
	
	

}
