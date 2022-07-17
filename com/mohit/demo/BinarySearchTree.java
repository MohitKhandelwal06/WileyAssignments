package com.mohit.demo;

public class BinarySearchTree {
	class Node{
		int key;
		Node left,right;
		public Node(int key) {
			super();
			this.key = key;
		}
		
	}
	
	Node root;
	
	public void insert(int key) {
		root=insertRec(root, key);
	}
	private Node insertRec(Node root,int key) {
		//if the tree is empty
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertRec(root.left, key);
		else if(key>root.key)
			root.right=insertRec(root.right, key);
		
		return root;
	}
	
	public void inorderTraversal() {
		inorderRec(root);
		System.out.println();
	}
	
	//Left,root,right
	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
	}
	private int max(Node root) {
		if(root==null) {
			return -1;
		}
		if(root.right==null) {
			return root.key;
		}
		int ans=max(root.right);
		return ans;
	}
	public int maxElement() {
		return max(root);
	}
	
	private int min(Node root) {
		if(root==null) {
			return -1;
		}
		if(root.left==null) {
			return root.key;
		}
		int ans=min(root.left);
		return ans;
	}
	public int minElement() {
		return min(root);
	}
	private Node delete(Node root,int data) {
		if(root==null) {
			return null;
		}
		if(root.key<data) {
			root.right=delete(root.right,data);
		}else if(root.key>data) {
			root.left=delete(root.left,data);
		}else {
//			root.key==data
//			Zero child
			if(root.left==null && root.right==null) {
				return null;
			}else if(root.left==null) {		//One Child
				return root.right;
			}else if(root.right==null) {    //One child
				return root.left;
			}else {							//Two child
				int maxInLeft=max(root.left);
				root.key=maxInLeft;
				root.left=delete(root.left,maxInLeft);
			}
		}
		return root;
	}
	public void deleteElement(int data) {
		root=delete(root,data);
	}
	
//	Function For calculating leaf nodes in BST
	private int CountLeaf(Node root) {
		if(root==null) {
			return 0;
		}
		int ans=0;
		if(root.left==null && root.right==null) {
			ans=ans+1;
		}
		ans+=CountLeaf(root.left);
		ans+=CountLeaf(root.right);
		return ans;
	}
	public int LeafNodes() {
		return CountLeaf(root);
	}
	
//	Function For calculating internal nodes in BST
	public int internalNodes() {
		return countInternal(root);
	}
	private int countInternal(Node root) {
		if(root==null) {
			return 0;
		}
		
		int ans=0;
		if(root.left!=null || root.right!=null) {
			ans=ans+1;
		}
		ans+=countInternal(root.left);
		ans+=countInternal(root.right);
		return ans;
	}
	
//	Height Of a binary tree
	public int height() {
		return calcHeight(root);
	}
	private int calcHeight(Node root) {
		if(root==null) {
			return 0;
		}
		return Integer.max(calcHeight(root.left), calcHeight(root.right))+1;
	}
}
