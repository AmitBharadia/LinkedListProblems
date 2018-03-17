package ImplementingSinglyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		LinkedList list = new LinkedList();
		System.out.println("Singly Linked List Test\n");
		char ch;
		do {
			System.out.println("\nSingly Linked List Operations\n");
			System.out.println("1. insert at begining");
			System.out.println("2. insert at end");
			System.out.println("3. insert at position");
			System.out.println("4. delete at position");
			System.out.println("5. check empty");
			System.out.println("6. get size");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter integer element to insert");
					list.insertAtStart(scanner.nextInt());
					break;
				case 2:
					System.out.println("Enter integer element to insert");
					list.insertAtEnd(scanner.nextInt());
					break;
				case 3:
					System.out.println("Enter integer element to insert");
					int num = scanner.nextInt();
					System.out.println("Enter position");
					int pos = scanner.nextInt();
					if (pos <= 1 || pos > list.getSize())
						System.out.println("Invalid position\n");
					else
						list.insertAtPosition(num, pos);
					break;
				case 4:
					System.out.println("Enter position");
					int p = scanner.nextInt();
					if (p < 1 || p > list.getSize())
						System.out.println("Invalid position\n");
					else
						list.deleteAtPos(p);
					break;
				case 5:
					System.out.println("Empty status = " + list.isEmpty());
					break;
				case 6:
					System.out.println("Size = " + list.getSize() + " \n");
					break;
				default:
					System.out.println("Wrong Entry \n ");
					break;
			}
			/*  Display List  */
			list.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scanner.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}