package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> al = new ArrayList();
		List<Integer> al = new ArrayList();
		List<Integer> li = new LinkedList();
		//arraaylist add operation
		long startTime = System.currentTimeMillis();
		for(int i=1;i<=100000;i++)
		{
		al.add(i);
		}
		long endTime = System.currentTimeMillis();
		long result = endTime - startTime;
		System.out.println("arraylist add operation time is:"+result);

		//linkedlist add operation
		startTime = System.currentTimeMillis();
		for(int i=1;i<=100000;i++)
		{
		li.add(i);
		}
		endTime = System.currentTimeMillis();
		result = endTime - startTime;
		System.out.println("linkedlist add operation time is:"+result);

		//arraylist get operation

		startTime = System.currentTimeMillis();
		for(int i=1;i<=10000;i++)
		{
		al.remove(i);
		}
		endTime = System.currentTimeMillis();
		result = endTime - startTime;
		System.out.println("arraylist remove time:"+result);

		//linkedlist get operation

		startTime = System.currentTimeMillis();
		for(int i=1;i<=10000;i++)
		{
		li.remove(i);
		}
		endTime = System.currentTimeMillis();
		result = endTime - startTime;
		System.out.println("linkedlist remove operation time is:"+result);
	}

}
