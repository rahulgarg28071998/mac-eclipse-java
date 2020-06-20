package HashMapHeap2;

import java.util.*;


public class longest_substring_without_repeating_characters {

	 public static int lengthOfLongestSubstring(String s) {
	 	 //Write your code here
	 	 HashSet<Character> hm = new HashSet<Character>();
	 	 int width = 0;
	 	 for(int i=0,j=0;i<s.length()&&j<s.length();)
	 	 {
	 		 while(j<s.length()&&!hm.contains(s.charAt(j)))
	 		 {
	 			// System.out.println(s.charAt(j)+"????");
	 			 hm.add(s.charAt(j));
	 			 j++;
	 		 }
	 		 
	 		 width =hm.size()>width?hm.size():width;
	 		 //System.out.println(width+" "+i+" "+j);
	 		
	 			// System.out.println(s.charAt(i)+"<<<<<<");
	 			 hm.remove(s.charAt(i));
	 			i++;
	 		 
	 	 }
		 return width;
	 	 }
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) {
	 
	 	 	 Scanner s = new Scanner(System.in);
	 	 	 String str = s.next();
	 	 	 System.out.println(lengthOfLongestSubstring(str));
	 
	 	 }
}
