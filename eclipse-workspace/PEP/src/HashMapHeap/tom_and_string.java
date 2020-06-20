package HashMapHeap;

import java.util.Scanner;

public class tom_and_string {

 public static int getHashValue(String line) {
 
	 String st[] = line.split(" ");
	 int finalSum =0;
	 for(String s : st)
	 {
		 int outerSum = 0;
		 for(int i=0;i<s.length();i++)
		 {
			 int elesum = i + getAlphaPos(s.charAt(i)); 
			 outerSum+=elesum;
		 }finalSum+=outerSum;
	 }
	//System.out.println(finalSum);
 return finalSum*st.length;	 	 
 	 }
 
 	 private static int getAlphaPos(char ch) {
	// TODO Auto-generated method stub
 		 if(ch<='z'&&ch>='a')
 			 return (ch-'a');
 		 else if(ch>='1'&&ch<='9')
 			 return (ch-'1')+26;
 		 else if(ch=='0')
 			 return 35;
 		 else if(ch<='Z'&&ch>='A')
 			 return (ch-'A')+36;
	return 0;
}

	public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 String line = scn.nextLine();
 	 	 System.out.println(getHashValue(line));
 	 	// System.out.println(getAlphaPos(scn.next().charAt(0)));
 	 }
 
}
