package package_javabasics;

public class Assignment_6 
{

	public static void main(String[] args) 
	{
		// Create 4 if block and check whether all 4 are true and are executing or not.
		// Example of Office going people.
		
		boolean idCard_office=true;
		String asset_availability="Available";
		char cab_booked='Y';
		int working_hours=9;
		if(idCard_office) /* Value of idCard_office is true. So we do not need to compare here. (true==true) will result same as (true).
			If block will execute.*/
		{
			System.out.println("Entry Granted");
		}
		if(asset_availability=="Available")
		{
			System.out.println("Good to go");
		}
		if(cab_booked=='Y')
		{
			System.out.println("No need to take uber");
		}
		if(working_hours>=9)
		{
			System.out.println("Eligible for Employee of the Year Award");
		}
		

	}

}
