package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class print_binary_numbers {

	   public static void getBinary(int n){
	         //write your code here
	  Queue<String> qu = new LinkedList<String>();
	  qu.add("1");
	  int i = n;
	  while(n>0)
	  {
		  String str = qu.remove();
		  qu.add(str+"0");
		  qu.add(str+"1");
		  System.out.print(str+" ");
		  n--;
	  }

	      }
	  	  public static void main (String[] args)  {
	  	      
	  	  Scanner scn=new Scanner(System.in);
	  	   int n = scn.nextInt();
	  	   getBinary(n);
	  	          
	  	      
	  	  }
}
