package class1;

import java.util.*;

public class two_linked_list_intersection {

	  public static Node findIntersection(Node list1, Node list2) {
      
		  Node l1 = list1,l2 = list2;
		  HashSet<Integer> hs = new HashSet<Integer>();
		  while(l1!=null)
		  {
			  hs.add(l1.data);
			  l1 = l1.next;
		  }
		  ArrayList<Integer> hs1 = new ArrayList<Integer>();
		  while(l2!=null)
		  {
			  if(hs.contains(l2.data))
			  {
				  hs1.add(l2.data);
				  hs.remove(l2.data);
			  }
			  l2 = l2.next;
		  }
		  Collections.sort(hs1);
		  //System.out.println(hs1);
		  Node sort = new Node(hs1.get(0));
		  for(int i=1;i<hs1.size();i++)
			  insert(sort, hs1.get(i));
		  return sort;
	  }
      
      
      //Class declaration for a Node of the Linked List

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
        

        head3 = findIntersection(head, head2);
        display(head3);

    }
    
    
    //Class declaration for a Node of the Linked List
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
