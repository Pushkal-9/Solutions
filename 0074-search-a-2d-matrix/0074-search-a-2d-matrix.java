class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;
        
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(matrix[mid][0]==target){
                return true;
            }
            else if(matrix[mid][0]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        if(low<=0){
            low=1;
        }
        
        return bst(matrix[low-1],target,0,matrix[low-1].length-1);
    }
    
    public boolean bst(int[] matrix, int target, int low, int high){
        
        while(low<=high){
            int mid = low +(high-low)/2;
            
            if(matrix[mid]==target){
                return true;
            }
            else if(matrix[mid]<target){
                return bst(matrix,target,mid+1,high);
            }
            else{
                return bst(matrix,target,low,mid-1);                
            }
        }
        
        return false;
    }
}