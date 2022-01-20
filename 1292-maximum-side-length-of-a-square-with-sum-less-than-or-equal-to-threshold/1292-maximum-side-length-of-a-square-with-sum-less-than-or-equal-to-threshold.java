class Solution {
    public int maxSideLength(int[][] matrix, int threshold) {
    int count=0;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][]row=new int[rows+1][cols+1];
        int[][]col=new int[rows+1][cols+1];
        int[][]dp=new int[rows+1][cols+1];
        for(int i=0;i<=rows;i++){
            col[i][0]=0;
        }
        for(int i=0;i<=cols;i++){
            row[0][i]=0;
        }
        
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                dp[i][j]=matrix[i-1][j-1];
                
                if(dp[i][j]<=threshold){
                    count=Math.max(count,1);
                }
            }
        }
        
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                row[i][j]=dp[i][j]+row[i][j-1];
            }
        }
        
        for(int j=1;j<=cols;j++){
            for(int i=1;i<=rows;i++){
                col[i][j]=dp[i][j]+col[i-1][j];
                //System.out.println(i+" "+j+ " "+ col[i][j]);
            }
        }
        
        
        
        for(int i=2;i<=Math.min(rows,cols);i++){
            for(int j=rows;j>=i;j--){
                for(int k=cols;k>=i;k--){
                    dp[j][k]=matrix[j-1][k-1]+dp[j-1][k-1]+row[j][k-1]-row[j][k-i]+col[j-1][k]-col[j-i][k];
                    
                    if(dp[j][k]<=threshold){
                        count=Math.max(count,i);
                    }
                }
            }
        }
        return count;   
    }
}