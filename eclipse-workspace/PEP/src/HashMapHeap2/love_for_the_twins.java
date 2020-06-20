package HashMapHeap2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class love_for_the_twins {

	public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);

	 	 int n = scn.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = scn.nextInt();
	 	 }
	 	 System.out.println(mt(arr));
	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array.
	 // It should return an integer value.
	 public static int mt(int[] arr) {
	 	 // Write your code here
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 for(int i=0;i<arr.length;i++)
		 {
			 int freq = hm.getOrDefault(arr[i], 0);
			 hm.put(arr[i], freq+1);
		 }
		 int count = 0;
		 for(Map.Entry<Integer, Integer> entry :hm.entrySet())
		 {
			 count +=entry.getValue()-(entry.getValue()%2);
		 }
		 return count;
	 }
}
