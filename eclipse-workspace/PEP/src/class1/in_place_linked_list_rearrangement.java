package class1;

import java.util.Scanner;

import class1.add_one_to_linked_list.Node;

public class in_place_linked_list_rearrangement {
	 public static Node rearrange(Node head) {
		 
         heapmover hp = new heapmover();
         hp.hd = head;
         int size = 0;
         for (Node n = head; n != null; n = n.next) {
 
             size++;
         }
         foldhelp(head, hp, size, 0);
         return head;
     }
 
     private static class heapmover {
         Node hd;
     }
 
     public static void foldhelp(Node hd, heapmover h2, int size, int floor) {
         if (hd == null) {
             return;
         }
         foldhelp(hd.next, h2, size, floor + 1);
         if (floor > size / 2) {
             Node temp = h2.hd.next;
             h2.hd.next = hd;
             hd.next = temp;
             h2.hd = temp;
         } else if (floor == size / 2) {
             hd.next = null;
             
         }
     }    //

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

        head1 = rearrange(head1);
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
     * Input Parameters: tail: head of the linked list in which a new node is to
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
