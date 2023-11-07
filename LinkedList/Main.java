package LinkedList;

public class Main {
	public static void main(String[] args) {

		MyLinkedList linkedList = new MyLinkedList();

		linkedList.addValue(5, 0);
		linkedList.addValue(10, 1);
		linkedList.addValue(20, 2);
		linkedList.addValue(15, 3);
		linkedList.addValue(2, 4);

		Node node = linkedList.head;
		
		while (node != null) {
			System.out.print(node.value + " -> ");
			node = node.next;
		}
		
		System.out.println();
		System.out.println(linkedList.getValue(2));
		
		System.out.println(linkedList.getIndex(2));

	}
}
