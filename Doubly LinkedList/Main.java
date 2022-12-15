
public class Main {

	public static void main(String[] args) {
		LinkedListType LT = new LinkedListType();
		
//		LT.insertFirst(0);
//		LT.insertLast(10);
//		LT.insertLast(20);
//		LT.insertLast(40);
//		LT.insertLast(60);
		
//		LT.print();

		DoubleLinkedListType DL = new DoubleLinkedListType();
		DL.initializeDouble();
		DL.insertFirst(100);
		DL.insertLast(200);
		DL.insertLast(300);
		DL.insertLast(400);
		DL.delete(200);
	
		DL.printDouble();
	}
}
