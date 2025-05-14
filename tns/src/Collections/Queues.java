package Collections;
//Queue by LinkedList
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Queues {
//public static void main(String[] args) {
//	Queue<String> q=new LinkedList<>();
//	q.offer("Varun");
//	q.offer("Tharun");
//	q.poll();
////	for(String i:q) {
//		System.out.println(q);
//		System.out.println(q.peek());
//	//}
//	
//}
//}
import java.util.*;
class Queues{
	public static void main(String[] args) {
		//Heap Structure
	Queue<Integer> pq=new PriorityQueue<>();
	pq.offer(12);
	pq.offer(25);
	pq.offer(22);
	pq.offer(10);
	System.out.println(pq);
	pq.poll();
	System.out.println(pq);
	System.out.println(pq.peek());
	//Array Deque(Sorting Order)
	Queue<Integer> p=new ArrayDeque<>();
	p.offer(12);
	p.offer(25);
	p.offer(22);
	p.offer(10);
	System.out.println(pq);
	pq.poll();
	System.out.println(pq);
	System.out.println(pq.peek());
	}
}