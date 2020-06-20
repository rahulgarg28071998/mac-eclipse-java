package class1;

import java.util.*;

public class rearrange_linked_list_odd_even {

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input the head of the linked list.
    // It should return the head of the modified linked list.
    public static Node oddEvenList(Node head) {
       if(head== null||head.next == null)
       {
    	   return head;
       }
       Node second = head.next;
       Node curr = head.next,prev = head;
       System.out.println(second.data);
       //int count = 0;
       while(curr.next!=null)
       {
    	   prev.next = curr.next;
    	   prev = curr;
    	   curr = curr.next;
    	  // System.out.println(curr.data);
    	   
       }
       prev.next = null;
       curr.next = second;
       //display(head);
       return head;
    }

    // -----------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1 = sc.nextInt();
        head1 = insert(head1, a1);

        for (int i = 1; i < n1; i++) {
            int a = sc.nextInt();
            head1 = insert(head1, a);
        }

        head1 = oddEvenList(head1);
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

    static Node head1;

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
