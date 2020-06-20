package HashMapHeap;

import java.util.*;

public class k_smallest_ele_in_order {

	 public static void main(String[] args) {
		 
 	 	 Scanner scn = new Scanner(System.in);
 
 	 	 	 int n = scn.nextInt();
 	 	 	 int k = scn.nextInt();
 
 	 	 	 int[] arr = new int[n];
 	 	 	 
 	 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 arr[i] = scn.nextInt();
 	 	 	 }
             print_k_smallest_elements_in_their_original_order(n,k,arr);
 	 }
 
  	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input length of array, value of k and array of length n
 	 // It should print k smallest elements in their original order
 	 public static void print_k_smallest_elements_in_their_original_order(int n,int k, int[] arr){
 	 	 //Write your code here
 		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
 		 for(int i =0;i<n;i++)
 			 pq.add(arr[i]);
 		 
 		 for(int j=0;j<k;j++)
 			 pq.remove();
 		 int kMin = pq.remove();
 		 for(int i=0;i<n;i++)
 		 {
 			 if(arr[i]<kMin)
 				 System.out.print(arr[i]+" ");
 		 }
     }
}
