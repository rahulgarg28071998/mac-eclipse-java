package class1;

import java.util.Scanner;
import java.util.Stack;

public class addition_of_two_linked_list {

	
	  public static Node addTwoNumbers(Node n1, Node n2) {
	        // write your code here.
		  Stack<Integer> st1 = new Stack<Integer>();
		  Stack<Integer> st2 = new Stack<Integer>();
		  Stack<Integer> st3 = new Stack<Integer>();
		  
		  while(n1!=null)
		  {
			  st1.push(n1.data);
			  n1 = n1.next;
		  }
		  while(n2!=null)
		  {
			  st2.push(n2.data);
			  n2 = n2.next;
		  }
		  int sum = 0, carry = 0, value1, value2;
		  while ((!st1.empty()) && (!st2.empty()))
	        {
	            value1 = st1.pop();
	            value2 = st2.pop();
	            
	            sum   = (value1 + value2 + carry) % 10;
	            carry = (value1 + value2 + carry) / 10;
	           
	            st3.push(sum);
	        }
		  while (!st1.isEmpty())
	        {
	            value1 = st1.pop();
	             
	            sum   = (value1 + carry) % 10;
	            carry = (value1 + carry) / 10;
	             
	            st3.push(sum);
	        }
	         while (!st2.isEmpty())
	        {
	            value2 = st2.pop();
	             
	            sum   = (value2 + carry) % 10;
	            carry = (value2 + carry) / 10;
	             
	            st3.push(sum);
	        }
	         
	
	        if (carry > 0)
	        {
	            st3.push(carry);
	        }
	   Node n = new Node();
	   n.data = st3.pop();
	   Node temp = n;
	   while(!st3.isEmpty())
	   {
		 Node nn = new Node();
		 nn.data = st3.pop();
		 temp.next = nn;
		 temp = nn;
		 
	   }

		  return n;
	     }
	 
	     
	     // -----------------------------------------------------
	 
	     static Node head1;
	 
	     static Node head2;
	 
	     static Node head3;
	 
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
	 
	         int n2 = sc.nextInt();
	         int a2 = sc.nextInt();
	 
	         head2 = tail = insert(null, a2);
	 
	         for (int i = 1; i < n2; i++) {
	             int a = sc.nextInt();
	             tail = insert(tail, a);
	         }
	 
	         head3 = addTwoNumbers(head1, head2);
	         display(head3);
	 
	     }
	 
	     // Class declaration for a Node of the Linked List
	     private static class Node {
	         int data;
	         Node next;
	 
	         public Node(int data, Node next) {
	             this.data = data;
	             this.next = next;
	         }
	         public Node()
	         {
	        	 
	         }
	     }
	 
	     /*
	      * Input Parameters: tail: head of the linked list in which a new node is to
	      * be inserted. data: the data value of the node which is to be inserted.
	      * 
	      * Return Value: tail of the linked list/the node that is inserted
	      */
	     public static Node insert(Node tail, int data) {
	 
	         if (tail == null) {
	             return new Node(data, null);
	         }
	 
	         Node nn = new Node(data, null);
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
	         System.out.println();
	     }
	 
}



//long a=0,b=0;
//while(n1!=null)
//{
//	  a  = 10*a+n1.data;
//	  n1 = n1.next;
//}
//while(n2!=null)
//{
//	  b  = 10*b+n2.data;
//	  n2 = n2.next;
//}
//System.out.println(a);
//return a+b;
