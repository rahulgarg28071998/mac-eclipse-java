package class1;

import java.util.Scanner;

public class is_linked_list_palindrome {

    static Node left;

    // -----------------------------------------------------
    // This is a functional problem. You have to complete this function.
    // This function takes as input the head of the linked list.
    // It should return true if list is palindrome, else return false.

    public static boolean isPalindrome(Node head) {
        // write your code here.
    	 left = head;
         return ispalindrome(head);
    }

    private static boolean ispalindrome(Node n) {
		if(n==null) return true;
       // System.out.println(n.data);

		 boolean nextresult = ispalindrome(n.next);
         if (nextresult == false || left.data != n.data) {
           // System.out.println(n.data+">>>>");
        	 return false;
         }
        // System.out.println(n.data+" >>");
         left = left.next;
         return true;
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

        if (isPalindrome(head1)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

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
