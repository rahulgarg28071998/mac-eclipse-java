package HashMapHeap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairSumDivisibilty {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //System.out.println((int)(n%K));
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i] = sc.nextInt();
    }
    int K = sc.nextInt();
    System.out.println(isDivisble(arr,K));
}

private static boolean isDivisble(int[] arr, int k) {
	HashMap<Integer, Integer> hm  = new HashMap<Integer, Integer>();
	for(int i=0;i<arr.length;i++)
	{
		int freq = 1 ;
		
		if(hm.containsKey(arr[i]%k)) freq = hm.get(arr[i]%k)+1;
		hm.put(arr[i]%k,freq );
	}
	if(hm.containsKey(0)&& hm.get(0)%2!=0) return false;
	 for (Map.Entry<Integer,Integer> entry : hm.entrySet())  
	 {	int freq = entry.getValue();
	 	int key = entry.getKey();
		 if(hm.containsKey(k-key)&&hm.get(k-key)!=freq)
		 {
			return false;
		 }
//       System.out.println("Key = " + entry.getKey()
//       +", Value = " + entry.getValue()); 
	 }

 
	return true;
}
}
