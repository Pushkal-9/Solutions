class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    int count = island(i,j,vis,grid,0);
                    max=Math.max(max,count);
                }
            }
        }
        
        return max;
    }
    
    public int island(int i,int j, boolean[][] vis, int[][] grid,int size){
        vis[i][j]=true;
        size++;
        
        int[] row = {0,1,0,-1};
        int[] col = {1,0,-1,0};
        
        for(int k=0;k<row.length;k++){
            if(isValid(i+row[k],j+col[k],vis,grid)){
                size=island(i+row[k],j+col[k],vis,grid,size);
            }
        }
        
        return size;
    }
    
    public boolean isValid(int i, int j, boolean[][] vis, int[][] grid){
        return i>=0 && j>=0 && i<grid.length && j<grid[0].length && !vis[i][j] && grid[i][j]==1;
    }
}