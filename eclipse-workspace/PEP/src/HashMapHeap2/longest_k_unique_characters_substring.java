package HashMapHeap2;

import java.io.*;
import java.util.HashMap;


public class longest_k_unique_characters_substring {

	 public static void print(String str, int k) {
	 	 //Write your code here	 	
		 int max = 0;
		 HashMap<Character, Integer> hm  = new HashMap<Character, Integer>();
		 for(int i=0,j=0;i<str.length()&&j<str.length();)
		 {
			 while(j<str.length()&&(hm.size()!=k||hm.containsKey(str.charAt(j))))
			 {
				
				 int freq = hm.getOrDefault(str.charAt(j), 0);
				hm.put(str.charAt(j), freq+1);
				//System.out.println(str.charAt(j)+">>>>>>>.");
				j++;
			 }
			
			 max = max>(j-i)?max:(j-i);
			// System.out.println(max);
			 while(hm.size()==k&&i<=j)
			 {
				 int freq = hm.get(str.charAt(i));
				 //System.out.println(hm.containsKey('c'));
				 if(freq==1)
				 { hm.remove(str.charAt(i));}
				 
				 
				 else
				 { hm.put(str.charAt(i), freq-1);}
					 
				i++;
			 }
			 
		 }
		 System.out.println(max);
	 	 }
	 
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) throws IOException {
	 	 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 	 	 String s = br.readLine();
	 	 	 int k = Integer.parseInt(br.readLine());
	 	 	 print(s, k);
	 	 }
	 
}
