package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment_90 
{
    //90.WAP for Upcasting from ArrayList to Collection for Integer.
	public static void main(String[] args) 
	{
		Collection<Integer> a=new ArrayList<Integer>();
		a.add(null);
		a.add(90);
		a.add(78);
		a.add(67);
		a.add(45);
		System.out.println("Objects of Collection a: "+a);

	}

}
