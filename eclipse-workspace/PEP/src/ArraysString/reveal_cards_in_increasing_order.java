package ArraysString;

import java.util.*;

public class reveal_cards_in_increasing_order {

	public static int[] deckRevealedIncreasing(int[] deck) {
	 	 //write code here
		int n = deck.length;
		Arrays.sort(deck);
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<n;i++)
			q.add(i);
		
		int reveal[] = new int[n];
		int i = 0;
		while(q.size()>=2)
		{
			reveal[i] = q.remove();
			q.add(q.remove());
			i++;
		}
		if(!q.isEmpty())
			reveal[i] = q.remove();
		int order[] = new  int[n];
		for(i=0;i<n;i++)
			{order[reveal[i]] = deck[i];
			System.out.println(reveal[i]);}
		return order;
	 }
	 // 7 17 13 11 2 3 5 7-----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 int n = sc.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = sc.nextInt();
	 	 }

	 	 int[] ans = deckRevealedIncreasing(arr);
	 	 for (int val : ans) {
	 	 	 System.out.print(val + " ");
	 	 }
	 }
}
