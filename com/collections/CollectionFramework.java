package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add("string");
		ll.add('m');
		ll.add(32.323f);
		ll.add(2134);
		ll.add(false);
		
		System.out.println(ll);
		
		ll.add(90);
		System.out.println(ll.get(2));
		System.out.println(ll.size());
		System.out.println(ll);
		ll.remove("string");
		System.out.println(ll);
		ll.set(0, 1000);
		System.out.println(ll);
		
		
		LinkedList list2 = new LinkedList();
		list2.add(23);
		list2.add(45);
		System.out.println(list2);
		ll.addAll(list2);
		Iterator it = ll.iterator();
		System.out.println("forward ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator litr = ll.listIterator();
		System.out.println("forward direction");
		while(litr.hasNext())
		{
		Object o = litr.next();
		System.out.println(o);
		}
		System.out.println("backward direction");
		while(litr.hasPrevious())
		{
		Object o = litr.previous();
		System.out.println(o);
		}



	}

}
