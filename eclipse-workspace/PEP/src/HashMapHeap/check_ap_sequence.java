package HashMapHeap;

import java.util.*;

public class check_ap_sequence {

	public static boolean checkAP(int[] arr) {
	 	 //Write your code here
		HashSet<Integer> hs = new HashSet<Integer>();
		int max = arr[0],min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
			max = max<arr[i]?arr[i]:max;
			min = min>arr[i]?arr[i]:min;
		}
		//System.out.println(max+" "+min);
		int d = (max-min)/(arr.length-1);
		//System.out.println(d);
		for(int i=0;i<arr.length;i++)
		{
			int an = min+i*d;
			//System.out.println(an);
			if(!hs.contains(an))
				return false;
		}
		return true;

	 }


	 //Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = scn.nextInt();
	 	 	 }
	 	 	 boolean x = checkAP(num);
	 	 	 System.out.println(x);
	 }
}
