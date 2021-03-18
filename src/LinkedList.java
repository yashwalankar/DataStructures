class LLNode{
    int value;
    LLNode next;
    LLNode(int x){
        value = x;
        next= null;
    }
}


public class LinkedList {
    private LLNode head;
    private int size;
    LinkedList(){
        head=null;
        size=0;
    }
    public void insert(int x){
        if(head == null){
            head = new LLNode(x);
        }else{
            LLNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = new LLNode(x);
        }
        size++;
    }
    public void insertAtHead(int x) {
    	LLNode temp = new LLNode(x);
    	temp.next = head;
    	head = temp;
    	size++;
    }
    
    public void reverseList() {
    	LLNode prev,next,temp;
    	prev=next=null;
    	temp =head;
    	
    	while(temp!=null) {
    		next = temp.next;
    		temp.next = prev;
    		prev =temp;
    		temp =next;
    	}
    	head =prev;	
    }
    
    public void recursiveReverse() {
    	head = recursiceReverseHelper(head);
    }
    private LLNode recursiceReverseHelper(LLNode node) {
    	
    	return null;
    }
    
    
    public void printList(String sep){
        LLNode temp=head;
        System.out.print("HEAD --> ");
        while(temp!=null){
            System.out.print(temp.value + sep);
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
        
    }
    public int size() {
    	return size;
    }
    
    public void delete(int x) {
    	
    	if(head == null ) {
    		System.out.println("list empty");
    		return;
    	}
    	if(head.value == x) {
    		head = head.next ;
    		size--;
    		return;
    	}
    	
    	LLNode temp= head.next;
    	LLNode prev = head;
    	
    	while(temp!= null) {
    		if(temp.value == x) {
    			
    			prev.next = temp.next;
    			size--;
    			return;
    		}
    		prev =temp;
    		temp =temp.next;
    	}
    	System.out.println("Not in list");
    	
    }
    
}

