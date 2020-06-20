package HashMapHeap;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class find_duplicate_in_system {

	 public static ArrayList<ArrayList<String>> findDuplicate(String[] paths) {
		  
 	  	  // write your code here
		 TreeMap<String, ArrayList<String>>  tm = new TreeMap<>();
		 for(int i=0;i<paths.length;i++)
		 {
			 String str[] = paths[i].split(" ");
			 
			 for(int j=1;j<str.length;j++)
			 {
				 String root = str[0]+'/';
				 String key = new String();
				 int k=0;
				 while(str[j].charAt(k)!='(')
				 {
					 root= root+str[j].charAt(k);
					 k++;}
				 k++;//for (
				 while(str[j].charAt(k)!=')')
				 {
					 key= key+str[j].charAt(k);
					 k++;}
				 
				 //System.out.println(key+"   "+root);
				 ArrayList<String> ar = new ArrayList<String>();
				 if(tm.containsKey(key))
				 {
					 ar=tm.get(key);
					 ar.add(root);
					 tm.put(key, ar);
				 }
				 else
				 {
					 ar.add(root);
					 tm.put(key, ar);
				 }
				 
			 }
		 }
		 ArrayList<ArrayList<String>> arst = new ArrayList<ArrayList<String>>();
		 for(Entry<String, ArrayList<String>> entry : tm.entrySet())
		 {
			 //System.out.println(entry.getKey()+" "+entry.getValue());
			 arst.add(entry.getValue());
		 }
		 return arst;
 	  }
 
 	  // -----------------------------------------------------
 
 	  public static void main(String[] args) throws NumberFormatException, IOException {
 	  	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	  	  int n = Integer.parseInt(br.readLine());
 	  	  String[] paths = new String[n];
 
 	  	  for (int i = 0; i < n; i++) {
 	  	  	  paths[i] = br.readLine();
 	  	  }
 	  	  ArrayList<ArrayList<String>> ans = findDuplicate(paths);
 	  	  for (ArrayList<String> val : ans) {
 	  	  	  Collections.sort(val);
 	  	  }
 
 	  	  for (ArrayList<String> val : ans) {
 	  	  	  System.out.println(val);
 	  	  }
 	  }
}
