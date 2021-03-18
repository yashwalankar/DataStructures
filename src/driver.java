
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Linked list test");
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(77);
        list.insert(21);
        list.insert(10);
        list.insert(12);
        list.insert(23);
        list.insertAtHead(44);
        list.printList(" --> ");
        System.out.println("Deleting 10");
        list.delete(10);
        list.printList(" --> ");
        
        
        System.out.println("Size = "+list.size());
        System.out.println("Reversing the list");
        list.reverseList();
        list.printList(" --> ");
        
        
        
        DoublyLinkedList doublylist = new DoublyLinkedList();
        doublylist.insert(1,"HEAD");
        doublylist.insert(2,"HEAD");
        doublylist.insert(3,"HEAD");
        doublylist.insert(4,"HEAD");
        doublylist.insert(5,"HEAD");
        doublylist.insert(6,"TAIL");
        
        doublylist.print(" <-> ");
        doublylist.printReverse(" <-> ");
        

	}

}
