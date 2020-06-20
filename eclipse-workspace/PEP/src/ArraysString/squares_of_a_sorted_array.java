package ArraysString;

import java.util.Scanner;

public class squares_of_a_sorted_array {

	public static int[] sortedSquares(int[] A) {
        // write your code here. 
		int i=0,j = A.length-1,k=A.length-1;
		int ans[] = new int[A.length];
		while(i<=j)
		{
			if(A[i]*A[i]<A[j]*A[j])
			{	
				ans[k] = A[j]*A[j];
				j--;
			}
			else
			{
				ans[k] = A[i]*A[i];
				i++;
			}
			//System.out.println(i+" "+j+" "+k);
			k--;
		}
		
		return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of array.
        int length = sc.nextInt();

        int[] arr = new int[length];

        // Input for elements of array.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = sortedSquares(arr);
        display(result);

    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
