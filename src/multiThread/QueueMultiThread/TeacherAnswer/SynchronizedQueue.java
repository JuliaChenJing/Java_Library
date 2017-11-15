package multiThread.QueueMultiThread.TeacherAnswer;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class SynchronizedQueue {
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;
	synchronized public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	synchronized public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}
	synchronized public int countElements(){
		int count = 0;
		Node temp = head;
		while (temp != null){
			count++;
			temp = temp.next;
		}
		return count;
		
	}
}
