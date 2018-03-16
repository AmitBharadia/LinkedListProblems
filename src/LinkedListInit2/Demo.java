package LinkedListInit2;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Place1");
		placesToVisit.add("Place2");
		placesToVisit.add("Place3");
		placesToVisit.add("Place4");
		placesToVisit.add("Place5");
		placesToVisit.add("Place6");
		placesToVisit.add("Place7");
		placesToVisit.add("Place8");

		printList(placesToVisit);
	}

	public static void printList(LinkedList<String> linkedListPlaces) {
		Iterator<String> i = linkedListPlaces.iterator();
		while (i.hasNext())  //hasNext check if there is a next node
			System.out.println("Now visiting " + i.next());  // next() returns the current node data and then moves to the next node automatically

	}
}
