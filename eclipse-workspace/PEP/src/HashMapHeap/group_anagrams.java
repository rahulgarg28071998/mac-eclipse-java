package HashMapHeap;

import java.util.*;

public class group_anagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
        // write your code here.
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		for(int i=0;i<strs.length;i++)
		{
			char ch[] = strs[i].toCharArray();
			
			Arrays.sort(ch);
			String st = String.copyValueOf(ch);
			
			if(hm.containsKey(st))
				{
					ArrayList<String> ar = hm.get(st);
					ar.add(strs[i]);
					hm.put(st, ar);
					
				}
			else
			{
				ArrayList<String> ar = new ArrayList<String>();
				ar.add(strs[i]);
				hm.put(st, ar);
				
			}
//			for(int j=0;j<ch.length;j++)
//			System.out.print(ch[j]);
		}
		ArrayList<List<String>> ls = new ArrayList<List<String>>();
		for (Map.Entry<String,ArrayList<String>> entry : hm.entrySet())  
		{
//			System.out.println("Key = " + entry.getKey().charAt(1) + 
//                             ", Value = " + entry.getValue());
		ls.add(entry.getValue());
		}
		return ls;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Length of the array
        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        List<List<String>> anagramsGrouped = groupAnagrams(arr);

        for (List<String> lst : anagramsGrouped) {
            Collections.sort(lst);
        }

        anagramsGrouped.sort(new ListComparator());

        display(anagramsGrouped);

    }

    // Comparator for sorting the result list.
    static class ListComparator implements Comparator<List<String>> {

        @Override
        public int compare(List<String> l1, List<String> l2) {

            if (l1.size() != l2.size()) {
                return l2.size() - l1.size();
            }

            for (int i = 0; i < l1.size(); i++) {
                String l1str = l1.get(i);
                String l2str = l2.get(i);

                return l1str.compareTo(l2str);

            }

            return 0;

        }
    }

    // Function to display a List of Lists of strings.
    public static void display(List<List<String>> list) {

        for (int i = 0; i < list.size(); i++) {

            List<String> currList = list.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }

            System.out.println();
        }
    }
}
