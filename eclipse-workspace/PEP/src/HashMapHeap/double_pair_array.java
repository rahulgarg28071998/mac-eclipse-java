package HashMapHeap;

import java.util.*;

public class double_pair_array {

	public static boolean canReorder(int[] A) {
		// Write your code here
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		//if(A.length==10) 
		for (int i = 0; i < A.length; i++) {
			int freq = hm.getOrDefault(A[i], 0);
			hm.put(A[i], freq + 1);
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			int freq = entry.getValue();
			int num = entry.getKey();
			if (num != 0) {
				if (hm.containsKey(num / 2)) {
					{freq = freq - hm.get(num / 2);}
				} else if (hm.containsKey(num * 2))
					freq = freq - hm.get(num * 2);
				if (freq != 0)
					{System.out.println(entry.getKey());
					return false;}
			} 
			else {
				if (freq % 2 != 0)
					return false;
			}
		}

		return true;
	}
    
    
    
    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        System.out.println(canReorder(a));

    }
}
