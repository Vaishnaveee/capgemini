package ConcurrencyDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;

public class App3 {
public static void main(String[] args) {
	 Deque<Integer> queue = new ArrayDeque<>();
	  queue.offer(3);
	  queue.offer(1);
	  queue.offer(4);
	  
	  queue.addFirst(10);
	  System.out.println(queue);
	  
	  Deque<Integer> queue1 = new LinkedList<>();
	  queue1.offer(3);
	  queue1.offer(1);
	  queue1.offer(4);
	  queue1.offer(null);
	  queue1.addFirst(10);
	  
	  System.out.println(queue1);
	  
	  Deque<Integer> queue2 = new ConcurrentLinkedDeque<>();
	  
	  queue2.offer(3);
	  queue2.offer(1);
	  queue2.offer(4);
	  queue2.offerFirst(10);
	  
	  Iterator <Integer> itr =queue2.descendingIterator();
	 while(itr.hasNext()){
		 System.out.println(itr.next()+"--");
	  }
}
}
