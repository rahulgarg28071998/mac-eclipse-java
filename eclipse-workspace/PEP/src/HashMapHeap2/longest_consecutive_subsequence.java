package HashMapHeap2;

import java.io.IOException;
import java.util.*;

public class longest_consecutive_subsequence {

	 public static int consecuitveSub(int n, int[] arr) {
	        //Write oyur code here
		 HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		 for(int i=0;i<n;i++)
			 hm.put(arr[i], true);
		 ArrayList<Integer> ar = new ArrayList<Integer>();
		 for(Map.Entry<Integer, Boolean> entry : hm.entrySet())
		 {
			 if(hm.containsKey(entry.getKey()-1))
			 { entry.setValue(false);}
			 else
				 ar.add(entry.getKey());
		 }
		 int max = 0;
		 //System.out.println(ar);
		 for(int i=0;i<ar.size();i++)
		 {
			 int count = 1;
			 int temp = ar.get(i);
			 while(hm.containsKey(temp+1))
			 {
				 temp++;
				 count++;
				 
			 }
			 max= max>count?max:count;
		 }
		 return max;
	     }
	 
	     public static void main(String[] args) throws IOException {
	         Scanner sc = new Scanner(System.in);
	         int n = sc.nextInt();
	         int[] num = new int[n];
	         for (int i = 0; i < n; i++) {
	             num[i] = sc.nextInt();
	         }
	         System.out.println(consecuitveSub(n, num));
	 
	     }
}
