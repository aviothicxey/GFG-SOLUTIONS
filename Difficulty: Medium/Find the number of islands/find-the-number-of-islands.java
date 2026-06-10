import java.util.*;

class Solution {
    public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int cnt = 0;

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {

                if(vis[row][col] == 0 && grid[row][col] == 'L') {
                    cnt++;
                    bfs(row, col, vis, grid);
                }
            }
        }

        return cnt;
    }

    public void bfs(int ro, int co, int[][] vis, char[][] grid) {

        vis[ro][co] = 1;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro, co));

        int n = grid.length;
        int m = grid[0].length;

        while(!q.isEmpty()) {

            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();

            for(int drow = -1; drow <= 1; drow++) {
                for(int dcol = -1; dcol <= 1; dcol++) {

                    int nrow = row + drow;
                    int ncol = col + dcol;

                    if(nrow >= 0 && ncol >= 0 &&
                       nrow < n && ncol < m &&
                       grid[nrow][ncol] == 'L' &&
                       vis[nrow][ncol] == 0) {

                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }
}

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}