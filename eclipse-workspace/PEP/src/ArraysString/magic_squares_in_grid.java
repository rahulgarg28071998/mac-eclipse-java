package ArraysString;

import java.util.Scanner;

public class magic_squares_in_grid {
	
	static public int numMagicSquaresInside(int[][] grid) {
        if(grid == null || grid.length < 3 || grid[0] == null || grid[0].length < 3) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        for(int i = 0; i < m - 2; i++) {
            for(int j = 0; j < n -2; j++) {
                if(isMagicSquare(grid, i, j)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
	static private boolean isMagicSquare(int[][] grid, int i, int j) {
        if(grid[i + 1][j + 1] != 5) return false;
        if(grid[i][j] + grid[i + 2][j + 2] != 10) return false;
        if(grid[i][j + 2] + grid[i + 2][j] != 10) return false;
        for(int m = 0; m < 3; m++) {
            int sum1 = 0;
            int sum2 = 0;
            for(int n = 0; n < 3; n++) {
                if(grid[i + m][j + n] > 9 || grid[i + n][j + m] > 9 || grid[i + n][j + m] == 0 || grid[i + m][j + n] == 0) return false;
                sum1 += grid[i + m][j + n];
                sum2 += grid[i + n][j + m];
            }
            if(sum1 != 15) return false;
            if(sum2 != 15) return false;
        }
        return true;
    }
	  public static void main(String[] args) {
  	  	  Scanner scn = new Scanner(System.in);
  	  	  int r = scn.nextInt();
  	  	  int c = scn.nextInt();
  	  	  int[][] Input = new int[r][c];
  	  	  for (int i = 0; i < r; i++) {
  	  	  	  for (int j = 0; j < c; j++) {
  	  	  	  	  Input[i][j] = scn.nextInt();
  	  	  	  }
  	  	  }
  	  	  System.out.print(numMagicSquaresInside(Input));
  	  }
  
  	  // -----------------------------------------------------
  	  // This is a functional problem. Do not make changes to main
  	  // This function takes as input an array and integer k.
  	  // It should print required output.
  	  
}
