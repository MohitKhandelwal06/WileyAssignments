package com.mohit.demo;

import java.util.Scanner;

public class BinarySearchTreePresentation {

	private BinarySearchTree binarySearchTree=new BinarySearchTree();
	public void showMenu() {
		System.out.println("1. Add element");
		System.out.println("2. Inorder Traversal");
		System.out.println("3. Maximum Element");
		System.out.println("4. Minimum Element");
		System.out.println("5. Delete Element");
		System.out.println("6. Count Leaf");
		System.out.println("7. Exit");
	}
	
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			System.out.println("Enter Element : ");
			binarySearchTree.insert(scanner.nextInt());
			System.out.println("Value Inserted");
			break;

		case 2:
			binarySearchTree.inorderTraversal();
			break;
		case 3:
			System.out.println( binarySearchTree.maxElement());
			break;
		case 4:
			System.out.println(binarySearchTree.minElement());
			break;
		case 5:
//			System.out.println("Under Construction");
			System.out.println("Enter Element to be deleted");
			int ele=scanner.nextInt();
			binarySearchTree.deleteElement(ele);
			break;
		case 6:
			System.out.println( binarySearchTree.LeafNodes());
			break;
		case 7:
			System.out.println( binarySearchTree.internalNodes());
			break;
		case 8:
			System.out.println("Height of BST : "+binarySearchTree.height());
			break;
		case 9:
			System.out.println("Thanks for using Binary Search Tree");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
	}
}
