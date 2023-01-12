package hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
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
		//Collections.sort(hs);
	}

}
