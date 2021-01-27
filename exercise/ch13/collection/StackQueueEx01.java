package ch13.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx01 {
	public static void main(String[] args) {
		String cars[] = {"소나타", "그랜저", "SM5", "K9"};
		Stack<String> stack = new Stack<String>();
		
		for(String s : cars) stack.push(s);
		System.out.println("stack size: " + stack.size());
		
		System.out.println("peek : " + stack.peek());
		System.out.println("stack size: " + stack.size());
		
		System.out.println("pop : " + stack.pop());
		System.out.println("stack size: " + stack.size());
		System.out.println();
		
		
		Queue<String> queue = new LinkedList<String>();
		for(String s : cars) queue.offer(s);
		System.out.println("queue size: " + queue.size());
		
		System.out.println(queue.peek());
		System.out.println("peek : " + queue.size());
		
		System.out.println("poll : " + queue.poll());
		System.out.println("queue size: " + queue.size());
	}
}
