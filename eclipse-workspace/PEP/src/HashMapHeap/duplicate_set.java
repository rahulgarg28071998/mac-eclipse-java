package HashMapHeap;

import java.util.*;

public class duplicate_set {

	public static boolean containsDuplicate(int[] nums) {
	 	  //write your code here
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(hs.contains(nums[i]))
				return true;
			hs.add(nums[i]);
		}
		return false;
	 }
	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 int n = sc.nextInt();

	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = sc.nextInt();
	 	 }

	 	 System.out.println(containsDuplicate(arr));

	 }
}
