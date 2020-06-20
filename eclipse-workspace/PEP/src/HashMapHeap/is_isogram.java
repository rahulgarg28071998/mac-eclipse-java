package HashMapHeap;

import java.util.HashSet;
import java.util.Scanner;

public class is_isogram {

		 public static boolean isIsogram(String data) {
		 	 //Write your code here	 
			 HashSet<Character> hs = new  HashSet<Character>();
			 for(int i = 0 ;i<data.length();i++)
			 {
				 if(hs.contains(data.charAt(i))) return false;
				 else hs.add(data.charAt(i));
			 }
			 return true;
		 }

	 //Don't make any changes here
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 String str = s.next();
	 	 System.out.println(isIsogram(str));

	 }
}
