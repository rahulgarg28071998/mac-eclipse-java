package HashMapHeap;

import java.util.*;

public class lpo {

	
	 public static int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
 	 	 //write your code here
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 //int maxCapital = W;
		 for(int i=0;i<=k;i++)
		 {
			 for(int j = 0;j<Profits.length;j++)
			 {//System.out.println(Profits[j]);
				 if(W<=Capital[j]) {pq.add(Profits[j]-Capital[j]);
				 //System.out.println(Profits[j]-Capital[j]+"///");
				 //Capital[j]=Integer.MAX_VALUE;
				 }
			//System.out.println(j);	 
			 }
			 //System.out.println(">>>>>>>>>");
			 if(!pq.isEmpty())
			 {//System.out.println(pq.peek()+">>>>");
			 W=W+pq.remove();}
		 }
		 return W;
 	 }
 
 	 // -----------------------------------------------------
 
 	 public static void main(String[] args) {
 	 	 Scanner sc = new Scanner(System.in);
 
 	 	 int k = sc.nextInt();
 	 	 int w = sc.nextInt();
 
 	 	 int n = sc.nextInt();
 	 	 int[] profits = new int[n];
 	 	 int[] capital = new int[n];
 
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 profits[i] = sc.nextInt();
 	 	 }
 
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 capital[i] = sc.nextInt();
 	 	 }
 
 	 	 System.out.println(findMaximizedCapital(k, w, profits, capital));
 
 	 }
 
 
}
