package ArraysString;

import java.util.Scanner;

public class buy_stock_and_sell_stocks_version2 {

	public static int maxProfit(int[] A) {
        // write your code here. 
        int profit = 0;
        for (int i = 0; i < A.length-1; i++) {
			{
				//System.out.println(A[i]);
				if(A[i]<A[i+1])
				profit+=(A[i+1]-A[i]);
			}
		}
		return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr));
    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
