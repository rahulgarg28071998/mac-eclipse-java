package class1;

import java.util.Scanner;

public class decimal_number_from_binary_linked_list {

	 public static int func(Node head){
         int n  = 0;
		 while(head!=null)
		 {
			 n = 2*n+head.data;
			 head = head.next;
		 }
         
		 return n;
     }
 //------------------------------------------------------------------
 
     public static void main(String args[]) {
 
         Scanner sc = new Scanner(System.in);    
             
         int n = sc.nextInt();
         int a1 = sc.nextInt();
 
         insert(a1); // inserting first node
 
         for (int i = 1; i < n; i++) {
             int a = sc.nextInt();
             insert(a);
         }
 
         int res = func(head);
         System.out.println(res);
 
     }
 
 
     private static class Node {
         int data;
         Node next;
 
         public Node(int data, Node next) {
             this.data = data;
             this.next = next;
         }
 
     }
 
     static Node head;
     static Node tail;
     static int size;
 
     public static void insert(int data) {
 
         Node nn = new Node(data, null);
         if (head == null) {
             head = nn;
             tail = nn;
         } else {
             tail.next = nn;
             tail = nn;
         }
         size++;
     }
 
     public static void display() {
         for (Node node = head; node != null; node = node.next) {
             System.out.print(node.data+" ");
         }
     }
 
}
