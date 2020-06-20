package HashMapHeap;

import java.util.*;

public class keyboard_row {
	 public static void main(String[] args){
         Scanner scn= new Scanner(System.in);
         int n=scn.nextInt();
         String[] words= new String[n];
         for(int i=0;i<n;i++)
             words[i]=scn.next();
         String[] res= findWords(words);
         for(int i=0;i<res.length;i++)
             System.out.print(res[i]+" ");
         System.out.println();
     }
 
     // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array of string.
 	 // It should return an array of suitable strings.
 	 
     public static String[] findWords(String[] words) {
    	 HashMap<Character,Integer> map=new HashMap<>();
         
         String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
         for(int i=0;i<strs.length;i++){
             for(char ch:strs[i].toCharArray()){
                 map.put(ch,i);
             }
         }
         
         ArrayList<String> res=new ArrayList<>();
         
         for(String s : words)
         {
        	 int mapInd = map.get(s.toUpperCase().charAt(0));
        	 boolean flag = true;
        	 for(char c :s.toUpperCase().toCharArray())
        	 {
        		 if(map.get(c)!=mapInd)
        			 {flag = false;break;}
        	 }
        	 if(flag == true)
        		 res.add(s);
         }
         String st [] = new String[res.size()];
         for(int i=0;i<res.size();i++)
         {
        	 st[i] = res.get(i);
         }
     return st;
     }
}
