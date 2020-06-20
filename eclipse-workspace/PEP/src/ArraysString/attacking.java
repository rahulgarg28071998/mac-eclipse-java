package ArraysString;

import java.util.Scanner;

public class attacking {

	 public static int findPoisonedDuration(int[] timeSeries, int duration) {
         //Write your code here
		 int time = 0;
		 for(int i=0;i<timeSeries.length;i++)
		 {
			if(i<timeSeries.length-1&&timeSeries[i]+duration>timeSeries[i+1])
			{
				time +=(timeSeries[i+1]-timeSeries[i]);
			}
			else
			{
				time+=duration;
			}
				 
		 }
		 
		 return time;
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();
         int[] timeseries = new int[n];
         for (int i = 0; i < n; i++) {
             timeseries[i] = sc.nextInt();
         }
         System.out.println(findPoisonedDuration(timeseries, k));
     }
}
