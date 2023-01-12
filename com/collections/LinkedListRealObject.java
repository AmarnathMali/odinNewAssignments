package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

class LSignup
{
String firstName,lastName,gender;
long mobilenumber;
public LSignup(String firstName, String lastName, String gender, long mobilenumber) {
//super();
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.mobilenumber = mobilenumber;
}

}

public class LinkedListRealObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<LSignup> al = new LinkedList();
		al.add(new LSignup("rahul","sharma","male",9585858589l));
		al.add(new LSignup("divya","sri","female",9858557558l));
		al.add(new LSignup("anu","sree","female",7565664646l));
		al.add(new LSignup("rahul","sharma","male",9585858589l));

		Iterator<LSignup> it = al.iterator();
		while(it.hasNext())
		{
		LSignup s = it.next();
		System.out.println(s.firstName+" "+s.lastName+" "+
		s.gender+" "+s.mobilenumber);
		}
		System.out.println(al.size());
		

		


	}

}
