package stackQueue;

import java.util.*;

public class decoding_a_string {
	 public static String decode(String s) {
		 //Write your code here
		 Stack<String> st = new Stack<String>();
		 for(int i=s.length()-1;i>0;i--)
		 {
			 if(st.isEmpty()) st.push(s.charAt(i)+"");
			 else if (Character.isDigit(s.charAt(i)))
			 {
			int count = (int)(s.charAt(i));
			System.out.println(st.peek()+">>>");
		    if(st.peek()=="[") st.pop();
		    String str = st.pop();
			while(!st.isEmpty()&&st.peek()!="]")
			{
				str = str+st.pop();System.out.println(st.peek());
			}st.pop();//for"]}
			String str2 = new String();
			for (int j = 0; j < count; j++) {
				str2 = str2 +str; 
			}
			st.push(str2);
			 }
			 else
				 st.push(s.charAt(i)+"");
			 
			 
		 }
		 return st.peek();
	}
		 
		 
		 //Dont make any changes here
		 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 System.out.println(decode(s));
		 }
}
