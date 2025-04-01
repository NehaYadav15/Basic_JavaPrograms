package mock.Interview;

public class Program_2 
{
static double pi_value=Math.PI;
	
	public static void main(String[] args) {
		
for(int i=1;i<=5;i++)
{
	double r=Math.random();
	double area= pi_value*r*r;
	
	System.out.println("Area of circle " +area);
	}
	}	
}
