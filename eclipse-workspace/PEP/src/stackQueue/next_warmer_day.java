package stackQueue;

import java.util.*;

public class next_warmer_day {
	 public static int[] findWarmerTemp(int T[] ){
		  // Write your code here only
		 int num[] = new int[T.length];
		 Stack<Integer> st = new Stack<Integer>();
		 for(int i=T.length-1;i>=0;i--)
		 {
			 while(!st.isEmpty()&&T[st.peek()]<=T[i])
				 st.pop();
			 if(st.isEmpty())
				 num[i]=0;//System.out.println("0");
			 else
				 num[i]=st.peek()-i;//System.out.println(st.peek()-i);
			 st.push(i);
		 }
//		 for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		 return num;
		  }
		  
		  
		  
		  
		  
		  // Dont make changes here
		  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in); 
		  int n=sc.nextInt();
		  int temp[]=new int[n];
		  for(int i=0;i<n;i++)temp[i]=sc.nextInt();
		  int res[]=findWarmerTemp(temp);
		  for(int i=0;i<res.length;i++){
		  	  System.out.println(res[i]);
		  }
		  }
}
