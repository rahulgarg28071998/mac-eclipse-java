package HashMapHeap2;

import java.util.*;

public class word_pattern {

	public static void main(String[] args) {
	 	 Scanner scn= new Scanner(System.in);
	 	 String pattern= scn.nextLine();
	 	 String str= scn.nextLine();
	 	 System.out.println(wordPattern(pattern,str));
	 }
   	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 strings
	 // It should return a boolean value

	 static Boolean wordPattern(String pattern, String str) {    
	 //Write your code here
		 String pat[] = str.split(" ");
		 HashSet<String> hs= new HashSet<String> ();
		 for(int i=0;i<pat.length;i++)
		 {
			 hs.add(pat[i]);
		 }
		 HashMap<Character, String> hm = new HashMap<Character, String>();
		 for(int i=0;i<pattern.length();i++)
		 {
			 if(!hm.containsKey(pattern.charAt(i)))
			 {
				 hm.put(pattern.charAt(i), pat[i]);
				// System.out.println(pattern.charAt(i)+" "+pat[i]);
				 
			 }
			 else
			 {
				 if(!hm.get(pattern.charAt(i)).equals(pat[i]))
				 { return false;}
			 }
		 }
		 for(Map.Entry<Character, String> entry: hm.entrySet())
		 {
			 if(hs.contains(entry.getValue()))
			 {
				 hs.remove(entry.getValue());
			 }
			 else
				 return false;
		 }
		 return true;
	 }
	 
}
