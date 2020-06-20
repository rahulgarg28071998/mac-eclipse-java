package HashMapHeap;

import java.util.*;

public class identify_string {
	static class Pair{
		char ch;
		int freq;
		public Pair(char ch,int count) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			this.freq = count;
		}
	}
	static class PairComparator implements Comparator<Pair>{ 
        
        // Overriding compare()method of Comparator  
                    // for descending order of cgpa 
        public int compare(Pair s1, Pair s2) { 
            if(s1.freq!=s2.freq)
        	return s2.freq-s1.freq;
            return s1.ch-s2.ch;
            } 
    } 
	public static String reorganizeString(String S) {
	 	  //write code here
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int max = 0;
		for (int i = 0; i < S.length(); i++) {
			int c = hm.getOrDefault(S.charAt(i), 0)+1;
			hm.put(S.charAt(i), c);
			max = max<c?c:max;
		}
		if(max>(S.length()+1)/2)
			return "";
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(hm.size(),new PairComparator());
		 for (Map.Entry<Character,Integer> entry : hm.entrySet())  
		 {
			 pq.add(new Pair(entry.getKey(),entry.getValue()));
		 }
		 
		 //System.out.println(pq.peek().ch);
	     while(pq.size()>1)
	     {
	    	 Pair p1 = pq.remove();
	    	 System.out.print(p1.ch);
	    	do
	    	 {
	    		 Pair p2 = pq.remove();
	    		 System.out.print(p2.ch);
	    		 if(p2.freq!=1)
	    	    	 pq.add(new Pair(p2.ch,p2.freq-1));
	    	 } while(!pq.isEmpty()&&pq.peek().freq==p1.freq);
	    	 if(p1.freq!=1)
		    	 { pq.add(new Pair(p1.ch,p1.freq-1));}
//	    	 
//	    	 Pair p1 = pq.remove();
//	    	 Pair p2 = pq.remove();
//	    	 System.out.print(p1.ch+""+p2.ch);
//	    	 if(p1.freq!=1)
//	    	 { pq.add(new Pair(p1.ch,p1.freq-1));}
//	    	 if(p2.freq!=1)
//	    	 pq.add(new Pair(p2.ch,p2.freq-1));
	    	 
	     }
	     if(pq.size()>0)
	    	 System.out.print(pq.peek().ch);
		
		return " "; 
	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 String s = sc.next();

	 	 System.out.println(reorganizeString(s));

	 }
}
