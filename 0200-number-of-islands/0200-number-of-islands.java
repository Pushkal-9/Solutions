class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    island(grid,i,j,vis);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void island(char[][] grid, int i, int j,boolean[][] vis){

        vis[i][j] = true;
        int[] row = {0,1,0,-1};
        int[] col = {1,0,-1,0};
        
        for(int k=0;k<row.length;k++){
            if(isValid(i+row[k],j+col[k],vis,grid)){
                island(grid,i+row[k],j+col[k],vis);
            }
        }
    }
    
    public boolean isValid(int i, int j, boolean[][] vis, char[][] grid){
       return i>=0 && i<grid.length && j>=0 && j<grid[0].length && !vis[i][j] && grid[i][j]=='1';
    }
}