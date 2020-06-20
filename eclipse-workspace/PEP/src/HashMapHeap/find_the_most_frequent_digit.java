package HashMapHeap;

import java.util.*
;

public class find_the_most_frequent_digit {

	public static int solve(String s) {
        // write your code here.
		int max = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			hm.put(c, hm.getOrDefault(c, 0)+1);
			max = max<hm.get(c)?hm.get(c):max;
		}
		int keyValue=Integer.MIN_VALUE;
		for(Map.Entry<Character, Integer> entry: hm.entrySet())
		{
			//System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue()==max)
				{
				
				if(entry.getKey()>(keyValue))
				keyValue=entry.getKey();
				}
		}
		
		
		
		return keyValue-'0';
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));

    }
}
