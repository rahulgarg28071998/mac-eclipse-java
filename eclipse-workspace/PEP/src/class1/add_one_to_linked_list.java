package class1;

import java.util.Scanner;

public class add_one_to_linked_list {
	Node nn; 
	public static Node plusOne(Node n) {
         // write your code here.
		 Node newn = reverse(n);
		 n = newn;
		 while(newn!=null)
		 {
			 newn.data++;
			 if(newn.data==10)
				 {newn.data = 0;
				 //System.out.println("aaaaaaa");
				 }
			 else
				 break;
			if(newn.next!=null) 
			newn = newn.next;
			else
				{newn.next = new Node(1);break;}
				
			
		 }
		 //display(n);
		 n = reverse(n);
		 return n;
     }
	 
     private static Node reverse(Node n) {
		Node curr = n.next,prev = n;
		n.next = null;
		while(curr!=null)
		{
			Node temp= curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	// -----------------------------------------------------
 
     static Node head1;
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int a1 = sc.nextInt();
 
         Node tail;
         head1 = tail = insert(null, a1);
 
         for (int i = 1; i < n1; i++) {
             int a = sc.nextInt();
             tail = insert(tail, a);
         }
 
         head1 = plusOne(head1);
         display(head1);
 
     }
 
     // Class declaration for a Node of the Linked List
     static class Node {
         int data;
         Node next;
 
         public Node(int data) {
             this.data = data;
             this.next = null;
         }
 
     }
 
     /*
      * Input Parameters: tail: tail of the linked list in which a new node is to
      * be inserted. data: the data value of the node which is to be inserted.
      * 
      * Return Value: tail of the linked list/the node that is inserted
      */
     public static Node insert(Node tail, int data) {
 
         if (tail == null) {
             return new Node(data);
         }
 
         Node nn = new Node(data);
         tail.next = nn;
         return nn;
     }
 
     /*
      * Input Parameters: head: head of the linked list in which is to be
      * displayed.
      * 
      * Return Value: null
      */
     public static void display(Node head) {
         for (Node node = head; node != null; node = node.next) {
             System.out.print(node.data + " ");
         }
     }
 
	
}
