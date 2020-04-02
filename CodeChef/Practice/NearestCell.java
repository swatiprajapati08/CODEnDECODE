/*Distance of nearest cell having 1 in a binary matrix
Given a binary matrix of N x M, containing at least a value 1. The task is to find the distance of nearest 1 in the matrix for each cell. The distance is calculated as |i1 – i2| + |j1 – j2|, where i1, j1 are the row number and column number of the current cell and i2, j2 are the row number and column number of the nearest cell having value 1.

Examples:

Input : N = 3, M = 4
        mat[][] = { 
                    0, 0, 0, 1,
                    0, 0, 1, 1,
                    0, 1, 1, 0 
                  }
Output : 3 2 1 0
         2 1 0 0
         1 0 0 1

For cell at (0, 0), nearest 1 is at (0, 3),
so distance = (0 - 0) + (3 - 0) = 3.
Similarly all the distance can be calculated.*/


import java.util.*;
import java.io.*;

public class Main {
static void distance(int[][] matrix) {
int m = matrix.length;
int n = matrix[0].length;
int[][] dist = new int[m][n];
boolean[][] visited = new boolean[m][n];
Queue<int[]> q = new LinkedList<int[]>();
for (int i = 0; i < matrix.length; i++) {
for (int j = 0; j < matrix[i].length; j++) {
if (matrix[i][j] == 1) {
visited[i][j] = true;
dist[i][j] = 0;
q.add(new int[] { i, j });
} else {
dist[i][j] = Integer.MAX_VALUE;
visited[i][j] = false;
}
}
}
int[][] moves = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
while (!q.isEmpty()) {
int[] t = q.poll();
for (int i = 0; i < moves.length; i++) {
int[] move = new int[] { t[0] + moves[i][0], t[1] + moves[i][1] };
if (isValidMove(move, m, n) && !visited[move[0]][move[1]]) {
dist[move[0]][move[1]] = Math.min(dist[move[0]][move[1]], dist[t[0]][t[1]] + 1);
visited[move[0]][move[1]] = true;
q.add(new int[] { move[0], move[1] });
}
}
}
for(int i=0;i<dist.length;i++)
  {
    for(int j=0;j<dist[i].length;j++)
    System.out.print(dist[i][j]+" ");
  }
  System.out.println();
}

static boolean isValidMove(int[] move, int m, int n) {
return move[0] >= 0 && move[0] < m && move[1] >= 0 && move[1] < n;
}
    
public static void main(String args[]) throws IOException {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int m=sc.nextInt();
int grid[][]= new int[n][m];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
grid[i][j]=sc.nextInt();
}
distance(grid);
}
}
}

