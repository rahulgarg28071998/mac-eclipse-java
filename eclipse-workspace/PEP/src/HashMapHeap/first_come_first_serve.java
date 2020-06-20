package HashMapHeap;

import java.util.*;

public class first_come_first_serve {

	public static void main (String[] args)
	  {
	       Scanner scn = new Scanner(System.in);
	 	 	 int n = scn.nextInt();
	 	 	 int k=scn.nextInt();
	 	 	 int[] num = new int[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	     num[i]= scn.nextInt();
	 	 	 }
	 	 	 solve(num,k);
	  }
	  
   // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and k occurunces.
	 // Print id of customer which will be served first.
	  public static  void solve(int[] arr,int k){
	     //Write your code here
		  HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  int freq = hm.getOrDefault(arr[i], 0);
			  hm.put(arr[i], freq+1);
		  }
		  boolean flag = true;
		  for(int i =0;i<arr.length;i++)
		  {
			  int freq = hm.get(arr[i]);
			  if(freq==k) {System.out.println(arr[i]);flag=false;break;}
		  }
		  if(flag==true) System.out.println("-1");
	  }
}
