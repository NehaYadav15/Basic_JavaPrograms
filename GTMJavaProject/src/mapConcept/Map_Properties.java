package mapConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Properties 
{

	public static void main(String[] args) 
	{
		Map<String,Character> m1=new HashMap<String,Character>();
		m1.put("Ram", 'm');
		m1.put("Sita", 'f');
		m1.put("Laxman", 'f');
		Set<String> s1=m1.keySet();
		System.out.println("Keys are fetched using keySet method: ");
		for(String s2:m1.keySet())
		{
			System.out.println(s2);
		}
		Collection<Character> c1=m1.values();
		System.out.println("Values are fetched using values method: ");
		for(Character c2:m1.values())
		{
			System.out.println(c2);
		}
		Set<Entry<String,Character>> kv=m1.entrySet();
		Iterator<Entry<String,Character>> kv1=kv.iterator();
		System.out.println("Keys and Values are fetched using entrySet method: ");
		while(kv1.hasNext())
		{
			System.out.println(kv1.next());
		}
	    
		

	}

}
