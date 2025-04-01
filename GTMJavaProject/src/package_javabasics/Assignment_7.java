package package_javabasics;

public class Assignment_7 
{
	// Create 4 if block and check whether all 4 are false and are executing or not.
	// Example of Cars.

	public static void main(String[] args) 
	{
		String vehicle_type="Hatchback";
		int yearOfProduction=2018;
		double price=2100000.54657;
		char airbag_availability='Y';
		if(vehicle_type=="Sedan")
		{
			System.out.println("Good Choice");
		}
		if(yearOfProduction>=2024)
		{
			System.out.println("Satisfy the New Era of the Market");
		}
		if(price<1800000.00)
		{
			System.out.println("Got in very good price");
		}
		if(airbag_availability!='Y')
		{
			System.out.println("Pay more to get Airbags");
		}
			

	}

}
