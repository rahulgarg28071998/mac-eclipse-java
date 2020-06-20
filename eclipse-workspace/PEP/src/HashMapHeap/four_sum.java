package HashMapHeap;

import java.util.*;

public class four_sum {
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input the head of the linked list.
	 // It should return the head of the modified list.

	 public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {

	 	 // write your code here
		 ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		 Arrays.sort(nums);
		 for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		 for(int i=0;i<nums.length-3;i++)
		 {System.out.println(i+"??????");
			 
			 for(int j = i+1;j<nums.length-2;j++)
			 {
				 System.out.println(j+":::::");
				int left = j+1,right = nums.length-1; 
				 while(left<right)
				 {
					 System.out.println(left+" "+right);
					 int sum = nums[i]+nums[j]+nums[left]+nums[right];
					 if(sum==target)
					 {
						ArrayList<Integer>  a =new ArrayList<Integer>();
						a.add(i);a.add(j);a.add(left);a.add(right);
						arr.add(a);
						System.out.println(nums[i]+" "+nums[j]+" "+nums[left]+" "+nums[right]);
					 }
					if(sum<target) left++;
					else if(sum>target) right--;
				 }
				 while(nums[j]==nums[j+1])
				 {
					 j++;
				 }
			 }
			 
			 while(nums[i]==nums[i+1])
			 {
				 i++;
			 }
		 }
		 
		 return arr;
	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);
	 	 
	 	 int target = sc.nextInt();
	 	 int n = sc.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = sc.nextInt();
	 	 }
	 	 

	 	 ArrayList<ArrayList<Integer>> ans = fourSum(arr, target);

	 	 for (ArrayList<Integer> a : ans) {
	 	 	 for (int element : a) {
	 	 	 	 System.out.print(element + ",");
	 	 	 }
	 	 	 System.out.println();
	 	 }

	 }

}
