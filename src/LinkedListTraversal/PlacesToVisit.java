package LinkedListTraversal;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlacesToVisit {
	private static LinkedList<String> places = new LinkedList<String>();
	private static ListIterator<String> i = places.listIterator();
	public void insertIntoPlaces(String placeName) {
		i.add(placeName);
	}

	public void deleteFromPlaces(int index) {
		places.remove(index);
	}

	public void traverseToPrevious() {
		if(i.hasPrevious()) {
			System.out.println("Now leaving " + i.previous() );
			System.out.println("Reached "+viewCurrentPlace());
		} else {
			System.out.println("You are at the start.");
		}
	}

	public void traverseToNext() {
		if(i.hasNext()) {
			System.out.println("Now leaving " + i.next());
			System.out.println("Reached "+viewCurrentPlace());
		} else {
			System.out.println("You are at the final destination.");
		}
	}

	public void printList() {
		ListIterator<String> printingIterator = places.listIterator();
		while(printingIterator.hasNext()) {
			System.out.println(printingIterator.next()); //returns current and then goes to next
		}
	}

	public String viewCurrentPlace() {  //Fix this
		String currentPlace;
		if(i.hasNext()) {
			currentPlace = i.next();
			i.previous();
		} else if(i.hasPrevious())  {
			currentPlace = i.previous();
			i.next();
		} else {
			currentPlace = places.get(0);
		}
		return currentPlace;
	}

}
