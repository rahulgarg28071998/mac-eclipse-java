package HashMapHeap;

import java.util.Scanner;

public class notebandi {

	 public static void removeString(String str, String m, String n) {
	 	 //Write your code here
		 boolean ar [] = new boolean[str.length()];
		 for(int i=0;i<str.length();i++)
			ar[i]=true;
		 for(int i=0;i<str.length();i++)
			 for(int j = i;j<=str.length();j++)
			 {//System.out.println(str.substring(i, j));
				 if(str.substring(i, j).equals(m)||str.substring(i, j).equals(n))
				 { 
					 for(int k = i;k<j;k++)
						 {ar[k]=false;
						 //System.out.println(str.charAt(k));
						 }
				 }
			 }
		 
		 for(int i=0;i<str.length();i++)
			if(ar[i])
				System.out.print(str.charAt(i));
			 // System.out.println(ar[i]);
	     }
	 
	 
	 
	     //Dont make chsnges here
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         String str = sc.next();
	         String m = sc.next();
	         String n = sc.next();
	         removeString(str, m, n);
	     }
}
