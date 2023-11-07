package BalancedBinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;

public class MyTree {
	Node root;

	public static Node createNodes(ArrayList<Integer> array, int start, int end) {

		if (start > end) {
			return null;
		}
		int middle = (start + end) / 2;
		Node node = new Node();
		node.value = array.get(middle);

		node.left = createNodes(array, start, middle - 1);
		node.right = createNodes(array, middle + 1, end);

		return node;

	}

	public static Node createTree(ArrayList<Integer> array) {
		return createNodes(array, 0, array.size() - 1);
	}

	
}
