package QueuePri;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue al = new PriorityQueue();
		al.add(21);
		al.add(34);
		al.add(34);
		al.add(345);
		al.add(4);
		
		al.poll();
		System.out.println(al);

	}

}
