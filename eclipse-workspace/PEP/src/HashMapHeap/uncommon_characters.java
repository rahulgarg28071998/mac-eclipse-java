package HashMapHeap;

import java.util.*;

public class uncommon_characters {

	 public static void uncommon(String str1, String str2) {
	 	 //Write your code here	 
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<str1.length();i++)
		{
			hm.put(str1.charAt(i), 0);
		}
		for(int i=0;i<str2.length();i++)
		{
			if(hm.containsKey(str2.charAt(i))&&hm.get(str2.charAt(i))!=1)
				hm.put(str2.charAt(i), 2);
			else
				hm.put(str2.charAt(i), 1);
		}
		ArrayList<Character> arr = new   ArrayList<Character>();
		for(Map.Entry<Character, Integer> entry: hm.entrySet())
		{
			if(entry.getValue()==0||entry.getValue()==1)
				arr.add(entry.getKey());
		}
		Collections.sort(arr);
		String s = new String();
		for(int i=0;i<arr.size();i++)
		{
			s = s+arr.get(i);
		}
		System.out.println(s);
	 	 }
	 
	 	 //Don't make any changes here
	 	 public static void main(String[] args) {
	 	 	 Scanner sc = new Scanner(System.in);
	 	 	 String str1 = sc.next();
	 
	 	 	 String str2 = sc.next();
	 
	 	 	 uncommon(str1, str2);
	 
	 	 }
}
