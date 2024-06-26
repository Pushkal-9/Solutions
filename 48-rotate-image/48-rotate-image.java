class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            int l=0,r=n-1;
            while(l<=r){
                temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}