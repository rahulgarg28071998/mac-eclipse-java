package HashMapHeap;

import java.util.*;

public class subarray_with_0_sum {
	public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);

	 	 int size = scn.nextInt();

	 	 long[] arr = new long[size];

	 	 for (int j = 0; j < size; j++) {
	 	 	 arr[j] = scn.nextLong();
	 	 }

	 	 zerosumarr(arr);

	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array
	 // Print required output
	 static void zerosumarr(long[] arr) {
	 	 // Write your code here
		 long sum = 0,prefSum = 0;
		 int count =0;
		 HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
		 for(int i = 0 ;i<arr.length;i++)
		 {
			 prefSum +=arr[i];
			 if(hm.containsKey(prefSum-sum))
			 {
				 count+=hm.get(prefSum-sum);
			 }
			 int freq = hm.getOrDefault(prefSum, 0);
			 hm.put(prefSum,freq+1);
		 }
		 System.out.println(count);
	 }
}
