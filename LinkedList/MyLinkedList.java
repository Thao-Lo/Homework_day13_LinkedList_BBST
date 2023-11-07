package LinkedList;

public class MyLinkedList {
	Node head;
	Node tail;

	public void addValue(int value, int index) {

		Node newNode = new Node();

		newNode.value = value;

		if (index == 0) {
			newNode.next = head;
			head = newNode;
		}
		if (index != 0) {
			Node nodeBeforeIndex = head;
			for (int i = 0; nodeBeforeIndex != null && i < index - 1; i++) {

				nodeBeforeIndex = nodeBeforeIndex.next;				
			}		
			newNode.next = nodeBeforeIndex.next;		
			nodeBeforeIndex.next = newNode;

		}

	}

	public int getValue(int index) {
		int value = 0;
		int count = 0;

		Node node = new Node();
		node = head;

		while (node != null) {
			if (count == index) {
				value = node.value;
			}		
			count++;			
			node = node.next; 
		}

		return value;
	}

	public int getIndex(int value) {
		int index = 0;
		Node node = new Node();
		node = head;

		while (node != null) {
			if (node.value == value) {
				return index;
			}			
			index++;			
			node = node.next;

		}

		return index;
	}
}
