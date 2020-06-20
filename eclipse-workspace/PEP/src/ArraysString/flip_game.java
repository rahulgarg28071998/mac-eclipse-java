package ArraysString;

import java.util.*;

public class flip_game {

	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 String s = scn.next();
 	 	 List<String> res = generatePossibleNextMoves(s);
 	 	 System.out.print(res);
 	 }
 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input a string
 	 // It should return required List
 
 	 public static List<String> generatePossibleNextMoves(String s) {
 	 	 // Write your code here
 		 
 		 List<String> ls = new ArrayList<String>();
 		 String str = s;
 		 int i=0;
 		 while(i<s.length()-1)
 		 {
 			 str = s ;
 			// System.out.println(str);
 			 if(str.charAt(i)=='+'&&str.charAt(i+1)=='+')
 			 { str = str.substring(0,i)+"--"+str.substring(i+2, str.length());
 			   ls.add(str);
 			  // System.out.println(str);
 			 }
 			 i++;
 			 
 		 }
 		 
 		 return ls;
 	 }
}
