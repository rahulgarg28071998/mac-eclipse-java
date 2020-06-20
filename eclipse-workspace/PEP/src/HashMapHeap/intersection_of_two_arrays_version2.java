package HashMapHeap;

import java.util.*;

public class intersection_of_two_arrays_version2 {

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums1= new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=scn.nextInt();
        }
        int m= scn.nextInt();
        int[] nums2= new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=scn.nextInt();
        }
        int[] res=intersect(nums1, nums2);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
        System.out.println();
    }
       	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 arrays and m, n as lengths.
	 // It should return required output.
    public static int[] intersect(int[] nums1, int[] nums2) {
       //Write your code here
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums1.length; i++) {
			int freq = hm.getOrDefault(nums1[i], 0);
			hm.put(nums1[i], freq+1);
		}
    	ArrayList<Integer> ar = new ArrayList<Integer>();
    	for(int i=0;i<nums2.length;i++)
    	{
    		if(hm.containsKey(nums2[i]))
    		{
    			ar.add(nums2[i]);
    			int fre = hm.get(nums2[i]);
    			if(fre==1)
    				hm.remove(nums2[i]);
    			else
    				hm.put(nums2[i], fre-1);
    		}
    		
    	}
    	int arr[]=new int[ar.size()];
    	for(int i=0;i<ar.size();i++)
    		arr[i] = ar.get(i);
    	return arr;
    }
}
