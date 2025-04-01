package java_practice;
class Amazon
{
	private String emailid="contact@grotechminds";
	
	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
}

public class Program_11 {

	public static void main(String[] args) 
	{
		Amazon a1=new Amazon();
		a1.setEmailid("mkt@gmail.com");
		System.out.println(a1.getEmailid());

	}

}
