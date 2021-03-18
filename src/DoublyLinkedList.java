class DLLNode{
    int value;
    DLLNode next;
    DLLNode prev;
    DLLNode(int x){
        value = x;
        next= null;
        prev =null;
    }
}
public class DoublyLinkedList {
	DLLNode head;
	DLLNode tail;
	DoublyLinkedList(){
		head = null;
		tail = null;
	}
	public void insert(int x,String headORtail) {
		if(head == null) {
			DLLNode temp = new DLLNode(x);
			head = temp;
			tail = temp;
			head.prev =null;
			tail.next=null;
			return;
		}
		if(headORtail.equalsIgnoreCase("head")) {
			DLLNode temp = new DLLNode(x);
			temp.prev =null;
			temp.next = head;
			if(head!=null)
				head.prev=temp;
			head =temp;
		}
		else if(headORtail.equalsIgnoreCase("tail")) {
			DLLNode temp = new DLLNode(x);
			temp.next=null;
			if(tail!=null) {
				temp.prev =tail;
				tail.next=temp;
			}
			tail = temp;
			
			/*
			tail.next = temp;
			temp.prev =tail;
			tail =temp;
			tail.next =null;*/
		}
		
		
	}
	public void print(String sep) {
		DLLNode temp = head;
		System.out.print("HEAD" + sep);
		while(temp!=null) {
			System.out.print(temp.value + sep);
			temp=temp.next;
		}
		System.out.print("TAIL");
		System.out.println();
		
	}
	public void printReverse(String sep) {
		DLLNode temp = tail;
		System.out.print("TAIL" +sep);
		while(temp!=null) {
			System.out.print(temp.value + sep);
			temp=temp.prev;
		}
		System.out.print("HEAD");
		System.out.println();
		
	}
	
	
	
	
}

