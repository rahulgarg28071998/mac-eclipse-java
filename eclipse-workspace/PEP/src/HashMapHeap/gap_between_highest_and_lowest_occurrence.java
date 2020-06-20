package HashMapHeap;

import java.util.*;

public class gap_between_highest_and_lowest_occurrence {


	 public static void findDifference(int[] arr) {
	 //Write your code here	 
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 int max = 1,min = 1; 
		 for (int i = 0; i < arr.length; i++) {
			 int num =  hm.getOrDefault(arr[i], 0)+1;
			 hm.put(arr[i], num);
			 min = min>num ? num:min;
			 max = max<num ? num:max;
				
		}
		 System.out.println(max-min);
	 }
	 
	 //Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = scn.nextInt();
	 	 }
	 	 findDifference(num);
	 }
}
