package stackQueue;

import java.util.Scanner;

public class find_the_next_larger_element {


	  static class stack 
	  { 
	  	  int top; 
	  	  int items[] = new int[100]; 

	  	  // Stack functions to be used by printNGE 
	  	  void push(int x) 
	  	  { 
	  	  	  if (top == 99) 
	  	  	  { 
	  	  	  	  System.out.println("Stack full"); 
	  	  	  } 
	  	  	  else
	  	  	  { 
	  	  	  	  items[++top] = x; 
	  	  	  } 
	  	  } 
	  	int peek() 
	  	  {  if (top == -1) 
  	  	  { 
  	  	  	  
  	  	  	  return -1; 
  	  	  } 
  	  	  else
  	  	  { 
  	  	  	   
  	  	  	  return items[top]; 
  	  	  } 
	  	  } 

	  	  int pop() 
	  	  { 
	  	  	  if (top == -1) 
	  	  	  { 
	  	  	  	  System.out.println("Underflow error"); 
	  	  	  	  return -1; 
	  	  	  } 
	  	  	  else
	  	  	  { 
	  	  	  	  int element = items[top]; 
	  	  	  	  top--; 
	  	  	  	  return element; 
	  	  	  } 
	  	  } 

	  	  boolean isEmpty() 
	  	  { 
	  	  	  return (top == -1) ? true : false; 
	  	  } 
	  } 

	  /* prints element and NGE pair for 
	  all elements of arr[] of size n */
	  static void printNGE(int arr[], int n) 
	  { 
		  stack st = new stack();
		  int ans[] = new int[n];
		  for(int i=arr.length-1;i>=0;i--)
		  {

  	  	  	  while (!st.isEmpty() && st.peek()<= arr[i]) {
  	  	  	  	  st.pop();
  	  	  	  }
  	  	  	  if(st.isEmpty())
  	  	  	  {	ans[i] = -1;}
  	  	  		
  	  	  	  else 
  	  	  		  {ans[i]=st.peek();}
  	  	  	  st.push(arr[i]);
  	  	  	 
		  }
		 for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	  } 

	  public static void main(String[] args) 
	  { 	  Scanner sc=new Scanner(System.in);
	  	  int n=sc.nextInt();
	  	  int arr[] = new int[n];
	  	  for(int i=0;i<n;i++)arr[i]=sc.nextInt(); 
	  	  printNGE(arr, n); 
	  } 
}
