package com.product;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Product {
	int pid;
	String pname;
	int price;

	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;

	}
}

class SortbyPname implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.pname.compareTo(o2.pname);
	}
}

public class Doing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Product> pl = new LinkedList<Product>();
		pl.add(new Product(12, "led", 12000));
		pl.add(new Product(13, "laptop", 55000));
		pl.add(new Product(14, "tv", 5000));
		Collections.sort(pl, new SortbyPname());
		
		Iterator<Product> it = pl.iterator();
        while(it.hasNext())
        {
        	Product p = it.next();
        	System.out.println(p.pid+" "+p.pname+" "+
        	p.price);
        }
        

	}

}
