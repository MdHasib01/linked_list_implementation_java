public class Node {
	
	private int info;
	private Node link;
	Node fitst;
	Node last;
	int count;
	
	public Node() {
		
	}
	public Node (int info, Node link) {
		this.info = info;
		this.link = link;
	}
	
	public void setInfo(int info) {
		this.info = info;
	}
	
	public int getInfo() {
		return this.info;
	}
	
	public void setLink(Node link) {
		this.link = link;
	}
	
	public Node getLink() {
		return link;
	}
}
