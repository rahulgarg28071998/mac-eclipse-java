package HashMapHeap2;

import java.io.*;
import java.util.HashSet;

public class largest_fibonacci_subsequence {
	   public static void solve(int[] arr) {
	         //Write your code here
		   int a =0,b=1;;
		   HashSet<Integer> hs = new HashSet<Integer>();
		   for(int i=0;i<100;i++)
		   {
			   int temp = a+b;
			   hs.add(temp);
			   b = a;
			   a = temp;
			  // System.out.println(temp);
		   }
		   for(int i=0;i<arr.length;i++)
		   {
			   if(hs.contains(arr[i]))
				   System.out.print(arr[i]+" ");
		   }
	     }
	 
	     public static void main(String[] args) throws IOException {
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	         int n = Integer.parseInt(br.readLine());
	         String[] s = br.readLine().split(" ");
	         int[] num = new int[n];
	         for (int i = 0; i < n; i++) {
	             num[i] = Integer.parseInt(s[i]);
	         }
	         solve(num);
	     }
}
