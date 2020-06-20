package HashMapHeap;

import java.util.*;

public class find_common_characters {

	 public static ArrayList<Character> commonChars(String[] A) {
	 	 //Write your code here	 	 
	 	 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	 	 HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
		 for(char c : A[0].toCharArray())
		 {
			 int freq = hm.getOrDefault(c, 0);
			 hm.put(c, freq+1);
		 }
		 for(int i = 1 ;i<A.length;i++)
		 {
		 for(int j=0;j<A[i].length();j++)
		 {
			 char c = A[i].charAt(j);
			 if(hm.containsKey(c))
			 {
				 int freq = hm.get(c);
				 if(freq==1) hm.remove(c);
				 else hm.put(c, freq-1);
				 
				 int freq2 = temp.getOrDefault(c, 0);
				 temp.put(c, freq2+1);
				// System.out.println(c+">>>>");
			 }
		 }
		 //System.out.println("<<<<<<<<<");
		 
		 hm = (HashMap<Character, Integer>) temp.clone();
		 temp.clear();
		 }
		ArrayList<Character> ar = new ArrayList<Character>();
		for(Map.Entry<Character, Integer> entry: hm.entrySet())
			{
			//System.out.println(entry.getKey()+" "+entry.getValue());
			for(int i=0;i<entry.getValue();i++)
			{
				ar.add(entry.getKey());
			}
			}
		 return ar;
	 	 }
	 
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) {
	 
	 	 	 Scanner s = new Scanner(System.in);
	 	 	 int n = Integer.parseInt(s.nextLine());
	 	 	 String[] A = new String[n];
	 	 	 for (int i = 0; i < A.length; i++) {
	 	 	 	 A[i] = s.nextLine();
	 	 	 }
	 
	 	 	 ArrayList<Character> res = commonChars(A);
	 	 	 Collections.sort(res);
	 	 	 System.out.println(res);
	 
	 	 }
}
