package HashMapHeap2;

import java.util.HashSet;
import java.util.Scanner;

public class unique_numbers {

	 public static void main(String[] args) {
 	 	 // TODO Auto-generated method stub
 	 	 Scanner scn = new Scanner(System.in);
 	 	 int l = scn.nextInt();
 	 	 int r = scn.nextInt();
 	 	 numners(l, r);
 	 }
 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input two numbers as range
 	 // It should print required output
 
 	 public static void numners(int l, int r) {
 	 	 // Write your code here
 		 HashSet<Integer> hs = new HashSet<Integer>();
 		 for(int i=l;i<=r;i++)
 		 {
 			 int rem = 0;
 			
 			 int temp = i;
 			 boolean flag = true;
 			 while(temp!=0)
 			 {
 				rem = temp%10;
 				temp = temp/10;
				 
 				// System.out.println(temp+" "+rem);
 			 
 				 if(hs.contains(rem))
 					{flag = false;break;}
 				 else
 					 hs.add(rem);
 				 
 				 
 			 }
 			 if(flag==true)
 				 System.out.println(i);
 			 hs.clear();
 		 }
 	 }
}
