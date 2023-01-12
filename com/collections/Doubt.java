package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

class Real{
	String name;
	int year;
	int price;
	public Real(String name, int year, int price) {
		super();
		this.name = name;
		this.year = year;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}


	


public class Doubt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Real> ll = new LinkedList();
		ll.add(new Real("amar",2022,12222));
		ll.add(new Real("laxman",2132,898732));
		
		ArrayList<Real> al= new ArrayList<>(ll);
		for(Real r : al) {
			System.out.println(r.name+" "+r.price+" "+r.year);
		}

	}

}
