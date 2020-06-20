package ArraysString;

import java.util.Scanner;

public class container_with_most_water {

	  public static void main(String[] args){
	         Scanner scn= new Scanner(System.in);
	         int n=scn.nextInt();
	         int[] height= new int[n];
	         for(int i=0;i<n;i++){
	             height[i]=scn.nextInt();
	         }
	         System.out.print(maxArea(height));
	 	 }
	 	 
	    	 // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input an array of heights
	 	 // It should return required output.	  
	 
	 	 public static int maxArea(int[] height) {
	        //Write your code here
	 		 int area = 0,max = 0 ;
	 		 int i = 0 ,j = height.length-1;
	 		 while(i<j)
	 		 {
	 			 area = Integer.min(height[i],height[j])*(j-i);
	 			 max = Integer.max(area, max);
	 			 if(height[i]<=height[j])
	 				 i++;
	 			 else
	 				 j--;
	 			 //System.out.println(height[i]+" "+height[j]+" "+area);
	 		 }
	 		 
	 		 return max;
	 	 }
}
