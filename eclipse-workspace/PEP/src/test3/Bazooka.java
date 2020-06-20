package test3;

import java.util.Scanner;

public class Bazooka {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		StringBuilder str [] = new StringBuilder[n];
		for(int i=0;i<n;i++)
		{
			String s = scn.next();
			str[i] = new StringBuilder(s);
			
		}
		int count =0;
		 for (int i = 0; i< n; i++) 
	        { 
	            for (int j = i+1; j< n ; j++) 
	            { 
	                String check_str = ""; 
	       
	                // concatenate both strings 
	                check_str = check_str + str[i] + str[j]; 
	       
	                // check if the concatenated string is 
	                // palindrome 
	                if (isPalindrome(check_str)) 
	                    count++;
	                check_str = "";
	                check_str = check_str + str[j] + str[i];
	                if (isPalindrome(check_str)) 
	                    count++;
	            } 
	        } 

		System.out.println(count);
	}

	static boolean isPalindrome(String str) 
    { 
        int len = str.length(); 
       
                for (int i = 0; i < len/2; i++ ) 
            if (str.charAt(i) != str.charAt(len-i-1)) 
                return false; 
       
        return true; 
    } 
}
