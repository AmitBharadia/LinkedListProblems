package StackUsingLinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class StackWithLinkedList {
	public static LinkedList<Integer> stack = new LinkedList<Integer>();

	public static void push(int item) {
//		stack.push(item);  //professors and interviewers hate this
		stack.add(0,item);  //Hopefully, the item already there will be pushed further down the LinkedList
	}

	public static int pop() {
		if(stack.size()>0) {
//			int poppedItem = stack.pop();  //professors and interviewers hate this
			int poppedItem = stack.get(0);
			stack.remove(0);
			return poppedItem;
		} else {
			System.out.println("Stack underflow: returned -1 instead");
			return -1;
		}
	}

	public static void printStack() {
		Iterator<Integer> i = stack.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("================");
	}
}
