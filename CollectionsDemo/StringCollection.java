package CollectionsDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingComparator comObj = new ImplementingComparator();
		Set<String> setObj = new TreeSet<String>(comObj); 
		setObj.add("Rama");
		setObj.add("sahil");
		setObj.add("gopal");
		setObj.add("jagadish");
		setObj.add("zebra");
		setObj.add("Krish");
		
		Iterator<String> obj = setObj.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
	}

}
