package CollectionsDemo;

import java.util.Comparator;

public class ImplementingComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return -(str1.compareTo(str2));
	}

}
