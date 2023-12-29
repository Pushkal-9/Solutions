class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        
        return bst(nums,target,low,high);
    }
    
    public int bst(int[] nums, int target, int low, int high){
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                return bst(nums,target,low,mid-1);
            }
            else {
                return bst(nums,target,mid+1,high);
            }
        }
        
        return -1;
    }
}