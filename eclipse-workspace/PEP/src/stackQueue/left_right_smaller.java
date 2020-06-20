package stackQueue;

import java.util.*;

public class left_right_smaller {

	static int findMaxDiff(int A[], int N)
    { // Write your code here
		
		int maxDiff = Integer.MIN_VALUE;
		Stack<Integer> st1 = new Stack<Integer>();
		int arr[] = new int[N];
		for(int i=0;i<A.length;i++)
		{
			while(!st1.isEmpty()&&st1.peek()>=A[i])
				{st1.pop();}
			if(st1.isEmpty())
				{arr[i] = 0;}
			else
				{arr[i]=st1.peek();}
			st1.push(A[i]);
		}
		st1 = new Stack<Integer>();
		for(int i=A.length-1;i>=0;i--)
		{
			while(!st1.isEmpty()&&st1.peek()>=A[i])
				{st1.pop();}
			if(st1.isEmpty())
				{
				
				 int n = Math.abs(arr[i]-0);
				// System.out.println(arr[i]+"0 "+n);
				 maxDiff= maxDiff>n?maxDiff:n;
				}
			else
				{
				
				int n = Math.abs(arr[i]-st1.peek());
				//System.out.println(arr[i]+" "+st1.peek()+" "+n);
				maxDiff= maxDiff>n?maxDiff:n;
				}
			st1.push(A[i]);
		}
		return maxDiff;
    }

	 // Dont make changes here
    public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 int N=sc.nextInt();
    	 int[] A=new int[N];
    	 for(int i=0;i<N;i++)A[i]=sc.nextInt();
    	 System.out.println(findMaxDiff(A, N));
    }
}
