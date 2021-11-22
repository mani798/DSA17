package DSA17;

public class Deletenode {
	 class Node{  
	        int datasum;  
	        Node start;  
	        Node end;  
	  
	        public Node(int data) {  
	            this.datasum = data;  
	        }  
	    }  
	    Node head, tail = null;  

	    public void addNode(int data) {  
	        Node newNode = new Node(data);   
	        if(head == null) {  
	            head = tail = newNode;    
	            head.start = null;  
	            tail.end = null;  
	        }  
	        else {  
	            tail.end = newNode;  
	            newNode.start = tail;  
	            tail = newNode;  
	            tail.end = null;  
	        }  
	    }  
	    public void deleteFromEnd() {  
	        if(head == null) {  
	            return;  
	        }  
	        else {  
	            if(head != tail) {  
	                tail = tail.start;  
	                tail.end = null;  
	            }  
	            else {  
	                head = tail = null;  
	            }  
	        }  
	    }  
	    public void display() {  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        while(current != null) {  
	            System.out.print(current.datasum + " ");  
	            current = current.end;  
	        }  
	        System.out.println();  
	    }  
	  
	    public static void main(String[] args) {  
	  
	    	Deletenode  dList = new Deletenode ();  
	        dList.addNode(1);  
	        dList.addNode(2);  
	        dList.addNode(3);  
	        dList.addNode(4);  
	        dList.addNode(5);  
	  
	        dList.display();  
	        while(dList.head != null) {  
	            dList.deleteFromEnd();  
	            
	            dList.display();  
	        }  
	    }  
}
