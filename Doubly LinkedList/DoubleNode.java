public class DoubleNode {

	private int info;
	private DoubleNode prev;
	private DoubleNode next;
	
	public DoubleNode () {
		
	};
	public DoubleNode (int info, DoubleNode prev, DoubleNode next) {
		this.info = info;
		this.prev = prev;
		this.next = next;
	}
	
	public void setInfo(int info) {
		this.info = info;
	}
	
	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}
	
	public void setNext(DoubleNode next) {
		this.next = next;
	}
	
	public int getInfo() {
		return info;
	}
	
	public DoubleNode getPrev() {
		return prev;
	}
	
	public DoubleNode getNext () {
		return next;
	}

}
