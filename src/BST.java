class BSTNode{
	int value;
	BSTNode leftChild,rightChild;
	int count;
	BSTNode(int x){
		value=x;
		leftChild=rightChild=null;
		count=1;
	}
	
	
}
public class BST {
	BSTNode root;
	BST(){
		root = null;
	}
	public void insert(int x){
		root  = insertHelper(root,x);
		
	}
	private BSTNode insertHelper(BSTNode node,int x) {
		if(node == null) {
			node = new BSTNode(x);
			return node;
		}
		if(x > node.value) {
			node.rightChild = insertHelper(node.rightChild,x);
			
		}
		else if(x < node.value) {
			node.leftChild =insertHelper(node.leftChild,x);
			
		}
		else {
			node.count++;
		}
		return node;
		
	}
	
	
	public void inOrder() {
		inOrderHelper(root);
	}
	private void inOrderHelper(BSTNode node) {
		if(node!=null) {
			inOrderHelper(node.leftChild);
			System.out.println(node.value);
			inOrderHelper(node.rightChild);
		}
	}
	
	public void search(int x) {
		if(searchHelper(root,x) == null) {
			System.out.println("Value not in Tree");
		}else {
			System.out.println("Value in Tree");
		}
	}
	
	private BSTNode searchHelper(BSTNode node,int x) {
		if(node == null)
			return null;
		if(x == node.value) {
			return node;
		}
		if(x>node.value) {
			return searchHelper(node.rightChild,x);
		}
		if(x<node.value) {
			return searchHelper(node.leftChild,x);
		}
		return null;
	}
	
	
	/*
	 * public void delete(int x) { BSTNode toDelete = searchHelper(root,x);
	 * if(toDelete == null) { System.out.println("value not in Tree"); return; }
	 * //Else //Case 1: node is a leaf (no children) if(toDelete.rightChild == null
	 * && toDelete.leftChild == null) {
	 * 
	 * }
	 * 
	 * }
	 */
}
