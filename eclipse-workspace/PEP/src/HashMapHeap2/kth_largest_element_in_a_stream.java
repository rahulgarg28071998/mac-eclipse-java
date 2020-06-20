package HashMapHeap2;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kth_largest_element_in_a_stream {

 static class KthLargest {
         
	 
	  	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	  	int k;
         public KthLargest(int k, int[] nums) {
             // write your code here.
        	 int size = 0;
        	 this.k = k;
        	 for(int i=0;i<nums.length;i++)
        	 {
        		 if(size<k)
        		 { pq.add(nums[i]);size++;}
        		 else if(pq.peek()<nums[i])
        		 {	 pq.remove();
        		 	 pq.add(nums[i]);
        		 }
        	 }
         }
         
         public int add(int val) {
             // write your code here.
        	 int size = pq.size();
        	 if(size<k)
        	 {
        		 pq.add(val);
        		 return pq.peek();
        	 }
        	 else if(pq.peek()<val)
        	 {
        		 pq.remove();
        		 pq.add(val);
        	 }
        	 return pq.peek();
         }
 
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Input for length of first array.
         int N = sc.nextInt();
 
         int[] intialStream = new int[N];
 
         // Input for initial stream elements.
         for (int i = 0; i < intialStream.length; i++) {
             intialStream[i] = sc.nextInt();
         }
 
         int K = sc.nextInt();
 
         int M = sc.nextInt();
         int[] remainingStream = new int[M];
 
         // Input for remaining stream elements.
         for (int i = 0; i < remainingStream.length; i++) {
             remainingStream[i] = sc.nextInt();
         }
 
         KthLargest obj = new KthLargest(K, intialStream);
 
         for (int i = 0; i < remainingStream.length; i++) {
             int kthLargest = obj.add(remainingStream[i]);
             System.out.println(kthLargest);
         }
 
     }
 
     // Function to display an array.
     public static void display(int[] arr) {
 
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
 
         System.out.println();
     }
 
}
