package HashMapHeap2;

import java.util.HashMap;
import java.util.Scanner;

public class longest_sub_array_with_sum_k {

	 
	 public static void print(int n, int[] arr, int k) {
	 //Write your code here	 
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 hm.put(0, -1);
		 int sum = 0,max = 0;
		 for(int i=0;i<n;i++)
		 {
			 sum+=arr[i];
			if(!hm.containsKey(sum-k)) 
			{
				hm.put(sum, i);
			}
			else
			{
				int freq = hm.get(sum-k);
				//System.out.println(freq);
				max = max>(i-freq)?max:(i-freq);
			}
		 }
		 System.out.println(max);
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 int k = s.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = s.nextInt();
	 	 }
	 	 print(n, num, k);
	 }
}
