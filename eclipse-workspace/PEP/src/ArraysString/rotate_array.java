package ArraysString;

import java.util.*;

public class rotate_array {

	 public static void rotate(int[] a, int k) {
 	 	 // Write your code here
		 Queue<Integer> q = new LinkedList<Integer>();
		 for(int i=1;i<=a.length;i++)
		 { q.add(a[a.length-i]);}
		 for(int i=0;i<k;i++)
		{q.add(q.remove());}
		 for(int i=0;i<a.length;i++)
			{a[i] = q.remove(); 
			 }
		for(int i=0;i<a.length/2;i++)
		{
			int temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		}
 	 }
 
 	 // Don't make any changes here
 	 public static void main(String[] args) {
 	 	 Scanner s = new Scanner(System.in);
 	 	 int n = s.nextInt();
 	 	 int k=s.nextInt();
 	 	 int[] ar = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 ar[i] = s.nextInt();
 	 	 }
 	 	 rotate(ar, k);
 	 	 for (int v : ar)
 	 	 	 System.out.print(v + " ");
 	 }
}
