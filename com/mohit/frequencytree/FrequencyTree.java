package com.mohit.frequencytree;

public class FrequencyTree {

	class Node{
		int key,count;
		Node left,right;
		public Node(int key) {
			super();
			this.key = key;
		}
	}
	
	Node root;
	private boolean search(Node root,int data) {
		if(root==null) {
			return false;
		}
		if(root.key==data) {
			return true;
		}else if(root.key<data) {
			return search(root.right,data);
		}else {
			return search(root.left,data);
		}
	}
	boolean searchElement(int data) {
		return search(root,data);
	}
}
