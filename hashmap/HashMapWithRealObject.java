package hashmap;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int eid;
	String ename;
	double salary;
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
}

public class HashMapWithRealObject {

	public static void main(String[] args) {
		
		HashMap<Integer,Employee> hm = new HashMap<>();
		hm.put(1,new Employee(123,"sharma",34546.565));
		hm.put(4,new Employee(124,"rohit",76778.565));
		hm.put(3,new Employee(125,"kumar",89899.565));

		
		for(Map.Entry<Integer,Employee> m : hm.entrySet()) {
			Employee e = m.getValue();
			System.out.println(e.eid+" "+ e.ename+" "+ e.salary);
		}

	}

}
