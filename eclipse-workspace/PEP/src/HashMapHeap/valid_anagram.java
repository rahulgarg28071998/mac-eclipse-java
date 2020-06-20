package HashMapHeap;

import java.util.*;

public class valid_anagram {


    public static boolean isAnagram(String s, String t) {
        // write your code here.
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
        	int freq = hm.getOrDefault(s.charAt(i), 0);
        	hm.put(s.charAt(i), freq+1);
        }
    	for(int j=0;j<t.length();j++)
    	{
    		int freq = hm.getOrDefault(t.charAt(j), 0);
    		hm.put(t.charAt(j), freq-1);
    	}
    	for(Map.Entry<Character, Integer> entry : hm.entrySet())
    	{
    		if(entry.getValue()<0) return false;
    	}
    	return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (isAnagram(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
