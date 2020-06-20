package test3;

import java.util.*;

public class Four_Sum {

	public static void quadTuple(int[] A, int sum)
	{
		
		Arrays.sort(A);

		for (int i = 0; i <= A.length - 4; i++)
		{
			for (int j = i + 1; j <= A.length - 3; j++)
			{
				// k stores remaining sum
				int k = sum - (A[i] + A[j]);

				// check for sum k in sub-array A[j+1..n)
				int low = j + 1, high = A.length - 1;

				while (low < high)
				{
					if (A[low] + A[high] < k) {
						low++;
					}
					else if (A[low] + A[high] > k) {
						high--;
					}
					// Quadruplet with given sum found
					else
					{
						System.out.println( A[i] + " " + A[j] + " " +
										A[low] + " " + A[high] );
						low++;
						high--;
					}
				}
			}
		}
	}

	// main function
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = scn.nextInt();
		int A[] = new int[sum];
		for(int i=0;i<sum;i++)
			A[i]=scn.nextInt();
		

		quadTuple(A, n);
	}
}
