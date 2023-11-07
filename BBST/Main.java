package BalancedBinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(5);
		array.add(4);
		array.add(9);
		array.add(1);
		array.add(3);
		array.add(7);

		Collections.sort(array);

		MyTree binaryTree = new MyTree();

		binaryTree.root = MyTree.createTree(array);

		printTree(binaryTree.root);
	}

	// Helper method to print the tree nodes
	public static void printTree(Node root) {
		if (root != null) {
			printTree(root.left);
			System.out.print(root.value + " -> ");
			printTree(root.right);
		}
	}

}
