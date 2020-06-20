package HashMapHeap;

import java.io.*;

public class height_of_heap {


	 public static void main (String[] args) throws IOException
	  {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 	 	 int n = Integer.parseInt(br.readLine());
	 	 	 String[] s = br.readLine().split(" ");
	 	 	 int x=solve(n);
	 	 	 System.out.println(x);
	 }
     	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and n length of array.
	 // It should return an integer value.

	 private static int solve(int N) {
//Write your code here
		 int size = (int)Math.floor(Math.log10(N+1)/Math.log10(2));
		 return size;
	 }
	 
//	 public static int log2(int N)
//	 {
//		 int h=0;
//		 while((1<<h)<N)
//		 {
//			 h++;
//		 }
//		 return h;
//	 }
}
