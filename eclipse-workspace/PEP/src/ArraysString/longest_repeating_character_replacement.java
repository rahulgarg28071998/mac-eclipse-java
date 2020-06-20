package ArraysString;

import java.util.*;

public class longest_repeating_character_replacement {

	public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 String s = scn.next();
	 	 int k = scn.nextInt();
	 	 System.out.println(characterReplacement(s, k));
	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and integer k.
	 // It should return required output.

	 public static int characterReplacement(String s, int k) {
	 	 // Write your code here
		 int firstWrong = -1,count = 0,length = 0;
		 
		 for(int i=0,j=0;i<s.length()&&j<s.length();)
		 {
			 char c  =s.charAt(i);
			while(s.charAt(j)==c||count<2)
			{
				
				if(s.charAt(j)!=c)
					{count++;firstWrong=j;}
				j++;
			}
			length = length>(i-j)?length:i-j;
			i=firstWrong-1;
			i++;
		 }
		 
		 return 0;
	 }
}
