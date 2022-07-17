package com.mohit.demo;

class LinkedList{
	
	class Node{
		int data;
		Node next;
		
		public Node() {
			
		}
	}
	Node head;
	public void addElement(int value) {
		
	}
	public void removeElement() {
		
	}
}
public class AdjacencyList {
	private LinkedList container[]=new LinkedList[10];
	public AdjacencyList(){
		
	}
	public void insertElement(int data) {
		int index=position(data);
		container[index].addElement(data);
	}
	private int position(int data) {	//Hashing division
		return -1;
	}
	
	public boolean serachElement(int data) {
		return false;
	}
	
	public boolean removeElement(int data) {
		return false;
	}
	
	public void displayElements() {
		
	}
}
