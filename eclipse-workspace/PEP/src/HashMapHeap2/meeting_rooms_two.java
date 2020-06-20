package HashMapHeap2;

import java.util.*;

public class meeting_rooms_two {

	 public static int minMeetingRooms(int[][] intervals) {
         // write your code here.
         PriorityQueue<Integer> start = new PriorityQueue<Integer>();
         PriorityQueue<Integer> end = new PriorityQueue<Integer>();
       
         //System.out.println(start.peek()+" "+end.peek());
         int arr[] = new int[intervals.length];
         int arr2[] = new int[intervals.length];
         for(int i=0;i<intervals.length;i++)
         {
        	 arr[i]= intervals[i][0];
        	 arr2[i]= intervals[i][1];
         }
         Arrays.sort(arr);
         Arrays.sort(arr2);
         int i=0,j=0,count = 0,max = 0;
         
         while(i<intervals.length)
         {
        	 if(arr[i]<arr2[j])
        	 {
        		 //System.out.println(arr[i]+" "+count+">>>>>>>>");
        		 i++;
        		 count++;
        		 
        	 }
        	 else
        	 {
        		 //System.out.println(arr2[j]+" "+count);
        		 j++;
        		 count--;
        	 }
        	 max = max>count?max:count;
        	 
         }
		 return max;
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Input for number of meetings.
         int N = sc.nextInt();
 
         int[][] intervals = new int[N][2];
 
         int start, end;
         // Input for intervals.
         for (int i = 0; i < intervals.length; i++) {
 
             start = sc.nextInt();
             end = sc.nextInt();
 
             intervals[i][0] = start;
             intervals[i][1] = end;
         }
 
         int result = minMeetingRooms(intervals);
 
         System.out.println(result);
 
     }
 
     // Function to display a 2D array.
     public static void display(int[][] arr) {
 
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[0].length; j++) {
                 System.out.print(arr[i] + " ");
             }
             System.out.println();
         }
 
         
     }
 
}
