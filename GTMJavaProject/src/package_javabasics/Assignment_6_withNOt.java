package package_javabasics;

public class Assignment_6_withNOt 
{
	// Create 4 if block and check whether all 4 are false and they are executing or not.

	public static void main(String[] args)
	{
		boolean idCard_office=true;
		String asset_availability="Available";
		char cab_booked='Y';
		float working_hours=9;
		if(!(idCard_office)) 
		{
			System.out.println("Entry Granted");
		}
		if(!(asset_availability=="Available"))
		{
			System.out.println("Good to go");
		}
		if(!(cab_booked=='Y'))
		{
			System.out.println("No need to take uber");
		}
		if(working_hours!=9)
		{
			System.out.println("Eligible for Employee of the Year Award");
		}

	}

}
