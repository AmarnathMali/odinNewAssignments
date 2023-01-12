package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class SubjectMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> listMarks = new ArrayList<Object>();
		listMarks.add("English");
		listMarks.add(90);
		listMarks.add("Hindi");
		listMarks.add(80);
		
		listMarks.add("Maths");
		listMarks.add(90);
		listMarks.add("Physics");
		listMarks.add(78);
		
		Iterator<Object> obj = listMarks.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		System.out.println(listMarks.contains("Physics"));
		listMarks.remove(1);
		System.out.println();
		
		
		System.out.println(listMarks.get(0));
		
		
	}

}
