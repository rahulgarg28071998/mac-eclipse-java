package HashMapHeap;

import java.util.*;

public class longest_k_unique_characters_substring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int k = scn.nextInt();
		String str = scn.next();
		System.out.println(LongestSub(str,k));
	}

	private static int LongestSub(String str,int k) {
		// TODO Auto-generated method stub
		HashSet<Character> hs = new HashSet<Character>(k);
		int len = 0;
		for(int i=0;i<k;i++)
			hs.add(str.charAt(i));
		for(int i=0,j=0;i<str.length()&&i>=j;i++)
		{
			if(hs.contains(str.charAt(i)))
			{	len++;System.out.println(str.charAt(i));}
			else
			{
				hs.remove(str.charAt(j));
				hs.add(str.charAt(i));
				j++;
				
				len--;
			}
			System.out.println(len);
		}
		return 0;
	}
}
