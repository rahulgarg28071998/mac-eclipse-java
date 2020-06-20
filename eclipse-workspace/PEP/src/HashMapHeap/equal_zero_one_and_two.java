package HashMapHeap;

import java.util.*;

public class equal_zero_one_and_two {

	static class pair{
		int oneToZero;
		int twoToone;
		pair(int a,int b)
		{
			oneToZero = a;
			twoToone = b;
		}
	}
    public static void equal_012(String line) {
        // Write your code here
    	HashMap<pair, Integer> hm = new  HashMap<pair, Integer>();
    	int arr[] = new int[3];
    	pair p = new pair(0, 0);
    	hm.put(p, 0);
    	for(int i=0;i<line.length();i++)
    	{
    		int n = Integer.parseInt(line.charAt(i)+"");
    		arr[n]++;
    		p = new pair(arr[1]-arr[0], arr[2]-arr[1]);
    		hm.put(p, hm.containsKey(p)?hm.get(p)+1:0);
    		for(int j=0;j<3;j++) System.out.print(arr[j]);
    		System.out.println();
    	}
    	// using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<pair,Integer> entry : hm.entrySet())  
            System.out.println("Key = " + entry.getKey().oneToZero+ "&&"+ entry.getKey().twoToone
                             +", Value = " + entry.getValue()); 
    }

    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        equal_012(sc.next());

    }

}
