package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapWithGeneric {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "sunday");
		hm.put(2, "mon");
		hm.put(3, "may");
		hm.put(4, null);
		hm.put(7, null);
		
		System.out.println(hm);
		
		hm.remove(null);

		System.out.println(hm);
		
		hm.replace(4, "rama");
		HashMap<Integer,String> hm1 = new HashMap<Integer, String>();
		hm1.put(56,"first");
		hm1.put(67,"second");
		hm1.putAll(hm);
		
		System.out.println(hm1);
		
		Set s = hm1.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
		   Map.Entry<Integer, String> me = (Entry) it.next();
		   System.out.println(me.getKey()+" "+me.getValue());
		}
		for(Object o:hm.entrySet())
		{
		System.out.println(o);
		}



	}

}
