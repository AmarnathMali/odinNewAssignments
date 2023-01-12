package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class SignUp implements Comparator<SignUp>{
	String firstName;
	String LastName;
	String gender;
	long mobileNo;
	public SignUp(String firstName, String lastName, String gender, long mobileNo) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.gender = gender;
		this.mobileNo = mobileNo;
	}
//	@Override
//   public int compareTo(SignUp o) {
//		if(mobileNo == o.mobileNo) {
//			return 0;
//		}
//	
//		else if(mobileNo > o.mobileNo) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
	@Override
	public int compare(SignUp o1, SignUp o2) {
		// TODO Auto-generated method stub
	if(o1.mobileNo == o2.mobileNo)return 0;
	else if(o1.mobileNo > o2.mobileNo) return 1;
	else return -1;
	}
	
	
}
class Sortbymobileno implements Comparator<SignUp>{

	@Override
	public int compare(SignUp o1, SignUp o2) {
		// TODO Auto-generated method stub
		return o1.firstName.compareTo(o2.firstName);
	}
	
}

public class ArrayListWithRealObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<SignUp> al = new ArrayList<>();
	    al.add(new SignUp("Rohit","Sharma","male",9876654327l));
        al.add(new SignUp("Shreya","Mali","female",8698023174l));
        al.add(new SignUp("amar","mali","male",908897787l));
        al.add(new SignUp("Amar","mali","male",9876543245l));
    
        Collections.sort(al,new Sortbymobileno());
        
        Iterator<SignUp> it = al.iterator();
        while(it.hasNext()) {
        	SignUp s = it.next();
        	System.out.println(s.firstName+" "+s.LastName+" "+s.gender+" "+s.mobileNo);
        }
	}

}
