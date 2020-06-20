package test3;

import java.util.*;

public class Mustabg2 {

	 public static int minRefuelStops(int target, int tank, int[][] stations) {
	        
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	        int ans = 0, prev = 0;
	        for (int[] station: stations) {
	            int location = station[0];
	            int capacity = station[1];
	            tank -= location - prev;
	            while (!pq.isEmpty() && tank < 0) {  // must refuel in past
	                tank += pq.poll();
	                ans++;
	            }

	            if (tank < 0) return -1;
	            pq.offer(capacity);
	            prev = location;
	        }
	        {
	            tank -= target - prev;
	            while (!pq.isEmpty() && tank < 0) {
	                tank += pq.poll();
	                ans++;
	            }
	            if (tank < 0) return -1;
	        }

	        return ans;
	    }
	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int des = sc.nextInt();
		int fuel  = sc.nextInt();
		int n = sc.nextInt();
		int station[][] = new int[n][2];
		for(int i = 0;i<n;i++)
			station[i][0] = sc.nextInt();
		for(int i = 0;i<n;i++)
			station[i][1] = sc.nextInt();
//		for(int i=0;i<n;i++)
//			System.out.println(station[i][1]);
		System.out.println(minRefuelStops(des, fuel,station));
	}


}
