
public class DoubleLinkedListType extends DoubleNode {

	private int count = 0;
	private DoubleNode firstNode = null, lastNode = null;
	
	public void initializeDouble () {
		count = 0;
		firstNode = null;
		lastNode = null;
	}
	
	// ----------The print method starts--------------
	public void printDouble (){
		System.out.print("Linked List: ");
		for(DoubleNode i = firstNode; i != null; i=i.getNext()) {
			System.out.print(i.getInfo());
			if(i !=lastNode) {
				System.out.print(", ");
			}
		}
	}
	// -----------print method ends-----------------
	
	public void insertFirst (int info) {
		DoubleNode newDNode = new DoubleNode(info, null, firstNode);
		
		firstNode = newDNode;
		count ++;
		if(lastNode == null) {
			lastNode = newDNode;
		}
	}
	
	public void insertLast (int info) {
		DoubleNode newDnode = new DoubleNode (info,lastNode, null);
		
		if(firstNode == null) {
			firstNode = lastNode = newDnode;
		}
		else {
			lastNode.setNext(newDnode);
			lastNode = newDnode;
			count ++;
		}	
	}
	
	public void delete(int x) {
		if(firstNode == null) {
			System.out.println("The linked list is empey!");
		}
		
		else if(firstNode.getInfo()==x) {
			System.out.println(firstNode.getInfo() + " is deleted!");
			firstNode.getNext().setPrev(null);
			firstNode = firstNode.getNext();
		}
		
		else if(lastNode.getInfo()==x) {
			System.out.println(lastNode.getInfo() + " is deleted!");
			lastNode.getPrev().setNext(null);
			lastNode = lastNode.getPrev();
		}
		
		else {
			int found = 0;
			for(DoubleNode i = firstNode; i.getNext()!=null; i=i.getNext()) {
				if(i.getInfo() == x) {
					System.out.println(i.getInfo() + " is deleted!");
					i.getPrev().setNext(i.getNext());
					i.getNext().setPrev(i.getPrev());
					found = 1;
					break;
				}
			}	
			if(found == 0 ) {
				System.out.println(x + " is not in the list!");
			}
		}
	}
	
	
	
	
}
