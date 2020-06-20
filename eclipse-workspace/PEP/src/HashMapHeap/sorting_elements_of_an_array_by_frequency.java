package HashMapHeap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class sorting_elements_of_an_array_by_frequency {

	static class Pair{
		int key;
		int freq;
		public Pair(int key,int freq) {
			// TODO Auto-generated constructor stub
			this.freq = freq;
			this.key = key;
		}
	}
 
	  static void sortByFreq(int arr[], int n) {
	         // Write your code here
		  HashMap<Integer, Pair> hm = new HashMap<Integer, Pair>();
		  for(int i =0;i<arr.length;i++)
		  {
			  if (!hm.containsKey(arr[i])) {
	                 hm.put(arr[i], new Pair(arr[i], 1));
	             } else {
	                 hm.get(arr[i]).freq++;
	             }
		  }
		 
//			  for(Map.Entry<Integer	, Pair> entry: hm.entrySet())
//		  {
//			  System.out.println("Key = " + entry.getKey() + 
//                      ", Value = " + entry.getValue()); 
//			 
//		  	}  
			  ArrayList<Pair> list = new ArrayList<>(hm.values());
		         Collections.sort(list, new Comparator<Pair>() {
		             public int compare(Pair a, Pair b) {
		                 return a.freq != b.freq ? b.freq - a.freq : (a.key < b.key ? -1 : 1);
		             }
		         });
		         for (Pair p : list) {
		             while (p.freq-- > 0) {
		                 System.out.print(p.key + " ");
		             }
		         }
		  
	   }
	 
	     //Dont make changes here
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         int N = sc.nextInt();
	         int[] arr = new int[N];
	         for (int i = 0; i < N; i++) {
	             arr[i] = sc.nextInt();
	         }
	         sortByFreq(arr, N);
	     }
}
