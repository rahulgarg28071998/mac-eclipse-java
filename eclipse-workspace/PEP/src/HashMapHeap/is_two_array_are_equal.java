package HashMapHeap;

import java.util.*;

public class is_two_array_are_equal {

	 public static boolean isTwoArrayEqual(long[] num1, long[] num2) {
 	 	 //write your code here	 	 
 	 HashMap<Long, Integer> hm1 = new HashMap<Long, Integer>();
 	HashMap<Long, Integer> hm2 = new HashMap<Long, Integer>();
 	for(int i =0;i<num1.length;i++)
 	{
 		int freq = hm1.getOrDefault(num1[i], 0);
 		hm1.put(num1[i],freq+1 );
 	}
 	for(int i =0;i<num2.length;i++)
 	{
 		int freq = hm2.getOrDefault(num2[i], 0);
 		//System.out.println(num2[i]);
 		hm2.put(num2[i],freq+1 );
 	}

 	for(Map.Entry<Long, Integer> entry:hm2.entrySet())
 	{
 		//System.out.println(entry.getKey()+" "+entry.getValue()+" "+hm1.getOrDefault(entry.getKey(), 0));
 		if(entry.getValue()!=hm1.getOrDefault(entry.getKey(), 0)) {return false;}
 	}
 return true;
 	 }
 	 //Don't make changes here
 	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 int n = scn.nextInt();
 	 	 long[] num = new long[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 num[i] = scn.nextLong();
 	 	 }
 	 	 int m = n;
 	 	 long[] arr = new long[m];
 	 	 for (int i = 0; i < m; i++) {
 	 	 	 arr[i] = scn.nextLong();
 	 	 }
 	 	 boolean x = isTwoArrayEqual(num, arr);
 	 	 System.out.println(x);
 	 }
 
}
