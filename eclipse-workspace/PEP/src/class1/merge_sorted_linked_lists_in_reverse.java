package class1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class merge_sorted_linked_lists_in_reverse {

	public static Node mergeResult(Node head1, Node head2) {
        // write your code here
		 PriorityQueue<Node> maxHeap = new PriorityQueue<>((n1, n2) -> n2.data - n1.data);
	        

	        while(head1!=null)
	        {
	        	 maxHeap.add(new Node(head1.data));
	        	head1 = head1.next;
	        }
	        while(head2!=null)
	        {
	        	 maxHeap.offer(new Node(head2.data));
	        	head2 = head2.next;
	        }
	        Node curr = !maxHeap.isEmpty() ? maxHeap.poll() : null;
	        Node head = curr;
	        while(!maxHeap.isEmpty()) { 
	            curr.next = maxHeap.poll();
	            curr = curr.next;
	        }
	        
	        return head;
    }
    
    // -----------------------------------------------------
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1 = sc.nextInt();
        head = insert(head, a1);

        for (int i = 1; i < n1; i++) {
            int a = sc.nextInt();
            head = insert(head, a);
        }
        
        int n2 = sc.nextInt();
        int a2 = sc.nextInt();
        head2 = insert(head2, a2);
        for (int i = 1; i < n2; i++) {
            int a = sc.nextInt();
            head2 = insert(head2, a);
        }

        head3 = mergeResult(head, head2);
        display(head3);

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

    static Node head;

    static Node head2;

    static Node head3;

    /*
     * Input Parameters: head: head of the linked list in which a new node is to
     * be inserted. data: the data value of the node which is to be inserted.
     * 
     * Return Value: head of the linked list in which the node is inserted
     */
    public static Node insert(Node head, int data) {

        if (head == null) {
            return new Node(data);
        }

        head.next = insert(head.next, data);
        return head;
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
