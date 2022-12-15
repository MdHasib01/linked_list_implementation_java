import java.util.*;

public class LinkedListType extends Node {
	private int count = 0;
	private Node first = null;
	private Node last = null;
	
	
	public void initializeList() {
		count = 0;
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		if(count == 0 || first == null || last == null) {
			return true;
		}
		else return false;
	}
	
	public int length () {
		if(!isEmpty()) {
			return count;
		}
		else return 0;
	}
	
	public void print() {
		for (Node i = first; i!= null; i = i.getLink()) {
			if(i == first) {
				System.out.print(i.getInfo());
			}
			else System.out.print(", " + i.getInfo());
		}
	}
	
	public void insertFirst(int item) {
		Node newNode = new Node (item, fitst);
		
		first = newNode;
		count ++;
		if(last == null) {
			last = newNode;
		}
	}
	
	public void insertLast(int item) {
		Node newNode = new Node(item, fitst);
		if(fitst == null) {
			first = last = newNode;
		}
		else {
			last.setLink(newNode);
			last = newNode;
			count ++;
			last.setLink(null);
		}
	}
}
