package HashMapHeap;

import java.util.*;

public class jewels_and_stones {

	 public static void main(String[] args){
         Scanner scn= new Scanner(System.in);
         String J= scn.next();
         String S= scn.next();
         System.out.print(numJewelsInStones(J, S));
     }
     // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input 2 strings.
 	 // It should return an integer value.
     public static int numJewelsInStones(String J, String S) {
         //Write your code here
    	 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    	 for(char c : S.toCharArray())
    	 {
    		 int freq = hm.getOrDefault(c, 0);
    		 hm.put(c, freq+1);
    	 }
    	 int sum= 0;
    	 char ch[]= J.toCharArray();
    	 Arrays.sort(ch);
    	 
    	 for(int i=0;i<ch.length;i++)
    	 {		
    		 char c = ch[i];
    		 int freq = hm.getOrDefault(c, 0);
    		 sum+=freq;
    		 while(i<ch.length-1&&c==ch[i+1]) i++;
    	 }
    	
    	 return sum;
     }
}
