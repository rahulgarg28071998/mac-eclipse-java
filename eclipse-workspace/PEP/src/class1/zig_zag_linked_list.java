package class1;

import java.util.Scanner;

public class zig_zag_linked_list {

	 public static void fashion(Node head){
         // write your code here
         Node curr = head;
         boolean flag = true;
         while(curr!=null&&curr.next!=null)
         {
        	 if(flag==true)
        	 {
        		if(curr.next.data<curr.data)
        		{
        			int temp = curr.data; 
                    curr.data = curr.next.data; 
                    curr.next.data = temp; 
        		}
        	 }
        	 else
        	 {
        		 if(curr.next.data>curr.data)
         		{
         			int temp = curr.data; 
                     curr.data = curr.next.data; 
                     curr.next.data = temp; 
         		}
        	 }
        	 flag = !flag;
        	 curr= curr.next;
         }
         
     }
 
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
 
         int n = sc.nextInt();
         int a1 = sc.nextInt();
         insert(a1);
 
         for (int i = 1; i < n; i++) {
             int a = sc.nextInt();
             insert(a);
         }
 
         fashion(head);
         display();
 
 
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
             System.out.print(node.data + " ");
         }
     }
 
}
