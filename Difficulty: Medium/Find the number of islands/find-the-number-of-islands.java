class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        int[][] vis = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 'L' && vis[i][j] == 0){
                    cnt++;
                    bfs(i,j,vis , grid , n , m);
                }
            }
        }
        return cnt;
    }
    public void bfs(int row , int col , int[][] vis , 
    char[][]grid , int n , int m){
        vis[row][col] = 1;
        Queue<Pair> q= new LinkedList<>();
        
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q.poll();
            for(int drow = -1 ;  drow <= 1 ; drow++){
                for(int dcol = -1 ; dcol <=1 ; dcol++){
                    int nrow = r + drow;
                    int ncol = c + dcol;
                    if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m 
                    && grid[nrow][ncol] == 'L' && vis[nrow][ncol] == 0){
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }
}
class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}