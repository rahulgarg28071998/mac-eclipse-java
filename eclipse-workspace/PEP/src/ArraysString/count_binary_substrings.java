package ArraysString;

import java.util.*;

public class count_binary_substrings {

    public static void main(String[] args){
        Scanner scn= new Scanner (System.in);
        String s=scn.next();
	 	 System.out.print(countBinarySubstrings(s));
	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input a string
	 // It should return the required output

    public static int countBinarySubstrings(String s) {
	 	 //write code here
    	int prev = 0,cur = 1,ans = 0;
    	for(int i=1;i<s.length();i++)
    	{
    	
    		 if (s.charAt(i-1) != s.charAt(i)) {
                 ans += Math.min(prev, cur);
                 prev = cur;
                 cur = 1;
             } else {
                 cur++;
             }
    	}
    	
    	return ans+Math.min(prev, cur);
	 }
}
