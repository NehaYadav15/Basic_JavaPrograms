package mapConcept;

import java.util.HashMap;
import java.util.Map;

public class Map_Behaviour 
{

	public static void main(String[] args) 
	{
		Map m1=new HashMap();
		m1.put("Name-1", "Neha");
		m1.put("Name-2", "Ram");
		m1.put("Name-3", "Sita");
		m1.put("Name-4", "Bhim");
		m1.put("Name-5", "Laxman");
		System.out.println(m1);
		
		Map<String,String> m2=new HashMap<String,String>();
		m2.put("Name-1", "Nisha");
		m2.put("Name-2", "Shweta");
		m2.put("Name-3", "Anshika");
		m2.put("Name-4", "Varun");
		System.out.println(m2);
		
		Map<String,Integer> m3=new HashMap<String,Integer>();
		m3.put("Ashwi", 78);
		m3.put("Vinayak", 45);
		m3.put("Aradhya", 36);
		m3.put("Arin", 67);
		System.out.println(m3);
		
		Map<String,Integer> m4=new HashMap<String,Integer>();
		m4.put("Arun", 78);
		m4.put("Arun", 78);
		m4.put("Romi", 27);
		m4.putAll(m4);
		m4.putAll(m3);
		m4.remove(m4);
		m4.replace("Vinayak", 45, 67);
		m4.replace("Arin", 34);
		boolean answer=m4.isEmpty();
		System.out.println(answer);
		m4.remove("Ashwi");
		m4.remove("Aradhya", 36);
		System.out.println("After removing Ashwi and Aradhya, the new m4 is: "+m4);
		m4.clear();
		System.out.println("After clearing, m4 is: "+m4);
		
	}

}
