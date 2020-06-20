package HashMapHeap;

import java.util.HashMap;
import java.util.Scanner;

public class find_distinct_elements {

	 public static int count(int[][] a) {
	 	 //Write your code here
	 	 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	 	 HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
	 	 for(int i:a[0])
	 	 {
	 		 int freq = hm.getOrDefault(i, 0);
	 		 hm.put(i, freq+1);
	 		 //System.out.println(i);
	 	 }
		 for(int i=1;i<a.length;i++)
		 {
			 
			 for(int j=0;j<a[0].length;j++)
			 {
				// System.out.println(a[i][j]);
				 if(hm.containsKey(a[i][j]))
				 {
					
					 int freq = hm.get(a[i][j]);
					 if(freq==1) hm.remove(a[i][j]);
					 int freq2 = temp.getOrDefault(a[i][j], 0);
					 temp.put(a[i][j], freq2+1);
					 //System.out.println(a[i][j]+ " "+freq+" "+(freq2+1));
				 }
				
			 }//System.out.println(">>>>>>>>");
			 hm = (HashMap<Integer, Integer>) temp.clone();
			 temp.clear();
		 }
		 
		 return hm.size();
	 	 }
	 
	 	 //Don't make any changes here
	 	 public static void main(String[] args) {
	 	 	 Scanner in = new Scanner(System.in);
	 	 	 int n = in.nextInt();
	 	 	 int a[][] = new int[n][n];
	 	 	 int i = 0, j = 0;
	 	 	 for (i = 0; i < n; i++) {
	 	 	 	 for (j = 0; j < n; j++) {
	 	 	 	 	 a[i][j] = in.nextInt();
	 	 	 	 }
	 	 	 }
	 	 	 System.out.println(count(a));
	 
	 	 }
}
