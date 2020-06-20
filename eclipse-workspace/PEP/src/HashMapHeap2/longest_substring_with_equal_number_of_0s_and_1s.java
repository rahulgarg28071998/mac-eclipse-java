package HashMapHeap2;

import java.util.HashMap;
import java.util.Scanner;

public class longest_substring_with_equal_number_of_0s_and_1s {

	 public static void print(char[] A) {
	 	 //Writ your code here.
		 int arr[] = new int[A.length+1];
		 arr[0]=-1;
		 for(int i=1;i<=A.length;i++)
		 { 
			 arr[i] = A[i-1]-'0';
			 if(arr[i]==0)
				 arr[i]=-1;
		 }
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 int sum=0,max=-1;
		 for(int i=0;i<=A.length;i++)
		 {
			 sum +=arr[i]; 
			 if(!hm.containsKey(sum))
			 {
				 hm.put(sum, i);
			 }
			 else
			 {
				 int freq =i- hm.get(sum);
				 //System.out.println(freq);
				 max = max>freq?max:freq;
				 
			 }
		 }
		 System.out.println(max);
		
	 	 	 
	 	 }
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) {
	 
	 	 	 Scanner s = new Scanner(System.in);
	 	 	 String str = s.next();
	 	 	 char[] ans = str.toCharArray();
	 	 	 print(ans);
	 	 }
}
