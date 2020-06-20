package HashMapHeap2;

import java.io.StreamCorruptedException;
import java.util.*;

public class winner_of_an_election {

	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 int n = scn.nextInt();
 	 	 String[] str = new String[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 str[i] = scn.next();
 	 	 }
 	 	 String[] res = func(str);
 	 	 System.out.print(res[0]);
 	 }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written
 	 // This function takes as input an array of string
 	 // It should return name of winning candidate
 
 	 public static String[] func(String[] arr) {
 
 	 	 // Write your code here
 		 int max = 0;
 		 ArrayList<String> winner= new ArrayList<String>();
 		 HashMap<String	, Integer> hm = new HashMap<String, Integer>();
 		 for(int i=0;i<arr.length;i++)
 		 {
 			 int freq = hm.getOrDefault(arr[i], 0)+1;
 			 hm.put(arr[i], freq);
 			if(max<freq)
 			{
 				max = freq;
 				
 			}
 		 }
 		 for(Map.Entry<String, Integer> entry: hm.entrySet())
 		 {
 			 if(entry.getValue()==max)
 				 winner.add(entry.getKey());
 		 }
 		 String win[] = new  String[winner.size()];
 		 for(int i=0;i<winner.size();i++)
 		 {
 			 win[i]= winner.get(i);
 		 }
 		 String temp;
 		for (int i = 0; i < win.length; i++) 
        {
            for (int j = i + 1; j < win.length; j++) 
            {
                if (win[i].compareTo(win[j])>0) 
                {
                    temp = win[i];
                    win[i] = win[j];
                    win[j] = temp;
                }
            }
        }
// 		 for(int i=0;i<winner.size();i++)
// 		 {
// 			 System.out.println(win[i]);
// 		 }
 		 return win;
 	 }
}
