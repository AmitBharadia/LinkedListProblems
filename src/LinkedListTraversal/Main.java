package LinkedListTraversal;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static PlacesToVisit placesToVisit = new PlacesToVisit();

	public static void main(String[] args) {
		printInstructions();
		int response;
		do {
			System.out.print("Enter choice again: (Press 0 for instructions, 7 to exit): ");
			response = scanner.nextInt();scanner.nextLine();
			switch (response) {
				case 0:
					printInstructions();
					break;
				case 1:
					System.out.print("Enter new Place: ");
					String placeName = scanner.nextLine();
					placesToVisit.insertIntoPlaces(placeName);
					break;
				case 2:
					System.out.print("Enter index of the  place to be removed: ");
					int index = scanner.nextInt();scanner.nextLine();
					placesToVisit.deleteFromPlaces(index);
					break;
				case 3:
					placesToVisit.traverseToPrevious();
					break;
				case 4:
					placesToVisit.traverseToNext();
					break;
				case 5:
					placesToVisit.printList();
					break;
				case 6:
					placesToVisit.viewCurrentPlace();
					break;
				default:
					System.out.print("Enter choice again: (Press 0 for instructions, 7 to exit): ");
					break;
			}
		} while (response != 7);
	}

	public static void printInstructions() {
		System.out.println("0. Print Instructions\n1. Insert\n2. Remove\n3. Traverse to Previous\n" +
				"4. Traverse to next\n5. Print List\n6. Current Location\n7. Exit");
	}
}
