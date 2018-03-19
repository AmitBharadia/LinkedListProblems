package StackUsingLinkedLIst;

import StackUsingLinkedLIst.StackWithLinkedList;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();
	public static void main(String[] args) {
		System.out.println("Press 0 for instructions");
		int response;
		do {
			System.out.print("Enter Choice: ");
			response = scanner.nextInt();scanner.nextLine();
			switch(response) {
				case 0: printInstructions();
						break;
				case 1: System.out.print("Enter Item to push: ");
						int item = scanner.nextInt();scanner.nextLine();
						stackWithLinkedList.push(item);
						break;
				case 2: System.out.println("Item popped is: " + stackWithLinkedList.pop());
						break;
				case 3: stackWithLinkedList.printStack();
						break;
				case 4: System.out.println("Exiting...");
						break;
			}
		} while (response != 4);
	}

	public static void printInstructions() {
		System.out.println("0. Instructions\n1. Push\n2. Pop\n3. Print Stack\n4. Exit");
	}
}
