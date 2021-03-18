//Node class for doubly linked list
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
	int size;
	//Constructor 
	DoublyLinkedList(){
		head = null;
		tail = null;
		size=0;
	}
	/*Insert Function 
	 * 
	 * INPUT : int x (input value) 
	 * 		   String "Head" to add to the front and "tail" to add to the end
	 * 
	 */
	public void insert(int x,String headORtail) {
		if(head == null) {
			DLLNode temp = new DLLNode(x);
			head = temp;
			tail = temp;
			head.prev =null;
			tail.next=null;
			size++;
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
		size++;
		
	}
	
	public int size() {
		return size;
	}
	
	
	
	/* Print 
	 * prints the content of the linked list head to tail 
	 * 
	 * String sep is the Separator between two nodes while printing 
	 * 
	 * 
	 */
	
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
	
	/* Print Reverse 
	 * prints the content of the linked list tail to head 
	 * 
	 * String sep is the Separator between two nodes while printing 
	 * 
	 * 
	 */
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

