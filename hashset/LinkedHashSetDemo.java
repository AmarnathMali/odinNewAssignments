package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(21);
		hs.add("dfdf");
		hs.add(true);
		hs.add(null);
		hs.add(null);
		hs.add(34.332);
		System.out.println(hs);
		
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
