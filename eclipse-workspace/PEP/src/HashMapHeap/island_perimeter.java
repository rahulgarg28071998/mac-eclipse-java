package HashMapHeap;

import java.util.Scanner;

public class island_perimeter {

	 public static void main(String[] args){
         Scanner scn= new Scanner(System.in);
         int row=scn.nextInt();
         int col=scn.nextInt();
         int[][] grid= new int[row][col];
         for(int i=0;i<row;i++){
             for(int j=0;j<col;j++){
                 grid[i][j]=scn.nextInt();
             }
         }
         System.out.print(islandPerimeter(grid));
     }
     // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input a matrix.
 	 // It should return perimeter value.
     public static int islandPerimeter(int[][] grid) {
          int islands = 0, neighbours = 0;
 
         for (int i = 0; i < grid.length; i++) {
             for (int j = 0; j < grid[i].length; j++) {
                 if (grid[i][j] == 1) {
                     islands++; // count islands
                     if (i < grid.length - 1 && grid[i + 1][j] == 1) 
                     {
                         neighbours++; // count down neighbours
                     }
                     if (j < grid[i].length - 1 && grid[i][j + 1] == 1) 
                     {
                         neighbours++; // count right neighbours
                     }
                 }
             }
         }
 
         return islands * 4 - neighbours * 2;
     }
}
