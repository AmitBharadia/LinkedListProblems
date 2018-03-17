package ImplementingSinglyLinkedList;

public class LinkedList {

	protected Node head;
	protected Node end;
	public int size;

	public LinkedList() {
		this.head = null;
		this.end = null;
		this.size = 0;
	}

	//	To check if the list is empty
	public boolean isEmpty() {
		return head == null;  //if head==null; returns true
	}

	//	To get the size of list
	public int getSize() {
		return size;
	}

	//	To insert at beginning
	public void insertAtStart(int val) {
		Node newNode = new Node(val, null);
		size++;
		if (head == null) {
			head = newNode;
			end = head;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	// To insert at end
	public void insertAtEnd(int val) {
		Node newNode = new Node(val, null);
		size++;
		if (head == null) {
			head = newNode;
			end = head;
		} else {
			end.setNext(newNode);
			end = newNode;
		}
	}

	// To insert at a position
	public void insertAtPosition(int val, int pos) {
		Node newNode = new Node(val, null);
		Node ptr = head;
		pos--;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node temp = ptr.getNext();
				ptr.setNext(newNode);
				newNode.setNext(temp);
				break;
			}
			ptr = ptr.getNext();
		}
		size++;
	}

	//To delete fromm a position
	public void deleteAtPos(int pos) {
		if (pos == 1) {  //delete the head
			head = head.getNext();
			size--;
			return;
		}

		if (pos == size) {  //delete at end
			Node s = head;
			Node t = head;
			while (s != end) {
				t = s;
				s = s.getNext();
			}
			end = t;
			end.setNext(null);  //Java garbage collection will free up the previous end
			size--;
			return;
		}

		// delete at a position other than head or tail
		Node ptr = head;
		pos--;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node temp = ptr.getNext();
				temp = temp.getNext();
				ptr.setNext(temp);
				break;
			}
			ptr = ptr.getNext();
		}
		size--;
	}

	public void display() {
		System.out.println("Singly Linked List: ");
		if (size == 0) {
			System.out.println("List Empty");
			return;
		}
		if (head.getNext() == null) {
			System.out.println("Only one element");
			System.out.println(head.getData());
			return;
		}
		Node ptr = head;
		System.out.print(head.getData() + "-->");
		ptr = head.getNext();
		while (ptr.getNext() != null) {
			System.out.println(ptr.getData() + "-->");
			ptr = ptr.getNext();
		}
		System.out.println(ptr.getData() + "||");
	}
}
