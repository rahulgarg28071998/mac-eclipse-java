package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class long_parenthesis {

    public static int longestParenthesis(String s){
        // Write your code here
    	
    	Stack<Node> st = new Stack<Node>();
    	st.push(new Node(-1,':'));
    	int count = 0;
    	for(int i=0;i<s.length();i++)
    	{
    		//System.out.println(s.charAt(i));
    		Node n = new Node(i,s.charAt(i));
    		if(s.charAt(i)==')'&&st.peek().ch=='(')
    		{st.pop(); 
    		if(i-st.peek().index>count) count = i-st.peek().index;
    		//System.out.println(s.charAt(i)+"????");
    		}
    		else
    			{st.push(n);
    			//System.out.println(s.charAt(i)+"<<<<<<");
    			}    			
    	}
    	return count;
        }
    
    
  static public class Node{
    	int index;
    	char ch;
    	public Node(int index,char ch)
    	{
    		this.ch = ch;
    		this.index = index;
    	}
    }
    
    	  // Dont make changes here
    	  public static void main (String[] args) {
    	      	  Scanner scn=new Scanner(System.in);
    	      	  int n = scn.nextInt();
    	          String s=scn.next();
    	          System.out.println(longestParenthesis(s));
    
    	      
    	  }
}
