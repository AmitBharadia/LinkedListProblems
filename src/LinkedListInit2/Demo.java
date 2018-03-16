package LinkedListInit2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Place3");
		placesToVisit.add("Place2");
		placesToVisit.add("Place1");
		placesToVisit.add("Place8");
		placesToVisit.add("Place5");
		placesToVisit.add("Place6");
		placesToVisit.add("Place7");
		placesToVisit.add("Place4");

		printList(placesToVisit);

		placesToVisit.add(1,"Place1.1");
		printList(placesToVisit);

		placesToVisit.remove(3);
		printList(placesToVisit);

//		String delton = "delton";
//		String anphi = "anphi";
//		if(delton.compareTo(anphi)>0) { //compareTo returns +ve if greater
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
/*		int comp = anphi.compareTo(delton);
		// if compareTo returns -ve, first string is lesser ie comes first in order
		System.out.println(comp);
*/
	}

//	public static void printList1(LinkedList<String> linkedListPlaces) {
//		for(int i=0; i<linkedListPlaces.size(); i++)
//			System.out.println(linkedListPlaces.get(i));
//	}  //Use iterator instead of this

	public static void printList(LinkedList<String> linkedListPlaces) {
		Iterator<String> i = linkedListPlaces.iterator();
		while (i.hasNext())  //hasNext check if there is a next node
			System.out.println("Now visiting " + i.next());  // next() returns the current node data and then moves to the next node automatically
		System.out.println("--------------------\n\n");
	}

	public static boolean addInOrder(String newCity, LinkedList<String> linkedList) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0) {
				//equal
				System.out.println(newCity+ " already exists");
				return false;
			} else if (comparison>0) {
				//newCity appear before this one
				stringListIterator.previous();  //This is the speciality of ListIterator over Iterator
				stringListIterator.add(newCity);
				return true;
			} else if(comparison<0) {
				//move to next city
			}
		}
		stringListIterator.add(newCity);
		return true;
		}
}
