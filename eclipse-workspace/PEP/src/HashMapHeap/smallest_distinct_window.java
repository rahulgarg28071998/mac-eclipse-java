package HashMapHeap;

import java.util.*;

public class smallest_distinct_window {

	public static int minLength(String s) {
        //write your code here
		HashSet<Character> hs =new HashSet<Character>();
		HashMap<Character, Integer> hm  = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		int i=0,j=0,count = 0,min = s.length();;
		while(i<s.length()&&j<s.length())
		{
			while(hs.size()!=hm.size()&&j<s.length())
			{
				int n = hm.getOrDefault(s.charAt(j), 0)+1;
				hm.put(s.charAt(j), n);
				j++;
			}
			if(hs.size()==hm.size())
			count++;
			
			while(hs.size()==hm.size()&&i<=j)
			{i++;
				if(j-i<=min) {min=(j-i);}
				System.out.println(s.substring(i-1,j+1)+hm.size());
				count++;
				
				
				if(hm.get(s.charAt(i))==1)
					{hm.remove(s.charAt(i));System.out.println("hh"+hm.size());}
				else
					hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
			}
		}
		return min;
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(minLength(sc.next()));
        
    }
}
